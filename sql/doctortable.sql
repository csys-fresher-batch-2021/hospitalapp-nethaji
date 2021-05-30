-- Doctor Table --

create table doctor(doctorName varchar(50) primary key,specialist varchar(50) not null);
insert into doctor values ('Vibin kumar','ENT');
insert into doctor values ('Nethaji Pandiarajan','general');
Select * from doctor;
insert into doctor values ('ponram', 'ENT');
select * from doctor;
DELETE FROM doctor where doctorName = 'Nethaji Pandiarajan';

-- Patient Table --

create table patient(patientName varchar(50) primary key, patientAge int not null , patientGender varchar(50) not null, reason varchar(50) not null);
insert into patient values('Kannan',21,'male','fever');
select * from patient;
insert into patient values ('Rohit',41,'male','Heart Problems');
insert into patient values ('Isika',30,'female','Eye problems');

-- Medicine Table --
create table medicine(medicineName varchar(50) primary key, price numeric(6,2) not null , expiryDate Date not null,usedIn int not null, quantity int not null);
insert into medicine values ('Paracetomal',10.00,'2021-06-10',12,20);
insert into medicine values ('Eye Drops',40.00,'2022-11-10',,40);
insert into medicine values ('Benadryl',70.00,'2023-01-13',,35);
select * from medicine;

-- User Table --
create table usertable (username varchar(50) primary key,bDate Date not null,age int not null, phoneNumber bigint, email varchar(50),pass varchar(40),gender varchar(50))
insert into usertable values ('Nethaji','14-10-1999',21,9751713840,'nethaji1410@gmail.com','pass1234','male');