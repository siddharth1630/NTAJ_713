create user springnatraj identified by springnataraj;
grant connect to springnatraj;
grant all privileges to springnatraj;

create table Customer12(
    cno number(10) constraint customer_Pk primary key,
    cname varchar2(30),
    cadd    varchar2(30),
    pamt    number(12,2),
    intramt number(12,2)
);

create sequence seq1 START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 10000;

select * from customer12;
--====================================================================================
create table Player13(
    pno number(10) constraint Player_PK primary key,
    pname varchar2(30),
    team    varchar2(30),
    battingAvg    number(12,2),
    bowllingAvg number(12,2)
);

create sequence seq2 START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 10000;

select * from player13;

select * from employeedetails;
drop table employeedetails;
==========================================================================
create table BankAccount(
    accno Number(12) constraint bankAccountPK primary key,
    accnoHolderName varchar(20),
    amount Number(20,2)
);

insert into bankaccount values(1003,'ankit',50000);
commit;
SELECT * FROM BANKACCOUNT;
==============================================================================
select * from Customer;

create table Employee(
    empno number(5),
    ename varchar2(15),
    job varchar2(15),
    sal number(12,2),
    deptno number(5)
);
drop table employee;
select * from employee;
commit;
SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMPLOYEE WHERE JOB IN('ANALYST');
insert into employee values(1,'sid','developer',12221,4);
insert into employee values(2,'vivek','analyst',122341,4);
insert into employee values(3,'raj','developer',75221,5);
insert into employee values(4,'sumit','business',552341,2);
insert into employee values(5,'ankit','ceo',442341,5);
===================MINI PROJ 2========================
CREATE TABLE COVIDPATIENT(
    PNO NUMBER(5),
    PNAME VARCHAR2(20),
    PADDR VARCHAR2(30),
    PHOSP_NAME VARCHAR(30),
    PBED_NO NUMBER(5),
    PGUARD_NO NUMBER(11)
);
INSERT INTO COVIDPATIENT VALUES(1,'ANKIT','SULTANGANJ','SADAR',3,1233455);
commit;
SELECT PNO,PNAME,PADDR,PHOSP_NAME,PBED_NO,PGUARD_NO FROM COVIDPATIENT WHERE PHOSP_NAME='SADAR';
=============================
SELECT C_NO,C_NAME FROM CUSTOMER WHERE C_ADD='hyd';

create or replace procedure FETCHCUSTOMERDETAIL(
    addrs IN varchar2,details out sys_refcursor ) 
 AS  
BEGIN
    open details for
    SELECT C_NO,BILL_AMNT,C_ADD,C_NAME  FROM CUSTOMER WHERE C_ADD=addrs;
END;


create or replace procedure FETCH_CUSTOMER_DETAIL_BYADDRS(
    addrs IN varchar2,details out sys_refcursor ) 
 AS  
BEGIN
    open details for
    SELECT C_NO,BILL_AMNT  FROM CUSTOMER WHERE C_ADD=addrs;
END;

select * from employee_info;
drop table employee_info;
===========================================
select * from data_user;
insert into data_user values(90,'karan','delhi');
select * from phone_Number;
insert into phone_Number (mobile_no,provider,type) values(3423432,'aircle','tour');
commit;
drop table data_user;
drop table phone_Number;

==============================

CREATE TABLE LOGIN(
    UNAME VARCHAR2(30) PRIMARY KEY ,
    PASSWORD VARCHAR2(40)
);
DROP TABLE LOGIN;
SELECT * FROM LOGIN;
INSERT INTO LOGIN VALUES('SID','GUPTA');
INSERT INTO LOGIN VALUES('VKG','123');
commit;

CREATE OR REPLACE PROCEDURE P_AUTHENTICATION (
    USERNAME IN VARCHAR2,
    PASS   IN  VARCHAR2,
    RESULT  OUT VARCHAR2
)
AS
    CNT NUMBER(2);
BEGIN
    SELECT COUNT(*) INTO CNT FROM LOGIN WHERE UNAME=USERNAME AND PASSWORD=PASS;
    IF(CNT<>0) THEN
        RESULT:='VALID CREDENTIAL';
    ELSE
        RESULT:='INVALID CREDENTIAL';
    END IF;
END;

SELECT * FROM EMPLOYEE;
DESC EMPLOYEE;
CREATE SEQUENCE ENO_SEQ MINVALUE 1 MAXVALUE 10000 INCREMENT BY 1 START WITH 100; 
SELECT DISTINCT(DEPTNO) FROM EMPLOYEE WHERE DEPTNO IS NOT NULL ORDER BY DEPTNO;