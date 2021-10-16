## "review" repository는 수업시간에 배운 내용을 복습하기 위해 만들었습니다.

====== ✔ Git Hub 명령어 정리 ✔ ======

git init : 기본 폴더를 레지스트리 폴더로 변경

ls : 폴더 안에 있는 파일 나열
ls -al : 숨김 파일까지 나열
cd 폴더명 : 하위폴더 안의 파일을 보고싶을 때 사용
cat (파일명.확장명) : 파일 내용 보기

git add 파일명.확장명 : 내가 만든 파일을 stage에 올림 (git add . 은 폴더 내 모든 파일을 올림)
git status : 버전 관리가 되고있는 repository의 폴더나 파일의 상태를 보여줌
	new file -> 새로운 파일
	modified -> 파일 업뎃
git commit -m "버전명" : 해당 파일에 버전명을 달아서 커밋
// git config --global user.email "내 이메일"
// git config --global user.name "내 이름"

git checkout : 이전 버전으로 돌아가기
git checkout - : 최신 버전으로 이동

git log : 커밋한 기록 보기
//(END) = Q 누르면 빠져나올 수 있음

* 삭제
 git rm 파일명.확장명 : 로컬+원격 레포지토리 파일 삭제
 git rm --cached 파일명.확장명 : 원격 레포지토리의 파일만 삭제
* 히스토리 정리.. 인데 최대한 하지말것
 git reset --hard 해쉬태그 (로컬/원격 다 과거로 돌아감)
 git push -f origin master

* 다운
git clone http://~~~ : 원격 리포지토리에서 복제(다운로드)
 (원격 레포지토리 설정 이름으로 내 폴더에 다운 받고 싶으면 (띄어쓰기1칸). 생략
  <-> 하위폴더 생성이 싫을 경우 현재 폴더 저장을 지칭하는 (띄어쓰기1칸). 입력
git pull origin master : 원격 리포지토리의 변경 사항을 로컬로 동기화

git remote add origin http://~~~~ : 어디에 올릴건지 repository 설정
git push origin master : 설정한 repository에 올림


====== ✔ Git Hub 오류 해결법 ✔ ======
! [rejected]        master -> master (fetch first)
원인    : 깃의 원격 저장소와 현재 로컬 저장소가 동기화되어있지 않을 때 발생
해결법 : git pull --rebase origin master

! [rejected] master -> master (non-fast-forward)
원인    : .gitignore 파일 또는 README.md 파일로 인해 발생
해결법 : git push origin +master (브랜치 이름 앞에 +를 붙힘 => 강제적)


====== ✔ Git Hub 시험 준비 ✔ ======
1. git clone http://~~~
2. 파일 수정
3. git add .
4. git commit -m ""
3. git push