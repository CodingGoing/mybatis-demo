

create table account (
    account_id bigint auto_increment ,
    username varchar(80) not null,
    password varchar(80) not null,
    status varchar(20)  null,
    address varchar(80) not null,
    phone varchar(80) not null,
    constraint pk_account primary key (account_id)
);

