drop table Household;

create table Household(
	user_id varchar(15) not null,
	own_type varchar(20),
	rec varchar(8) not null,
	price number,
	own_money number,
	use varchar(50),
	use_time varchar(25)
)

insert into Household values('aaaa', null, 'output', 25000, 150000, '커피값(내기에서 짐)', '2018-01-12 12:33');
insert into Household values('aaaa', '국민', 'output', 30000, 500000, '폰 충전케이블 구매', '2018-01-14 15:34');
insert into Household values('aaaa', '삼성', 'output', 50000, -250000, '옷 할부값', '2018-01-15 10:18');
insert into Household values('aaaa', null, 'input', 50000, 200000, '5만원권 주웠음', '2018-01-16 10:59');
insert into Household values('aaaa', '신한', 'input', 20000, 120000, '예비군 수당', '2018-01-08 16:43');
insert into Household values('aaaa', null, 'input', 50000, 250000, '5만원권 주웠음', '2018-01-05 13:20');
insert into Household values('aaaa', '국민', 'input', 30000, 530000, '중고품 팔았음', '2018-01-02 12:48');

select * from Household;