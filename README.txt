"review" repository는 
수업시간에 배운 내용을 복습하기 위해 만들었습니다.

====== ✔ Git Hub 명령어 정리 ✔ ======

git init : 기본 폴더를 레지스트리 폴더로 변경

ls : 폴더 안에 있는 파일 나열
ls -al : 숨김 파일까지 나열
cd 폴더명 : 하위폴더 안의 파일을 보고싶을 때 사용

git add 파일명.확장명 : 내가 만든 파일을 stage에 올림 (git add . 은 폴더 내 모든 파일을 올림)
git status : 버전 관리가 되고있는 repository의 폴더나 파일의 상태를 보여줌
	new file -> 새로운 파일
	modified -> 파일 업뎃
git commit -m "버전명" : 해당 파일에 버전명을 달아서 커밋
// git config --global user.email "내 이메일"
// git config --global user.name "내 이름"
git log : 커밋한 기록 보기

git remote add origin http://~~~~ : 어디에 올릴건지 repository 설정
git push origin master : 설정한 repository에 올림