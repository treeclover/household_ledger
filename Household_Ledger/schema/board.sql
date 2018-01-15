drop table Board;


create table Board (
	idx number primary key,
	user_id varchar(15) not null,
	title varchar(50) not null,
	content varchar2(1000),
	view_count number,
	file_name varchar2(500),
	write_time date
)

create sequence autoup
	start with 1
	increment by 1
	nomaxvalue;

insert into Board values(autoup.nextval, 'aaaa', '테스트a', '테스트a입니다.', 1, '/aaaa/testa.jpg', sysdate);
insert into Board values(autoup.nextval, 'bbbb', '테스트b', '테스트b입니다.', 1, '/bbbb/testb.jpg', sysdate);

select * from Board;