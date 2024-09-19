package com.sepay.backend.payment.service;

import com.google.zxing.WriterException;

import java.io.IOException;

public interface QrService {
    byte[] createQR(String url) throws WriterException, IOException;
}
