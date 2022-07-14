# java_python_sourcefile

java와 python 공부하는곳

20220627
 
#스테이지에 올리는 명령어(모든 파일) 
git add .

#실수로 올린 파일 삭제 명령어 
git rm -r --cached .

#하나만 올리고싶을때 
git add .log

#VScode에서 gitignore파일생성 후 안에 올리지 않을 파일 경로 작성
java_work/.metadata/*
제주도/*
.log

#파일지정 
git add READ.ME

#승인
git commit -m"20220627"

#서버 업로드
git push origin main
