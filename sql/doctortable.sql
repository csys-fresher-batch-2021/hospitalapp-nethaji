-- Doctor Table --

create table doctor(doctorId varchar(20) primary Key, doctorName varchar(50) not null,specialist varchar(50) not null,opFrom time not null,opTo time not null);
insert into doctor values ('D1','Vibin kumar','ENT');
insert into doctor values ('D2','Nethaji Pandiarajan','general');
Select * from doctor;
insert into doctor values ('D3','ponram', 'ENT');
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

--Appointment table --
create table appointmentbooking(appointmentid serial primary key,username varchar(40) not null,patientname varchar(50) not null,age int not null, phonenumber bigint not null, gender varchar(20),doctorid varchar(20) not null,appointmentdate date not null,status int default 0) 
select count (*),appointmentdate from appointmentbooking where appointmentdate='2021-06-04' AND doctorid='D1' group by appointmentdate