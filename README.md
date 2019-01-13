# Lotto 번호 생성기

## 2018-12-03
* 게임선택(1~5)에 대한 결과 콘솔로 출력

![01](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto01.PNG?raw=true)


## 2018-12-10
* java AWT를 이용한 main GUI 구현
  
![02](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto02.png?raw=true) ![03](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto03.png?raw=true)


## 2018-12-11
* 종료버튼 event처리 구현


## 2018-12-13
* 수동배치로 디자인 수정, error, 결과 UI 디자인 추가
* run, design, event handlling으로 패키지 
* error dialog 구현
  
![04](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto04.png?raw=true) ![06](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto06.png?raw=true)

![05](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto05.png?raw=true)



## 2018-12-14
* 클래스 다이어그램 작성
* 구현
  * 게임 결과창(design)
  * 문자열 입력 예외처리
  * 매 게임을 중복되지 않는 숫자 Hashset으로 저장
    * ArrayList로 출력 Dialog에 전달 후 출력
  


![08](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto08.png?raw=true) ![07](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto07.png?raw=true)

![09](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto09.png?raw=true)

![10](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto10.png?raw=true)



## 2018-12-15
* Swing을 이용하여 GUI 구현
* JOptionPane을 이용하면 Error 처리를 위해 구현했던 Dialog가 필요 없어짐
  * 조금 더 간소화된 클래스다이어그램

![13](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto13.png?raw=true)

![11](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto11.png?raw=true)

![12](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto12.png?raw=true)

![14](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto14.png?raw=true)



## 2018-12-16
* 게임 개별 결과를 JPanel에 LineBorder를 더해 구분하여 보여주도록 변경

![15](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto15.png?raw=true)

## 2019-01-13
* JDBC 기능 추가
  * 1~840회차 결과 정보를 csv파일 형태로 DB에 INSERT 후 앱에서 조회 가능한 기능을 추가

```sql
--게임 회차, 수행일, 볼1~5 숫자, 보너스볼 숫자를 저장할 테이블 생성
CREATE TABLE lotto(
  num NUMBER CONSTRAINT pk_lotto PRIMARY KEY,
  input_date DATE NOT NULL,
  ball1 NUMBER NOT NULL,
  ball2 NUMBER NOT NULL,
  ball3 NUMBER NOT NULL,
  ball4 NUMBER NOT NULL,
  ball5 NUMBER NOT NULL,
  b_ball NUMBER NOT NULL
);
```

* SQL Loader를 사용하여 1~840회차에 대한 정보를 담은 csv파일을 INSERT

![16](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto16.png?raw=true)

* UI 변경, 추가

![17](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto17.png?raw=true)

* DB에서 정보를 읽어와 결과를 보여주는 화면

![18](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto18.png?raw=true)

* JDBC가 적용된 새로운 클래스 다이어그램

![19](https://github.com/younggeun0/younggeun0.github.io/blob/master/_posts/img/toyProjects/lotto/lotto19.png?raw=true)


