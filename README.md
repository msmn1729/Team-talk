# Team-talk

![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fmsmn1729%2FTeam-talk&count_bg=%2306A1F1&title_bg=%23555555&icon=iconify.svg&icon_color=%23FFFFFF&title=hits&edge_flat=false)

- 제목: 팀톡(Team talk)
- 설명: 팀 단위로 아이디어 회의를 하거나 협업할 때 유용하게 활용할 수 있는 앱입니다.
- 시연 동영상 : [Youtube](https://www.youtube.com/watch?v=Ls5z1csZv2g)

---

- Back end
  - Spring boot
  - Java
  
- Front end
  - React Native

## 도메인 분석 설계

`signup | login`<br> 

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbenUzq%2Fbtq3hVaBiJ6%2FkFSFO2zaSmWkoVx8kYeoUk%2Fimg.png)

<br>  

`board | pin | card`<br> 
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FciDfeO%2Fbtq3czGPsCn%2F4Zbjd87gZuasoYjHNR0HPK%2Fimg.png)

<br>  

`card detail`<br> 
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdQQTqK%2Fbtq3czNC4n6%2Fk5vs89mYJC96rMIXjrpgAK%2Fimg.png)

<br>  

### 기능 목록(CRUD)
- user 기능
    - user 등록
    - user 조회
    - user 수정
    - user 삭제
   
- board 기능
    - board 등록
    - board 조회
    - board 수정
    - board 삭제

- pin 기능
    - pin 등록
    - pin 조회
    - pin 수정
    - pin 삭제

- card 기능
    - card 등록
    - card 조회
    - card 수정
    - card 삭제

- comment 기능
    - comment 등록
    - comment 조회
    - comment 수정
    - comment 삭제

- 기타 요구 사항
    - 로그인 후, 로그인 한 회원의 board들만 보여야 한다.
    - 특정 board 클릭 시 board의 title, pin들, card들이 보여야 한다.
    - board 구조상 board 안에 pin, pin 안에 card title까지 한번에 보여줘야 한다.
    - 특정 card 클릭 시, 카드 제목, 내용, 댓글들을 보여줘야 한다.
  
<br>

---
<br>

## API 

`User`<br> 
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FtiI0t%2Fbtq3i9M153T%2Fiiion0Lk9jMzN8PGR0hl51%2Fimg.png)


<br>

`Board`<br> 
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FboMElU%2Fbtq3hoxnfhD%2F1ZdFP2BEdVVnK9aseh74g0%2Fimg.png)


<br>

`Pin`<br> 
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fy2IRx%2Fbtq3haF7vQX%2FMjpBpNZ5wKZkyFVjKJOglK%2Fimg.png)


<br>

`Card`<br> 
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fuh5tv%2Fbtq3hoEauRc%2F6pfLQi0D0i5AeBvFMLejik%2Fimg.png)


<br>

`Comment`<br> 
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fb6TyPG%2Fbtq3dQBrcss%2FkRDpT3rJxoUmzyrZMQZj6k%2Fimg.png)



<br>

---
<br>

## 기능 확장
-  소셜 로그인
-  멤버 초대 기능
-  쿠키에 토큰 저장
-  파일 업로드
-  검색 기능
-  마이페이지 기능
<br>

---
   





