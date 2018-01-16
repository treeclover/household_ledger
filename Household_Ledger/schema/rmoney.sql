drop table RMoney;

create table RMoney(
	user_id varchar(15) not null,
	own_kind varchar(30) not null,
	own_type varchar(30),
	own_money number(20, -2)
);

insert into RMoney values('aaaa', '현금', null, 260000);
insert into RMoney values('aaaa', '통장', '국민', 1530000);
insert into RMoney values('aaaa', '통장', '신한', 170000);
insert into RMoney values('aaaa', '신용카드', '삼성', -250000);

select * from RMoney;