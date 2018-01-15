drop table RMoney;

create table RMoney(
	user_id varchar(15) not null,
	own_kind varchar(10) not null,
	own_type varchar(20),
	own_money number
);

insert into RMoney values('aaaa', 'realmoney', null, 150000);
insert into RMoney values('aaaa', 'bankbook', '국민', 500000);
insert into RMoney values('aaaa', 'card', '삼성', -250000);

select * from RMoney;