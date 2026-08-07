drop database if exists mydb0805; # [1] 데이터베이스 삭제 # ctrl+엔터
create database mydb0805;   # [2] 데이터베이스 생성 
show databases; # [3] 데이터베이스 목록 
use mydb0805; # [4] 사용할 데이터베이스 선택
# ----------------------------------------------------------------- # 
# DDL : 데이터베이스/테이블 생성/삭제/수정 질의어 ( ** 트랜잭션 불가능 / 오토커밋 ** )
# 1) 테이블 생성 : 1. 테이블생성할 데이터베이스 활성화   2)  create table 테이블명( 속성명 타입, 속성명 타입 );
create table test1( 필드명1 int , 필드명2 double , 필드명3 text );
# 2) 테이블 목록 조회 
show tables;
# 3) 특정 테이블의 속성 확인 
describe test1;
# 4) 특정 테이블 삭제
drop table test1;
# 5) 테이블 수정 
# 1) 필드/속성 추가 
alter table test1 add 필드명4 float;
# 2) 필드/속성의 타입 수정 
alter table test1 modify 필드명3 longtext;
# 3) 필드/속성명 , 타입 수정
alter table test1 change 필드명1 필드명5 bigint;

# 6) 테이블 이름 변경 
rename table test1 to new_test1;

# 7) 테이블내 모든 레코드(행/데이터) 삭제 
truncate table new_test1;
# ----------------------------------------------------------------- # 
# 테이블의 속성/필드 타입 *DBMS 회사마다 차이*
use mydb0805;
-- create table test2( 필드명 타입 , 필드명 타입 , 필드명 타입 );
create table test2( 
    정수필드1 tinyint , 정수필드2 smallint , 정수필드3 mediumint , 
    정수필드4 int     , 정수필드5 bigint   , 정수필드6 int unsigned , 
    -- unsigned 부호없다. tinyint(1바이트 -128 ~ 127 ) --> 0 ~ 225
    실수필드1 float   , 실수필드2 double   , 실수필드3 decimal , 
    -- decimal 문자타입 이면서 소수점 오차 없음 
    날짜필드 date     , 시간필드 time      , 날짜시간필드 datetime , 
    문자필드1 char(3) , 문자필드2 varchar(3) , 문자필드3 text , 문자필드4 longtext , 
    -- char( 문자 고정길이 ~255 )  vs  varchar( 문자 가변길이 ~255 )
    -- 예] "수박" --> char( [수][박][x] ) vs varchar( [수][박] )
    -- 사진이 포함된 게시물내용 저장시 : 4GB 까지 가능한 longtext 권장
    논리필드 boolean -- boolean(1비트) --> tinyint(1), 마지막 필드타입 뒤로 , 넣지 마세요!
);
describe test2; -- 테이블 속성 확인
#--------------------------------------------------------------------------#
#속성/필드 제약조건
CREATE table test3 {
    필드명1 tinyint not null, -- 해당 필드/속성에는 null 저장할 수 있도록 설정 * 값이 null 이면 오류발생
    필드명2 smallint unique, -- 해당 필드/ 속성 에는 중복값을 저장할 수 없도록 설정 * 값이 다른 레코드와 같다면 
    필드명3 int default 100 , -- 해당 필드/속성 에 레코드(행) 추가시 기본값이 10 대입된다.
    필드명4 datetime default now(), --예] 레코드 삽입시 현재날짜/시간/now() 자동 대입된다.
    필드명5 bigint auto_increment , -- 레코드(행) 삼입시 자동으로 순서번호 대입된다. , 1 2 3 4 5 6 ~

}


# 예제 화면과 게시판 서비스 ---------------------------------------------------#
drop database if exists boardService0805; #1 데이터베이스 존재하면 삭제
create database boardService0805; #2 데이터베이스 생성한다.
use boardService0805; # 3 데이터베이스 활성화한다.
create table member { # 4} 회원테이블 생성한다.BIGINT
    mno int auto_increament , --자동회원번호
    constraint primary key( mno ) , --회원번호 pk 설정
    mid varchar(30) not null unique , --회원아이디 이면서 최대30글자, 공백불가능 , 중복불가능 설정
    mpwd varchar(10) not null, -- 회원비밀번호 이면서 최대 20글자 , 공백불가능 , 중복 가능 설정
    mname varchar(30) not null, -- 회원닉네임
    mdate datetime default now() -- 회원가입 날짜 / 시간

    create table board (  # 5) 게시물테이블 생성한다.
    big int auto_increment , constraint primary key (bno)
    btitle varchar(255) ,
    bcontent longtext,
    bdate datetime default now() ,
    bview int default 0 ,
    mno int ,
    constraint foreign key (mno) reference meber( mno_pk )