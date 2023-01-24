## 이름 - 은행게임

<img src="menu4.png"  height="300px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>

## 기능개요 

- 예금을 하면 신용등급이 올라감 
- 초기 등급은 10등급
- 한번 예금할때만다 1등급이 올라감

## 다형성개요 

- MainBank interface를 만들고 KakaoBank,Toss,Kbank가 implements  한다
- MainBank에서 withDraw() ,deposit(), getBalance() 선언하여 메소드구현을 강제한다. 
- KakaoBank,Toss,Kbank 클래스가 withDraw() ,deposit (), getBalance() 를 @Override한다.
- Application 클래스에서 MainBank타입으로 각 은행의 인스턴스를 생성하고 은행의 메소드를 이용하여 각각의 은행에서 기능을 수행한다
- 신용등급은 MainBank에서 관리한다.



## 커뮤니케이션 다이어그램
### 1.잔액조회

<img src="communication_balance.png"  height="600px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>

### 2.인출
<img src="communication_widraw.png"  height="600px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>
### 3.예금
<img src="communication_deposit.png"  height="600px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>


## 클래스다이어그램 

![Alt text](cd.png)
-
-
-


## 데이터베이스 

- 

## 메뉴

- 초기화면 - 은행을 선택하세요
- 메뉴화면 : 1. 카카오뱅크 2.토스뱅크 3.k뱅크
- 기능 : 예금,출금,조회
- 결과화면 : 잔액정보, 신용등급 출력

---

## 📈 과제 진행 요구사항

- 다형성을 이용한다.
 

