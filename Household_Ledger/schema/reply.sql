drop table Reply;

create table Reply(
	idx number,
	reply_index number primary key,
	user_id varchar(15) not null,
	content varchar2(1000),
	write_time date
)

drop sequence replyup

create sequence replyup
	start with 1
	increment by 1
	nomaxvalue;

insert into Reply values(1, replyup.nextval, 'aaaa', '댓글테스트a입니다.', sysdate);
insert into Reply values(2, replyup.nextval, 'bbbb', '댓글테스트b입니다.', sysdate);

select * from Reply;