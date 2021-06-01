## **To-Do-List**
---

### **1. 요구사항**

 - 추가 요구 외의 기능들은 체크리스트처럼 설계 할 것
 - 한 눈에 보기 간단하고 명확하게 구성
 - 할 일 카테고리(폴더) 생성 기능
    -  집, 학교, 쇼핑 등의 이름으로 카테고리 생성 가능

 - 아래 이미지처럼 한 페이지로 구성되도록 설계
  1) 체크박스 선택 시 완료 탭으로 이동
  2) 리스트 맨 왼쪽에 중요표시  체크 박스를 하나 생성하여 체크 시 최상위로 올라오도록 설정

<br/>

### 2. **테이블 정의 ( ERD )**

![ERD](https://user-images.githubusercontent.com/70880695/119300444-ba828200-bc9b-11eb-8c0e-e399b2aaf5a8.png)

<br/>

### 3. 개발 환경

[백엔드]

 - JAVA 11  ( spring boot 2.4.3 )

lib : JPA, Spring Security, Lombok

UI  : html + css + javascript 

DB : mysql 

<br/>

### 4. API 설계

![api-design](https://user-images.githubusercontent.com/70880695/119299819-a5f1ba00-bc9a-11eb-945e-e640ea2655c4.PNG)

<br/>

### 5. 구현 완료 시 추가 구현

 1) 검색 기능
 2) 할 일 진행 상황을 %로 볼 수 있게 표시
 3) 로그인 기능 
