# [1일 1알] 알고리즘 스터디
## Direction
꾸준한 알고리즘 학습과 코드 리뷰를 통해 개발자로서의 역량을 성장시키고자 합니다.

</br>

## Rules
- 2022.08.01 ~ 무기한
-  `평 일` : 20:30 ~ 22:30 (라이브 스터디)</br> 
    `주 말` : 토요일 오후 2시 Webex 코드 리뷰 (필참)
- 매주 조별 [This Week's Goals] 필수 문제 풀기
- 작성한 코드 깃허브에 커밋
- 주말에 각자 작성한 코드 리뷰 및 코멘트
- 스터디 세부 규정은 글 하단 참고

</br>

## Participants
- **A조**
    - [이은혁](https://github.com/itmakesmesoft)</br>
    - [김유나](https://github.com/yuna872)</br>
    - [최종욱]()</br>
    - [류한일]()</br>
    - [양가영]()</br>

- **B조**
    - [신한국](https://github.com/dlfnek)</br>
    - [나혜승](https://github.com/HyeseungNA)</br>
    - [김현서]()</br>
    - [박현영]()</br>
</br>


## :high_brightness:This Week's Goals 
</br>

<table>
    <tr style="text-align:center !important;">
        <td>주차</td>
        <td>조</td>
        <td>분류</td>
        <td>필수문제</td>
        <td>선택문제</td>
    <tr>
        <td rowspan='2'>1주차</td>
        <td>A조</td>
        <td>문자열, 기본수학</br> (소인수분해, 수열, 소수판별) </td>
        <td>
        1. <a href="https://www.acmicpc.net/problem/2941">크로아티아 알파벳</a><br/> 
        2. <a href="https://www.acmicpc.net/problem/1712">손익분기점</a><br/>
        3. <a href="https://www.acmicpc.net/problem/2869">달팽이는 올라가고 싶다</a><br/> 
        4. <a href="https://www.acmicpc.net/problem/11653">소인수분해</a><br/> 
        5. <a href="https://www.acmicpc.net/problem/9020">골드바흐의 추측</a>
        </td>
        <td>
        + <a href="https://www.acmicpc.net/problem/10250">ACM 호텔</a></br>
        + <a href="https://www.acmicpc.net/problem/4948">베르트랑 공준</a>
        </td>
    </tr>
    <tr>
        <td>B조</td>
        <td>반복문</br>문자열</td>
        <td>
        1. <a href="https://www.acmicpc.net/problem/11654">아스키 코드</a><br/> 
        2. <a href="https://www.acmicpc.net/problem/5622">다이얼</a><br/> 
        3. <a href="https://www.acmicpc.net/problem/1110">더하기 사이클</a></br>
        4. <a href="https://www.acmicpc.net/problem/8958">OX퀴즈</a></br>
        5. <a href="https://www.acmicpc.net/problem/2884">알람시계</a>
        </td>
        <td>
        + <a href="https://www.acmicpc.net/problem/1712">손익분기점</a></br>
        + <a href="https://www.acmicpc.net/problem/2941">크로아티아 알파벳</a>
        </td>
    </tr>
</table>

</br>


## 초기 세팅(중요)
1. __스터디 Repository로 들어가 우측 상단의 `Fork` 버튼 클릭__

2. __본인의 Repository에 스터디 Repo가 생성__

3. __본인의 remote 스터디 Repository로 들어가 주소 복사 및 로컬 폴더에 clone 진행__

4. __로컬 Repo 폴더에 본인 이름(한글) 폴더 생성 후, 스터디 인증 파일 넣기__
</br>

<img src="./etc/참고이미지.png" style="position: relative; margin-left: 45px; margin-bottom: 20px;">

</br>

5. __로컬 Repository (본인 이름 폴더 내)에서 Git Bash 실행__</br>

6. __git add, commit 실행__
   
    ```
    $ git add 업로드 파일 이름
    $ git commit -m "커밋내용"
    ```

    __❗ <오류 발생 시 대처법> ❗__</br>
    - 깃허브 remote Repo와 local Repo의 저장된 데이터가 일치하지 않아서 생기는 문제</br>
    일반적으로 remote Repo에 저장된 파일이 local Repo에는 존재하지 않는 경우 발생.
        ```
        ! [rejected]          main -> main (fetch first)
        error: failed to push some refs to 'https://github.com/...
        ```
        따라서, git pull을 통해 로컬 저장소의 파일을 내려받아야 함.</br>
        본인이 업로드할 파일 삭제되지 않게 주의!</br>
        ```
        $ git pull
        ```
        </br>

    - 브런치가 `main`이 아닌 경우, 다시 `main`으로 설정해주세요
        ```
        $ git checkout main
        ```
    </br>

7. __git push__ </br>
    ```
    $ git push
    ```


8. __Pull Request 진행__</br>
push 완료 후 본인 계정의 github 저장소에 들어오면 Compare & pull reqeust 버튼이 활성화됨.
해당 버튼을 선택하여 메시지를 작성하고 PR을 생성.
</br>
<img src="./etc/1.png" style="position: relative; margin-left: 45px; margin-bottom: 20px;">
</br>
<img src="./etc/2.png" style="position: relative; margin-left: 45px; margin-bottom: 20px;">
</br>


[세팅 방법 참고](https://wayhome25.github.io/git/2017/07/08/git-first-pull-request-story/)

</br>


### :heavy_exclamation_mark: 인증 파일 관련 안내
- 인증 파일은 반드시 .py 확장자 파일이어야 함
- 인증 파일명'은 `알고리즘 문제 사이트 이름_문제번호_문제이름.py`로 수정할 것
- ex) <div>"백준_11654_아스키 코드.py"</br>
"SWEA_14557_카드 제거.py"</div>

</br>

### :bangbang: 커밋 내용 관련 안내
- 커밋 내용도 파일명과 마찬가지로 작성
- ex) <div>"백준_11654_아스키 코드"</br>"SWEA_14557_카드 제거"</div>

</br>

## Links

- [스터디 공유드라이브](https://drive.google.com/drive/folders/1mL6Mk0UTp6gN1Bbn0btMbsI6qtlNgJW-)
- [백준 온라인 저지](https://www.acmicpc.net/step)
- [프로그래머스](https://school.programmers.co.kr/learn/challenges)
- [Solved.ac](https://solved.ac/problems/level)

</br>

<details style="margin-left : 25px !important;">
    <summary>Rule Details</summary>
    <div markdown="1">
        <table>
            <tr style="text-align: center !important; font-weight: bold !important;">
              <td>규정</td><td>내용</td>
            </tr>
            <tr>
                <td>라이브 스터디 무단 결석</br>(부득이한 사정으로 참석 불가능한 경우</br>당일 오후 6시 까지 미리 공지)</td><td>경고 1회</td>
            </tr>
            <tr>
                <td>코드리뷰 무단 결석</br>(부득이한 사정으로 참석 불가능한 경우</br>전일 오후 6시 까지 미리 공지)</td><td>경고 1회 및 벌칙 코드 작성</td>
            </tr>
            <tr>
                <td colspan= '2'> - 지각 2회 시 1회 경고</br> - 경고 3회 누적 시 퇴출</br> - 매월 1일 경고 리셋</td>
            </tr>
        </table>
    </div>
</details>
</br>
