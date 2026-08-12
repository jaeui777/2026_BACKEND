drop database if exists mydb0807;

create database mydb0807;

use mydb0807;

create table test ( -- ctrl+shift+enter : 전체실행 , ctrl+enter : 한줄실행
no int auto_increment ,
constraint primary key(no) ,
name varchar(30) not null unique ,
count int default 2
) -- DML : 조작이 , 1) insert 레코드삽입 2) select 레코드조회 3) update 레코드수정 4) delete 레코드 삭제
-- 레코드란? 테이블내 행/가로 단위
# [1] insert : insert into 테이블명 (속성명1 , 속성명2) values(값1, 값2)

insert into test( 번호 , 이름 , 개수 ) values(1, "유재석" , 10);
insert into test( 이름 , 개수 ) values("강호동", 20); --번호 값 제외한 삽입


# [2] select : select * from 테이블명
select * from test;