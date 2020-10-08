/*  car rental system - Insert values */

insert into rentals values('R001','C007','V004','2018-03-10','2018-03-10',800,9000);
insert into rentals values('R002','C001','V007','2018-03-11','2018-03-12',200,3000);
insert into rentals values('R003','C007','V003','2018-04-15','2018-04-15',100,1500);
insert into rentals values('R004','C007','V001','2018-05-16','2018-05-18',1000,10000);
insert into rentals values('R005','C004','V005','2018-05-10','2018-05-12',900,11000);
insert into rentals values('R006','C004','V006','2018-05-20','2018-05-21',200,2500);


 /*  Car rental system - add new column */

 alter table cars add Car_regno varchar(10);


 /*  Car rental system - Create Table */

  create table owners
(
owner_id varchar(10) primary key,
owner_name varchar(20),
address varchar(20),
phone_no bigint,
email_id varchar(20)
);