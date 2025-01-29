![3D_SongE](https://github.com/yesslee/song-e-pay/blob/main/frontend/public/images/3D_SongE.png)

# SongE-Pay
> 방한 외국인 관광객 타겟의 한국에서 금융 거래와 여행 일정을 쉽고 편리하게 관리 가능한 글로벌 금융 서비스 플랫폼

![Thumnail](https://github.com/yesslee/song-e-pay/blob/main/readme_img/Thumnail.png)

KB IT's Your Life 5기 종합실무프로젝트 - 최우수상 수상

## 📖 Description
환율 확인, 환전, 송금, 결제를 한 곳에서 할 수 있는 서비스를 통해 외국인 관광객들이 편리하게 한국에서 금융 서비스를 이용할 수 있도록 지원합니다.
- [🍄 프로젝트 발표 자료(Click!)](https://github.com/yesslee/song-e-pay/blob/main/documents/P7-3_%EC%B5%9C%EC%A2%85%EB%B0%9C%ED%91%9CPPT.pdf)
- [🎥 홍보 영상(Click!)](https://drive.google.com/file/d/13QEDmfQn_LGDyKefaQoQu02f7Czppo63/view?usp=sharing)
- [🎥 시연 영상(Click!)](https://drive.google.com/file/d/1zcLK3nyzw2v_HL8ic5oXz7A0X4F2g1fV/view?usp=sharing)

## ✨ Main Features
- 실시간 환율 정보 제공
- 환전 및 송금 기능
- QR코드를 통한 간편한 결제 기능
- 환율 알림 및 자동 환전 기능
- 주변 은행 위치 확인 및 검색
- 여행 일정 관리 및 여행 상품 결제
  - 결제 정보 기반 캘린더 일정 자동입력(숙박, 식사, 쇼핑 등)
- 다국어 지원(한국어, 영어, 베트남어, 인도네시아어)
- 반응형 페이지

## 🪧 Demo
### Main Page
![main.png](https://github.com/yesslee/song-e-pay/blob/main/readme_img/Main.png)

### My Page
![my.png](https://github.com/yesslee/song-e-pay/blob/main/readme_img/Mypage.png)

### Exchange Rate Page
![exchangerate.png](https://github.com/yesslee/song-e-pay/blob/main/readme_img/ExchangeRate.png)

### Map Page
![map.png](https://github.com/yesslee/song-e-pay/blob/main/readme_img/Map.png)

### Reservation Page
![reservation.png](https://github.com/yesslee/song-e-pay/blob/main/readme_img/Reservation.png)

### Schedule Page
![schedule.png](https://github.com/yesslee/song-e-pay/blob/main/readme_img/Schedule.png)


## 🔧 Skill Stack
- Language: JavaScript, JAVA
- Library & Framework : Vue.js(3), Node.js, Spring(Legacy)
- Database : MySQL
- Deploy: GCP

## ⚙️ System Architecture
![SystemArchitecture](https://github.com/yesslee/song-e-pay/blob/main/documents/%EC%8B%9C%EC%8A%A4%ED%85%9C%EC%95%84%ED%82%A4%ED%85%8D%EC%B2%98.png)

## 📂 Project Structure
### Front-End
```
src
├── api
├── assets
│   ├── css
│   ├── fonts
│   │   └── LINE_Seed_Sans
│   ├── img
│   │   ├── icons
│   │   ├── illustrations
│   │   ├── logos
│   │   ├── shapes
│   │   └── small-logos
│   ├── js
│   └── scss
│       └── argon-dashboard
├── components
│   ├── footer
│   ├── modal
│   ├── navbars
│   ├── sidenav
│   ├── signIn
│   ├── signUp
│   ├── templates
│   ├── viewsComponents
│   └── yb_templates
├── constants
├── js
├── locales
│   ├── csv
│   └── json
├── router
├── stores
├── utils
└── views
    ├── Cards
    ├── Chart
    ├── Charts
    ├── PageLayout
    ├── Schedule
    ├── Templates
    │   └── Charts
    ├── admin
    ├── error
    ├── exchangeRate
    ├── histories
    ├── home
    ├── main
    ├── maps
    ├── myPage
    ├── payment
    ├── profile
    ├── reservation
    ├── signIn
    └── signUp
```
### Back-End
```
src/main
├── java/com/sepay
│   └── backend
│       ├── S3
│       │   ├── config
│       │   ├── controller
│       │   └── service
│       ├── admin
│       │   ├── controller
│       │   ├── mapper
│       │   └── service
│       ├── common
│       │   ├── pagination
│       │   └── util
│       ├── config
│       ├── controller
│       ├── eventSchedule
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── exception
│       ├── exchange
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── exchangereservation
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── history
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── mail
│       │   ├── config
│       │   ├── controller
│       │   ├── dto
│       │   └── service
│       ├── myaccount
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── notification
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── payment
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── reservation
│       │   ├── controller
│       │   ├── dto
│       │   ├── mapper
│       │   └── service
│       ├── scheduler
│       │   ├── config
│       │   └── scheduled
│       ├── security
│       │   ├── account
│       │   │   ├── domain
│       │   │   ├── dto
│       │   │   └── mapper
│       │   ├── config
│       │   ├── exception
│       │   ├── filter
│       │   ├── handler
│       │   ├── service
│       │   └── util
│       ├── setting
│       │   ├── controller
│       │   ├── mapper
│       │   └── service
│       └── user
│           ├── controller
│           ├── dto
│           ├── mapper
│           └── service
├── resources
│   └── mapper
└── webapp
    └── resources
```

## 👨‍👩‍👧‍👦 Developer

| <img src="https://github.com/BoyunLee.png" width="80"> | <img src="https://github.com/sojinnuna.png" width="80"> | <img src="https://github.com/ybon1107.png" width="80"> | <img src="https://github.com/ssooomm.png" width="80"> |  <img src="https://github.com/yesslee.png" width="80"> | <img src="https://github.com/cyh000127.png" width="80"> | <img src="https://github.com/ddubuk228.png" width="80"> |
| :----------------------------------------------------: | :------------------------------------------------------: | :--------------------------------------------------------: | :------------------------------------------------------: | :----------------------------------------------------: | :------------------------------------------------------: | :--------------------------------------------------------: |
|         [이보윤](https://github.com/BoyunLee)          |         [김소진](https://github.com/sojinnuna)          |         [이예본](https://github.com/ybon1107)          |         [오수민](https://github.com/ssooomm)          |         [이예슬](https://github.com/yesslee)          |         [최윤혁](https://github.com/cyh000127)          |         [황정현](https://github.com/ddubuk228)          |
|                          팀장                          |                           팀원                           |                            팀원                            |                           팀원                           |                           팀원                          |                           팀원                           |                            팀원                            | 


