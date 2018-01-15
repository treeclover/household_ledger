drop table Users;

create table Users (
	user_id varchar(15) primary key,
	user_pwd varchar(15) not null,
	name varchar(25) not null,
	birth_date varchar(10) not null,
	email_addr varchar(30),
	div varchar(2)
);

insert into Users values('aaaa', '1234', '테스트a', '1992-03-07', 'aaaa@gmail.com', 'm');
insert into Users values('bbbb', '1234', '테스트b', '1997-04-12', 'bbbb@naver.com', 'm');
insert into Users values('helloMan', '1234', '테스트', '1978-08-16', 'helloMan@yahoo.co.kr', 'u');

select * from Users;