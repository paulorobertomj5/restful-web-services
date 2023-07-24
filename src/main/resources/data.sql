insert into user_details(id, birth_date, name) values (1001, current_date(), 'Jorge' );
insert into user_details(id, birth_date, name) values (1002, current_date(), 'Maria' );
insert into user_details(id, birth_date, name) values (1003, current_date(), 'Pedro' );

insert into post(id, description, user_id) values (1000, 'mensagem 1', 1001 );
insert into post(id, description, user_id) values (1001, 'mensagem 2',1002);
insert into post(id, description, user_id) values (1002, 'mensagem 3',1003 );
insert into post(id, description, user_id) values (1003, 'mensagem 123',1001 );
