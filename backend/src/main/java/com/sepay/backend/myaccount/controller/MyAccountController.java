package com.sepay.backend.myaccount.controller;

import com.sepay.backend.myaccount.dto.AccountDTO;
import com.sepay.backend.myaccount.dto.DTORequest;
import com.sepay.backend.myaccount.dto.KrwAccountDTO;
import com.sepay.backend.myaccount.dto.SongAccountDTO;
import com.sepay.backend.myaccount.service.MyAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/my-accounts")
public class MyAccountController {

    final MyAccountService myAccountService;

    //송이 계좌 잔액 조회
    @PostMapping("/krwbalance")
    public ResponseEntity<?> getKrwAccountBalance(@RequestParam String krwNo) {
        return ResponseEntity.ok(myAccountService.selectKrwBalance(krwNo));
    }
    //원화 계좌 잔액 조회
    @PostMapping("/songebalance")
    public ResponseEntity<?> getSongAccountBalance(@RequestParam String songNo) {
        return ResponseEntity.ok(myAccountService.selectSongBalance(songNo));
    }
    // 충전
    @PostMapping("/deposit")
    public ResponseEntity<?> deposit(@RequestBody DTORequest request) {
        // DepositRequest 클래스를 사용하여 accountDTO, songAccountDTO 및 amount를 받습니다.
        return ResponseEntity.ok(myAccountService.deposit(request.getAccountDTO(), request.getSongAccountDTO(), request.getHistoryDTO(), request.getAmount()));
    }

    // 환불
    @PostMapping("/refund")
    public ResponseEntity<?> refund(@RequestBody DTORequest request) {
        return ResponseEntity.ok(myAccountService.refund(request.getAccountDTO(), request.getSongAccountDTO(), request.getHistoryDTO(), request.getAmount()));
    }

    // 환전
    @PostMapping("/exchange")
    public ResponseEntity<?> exchange(@RequestBody DTORequest request) {
        return ResponseEntity.ok(myAccountService.exchange(request.getSongAccountDTO(), request.getKrwAccountDTO(), request.getHistoryDTO() , request.getAmount(), request.getExchangeRate()));
    }

    // 환급
    @PostMapping("/re-exchange")
    public ResponseEntity<?> reExchange(@RequestBody DTORequest request) {
        return ResponseEntity.ok(myAccountService.reExchange(request.getSongAccountDTO(), request.getKrwAccountDTO(), request.getHistoryDTO() , request.getAmount(), request.getExchangeRate()));
    }

    // 송금
    @PostMapping("/transfer")
    public ResponseEntity<?> transfer(@RequestBody DTORequest request) {
        return ResponseEntity.ok(myAccountService.transfer(request.getKrwAccountDTO(), request.getHistoryDTO(), request.getAmount(), request.getTarget_krwNo()));
    }
}
