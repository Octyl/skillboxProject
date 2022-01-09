create table captcha_codes (
    id integer not null, code varchar(255),
    secret_code varchar(255),
    time datetime,
    primary key (id)) engine=InnoDB

create table global_settings (
    id integer not null,
    code integer not null,
    name varchar(255), value integer not null,
    primary key (id)) engine=InnoDB

create table post_comments (
    id integer not null,
    parent_id integer,
    text varchar(255),
    time datetime,
    post_id_id integer not null,
    user_id_id integer not null,
    primary key (id)) engine=InnoDB

create table post_votes (
    id integer not null,
    time datetime,
    value smallint not null,
    post_id integer,
    user_id integer,
    primary key (id)) engine=InnoDB

create table posts (
    id integer not null,
    is_active smallint,
    text varchar(255),
    time datetime,
    title varchar(255),
    view_count integer,
    user_id integer,
    primary key (id)) engine=InnoDB

create table tag2post (
    tag_id integer not null,
    post_id integer not null) engine=InnoDB

create table tags (
    id integer not null auto_increment,
    name varchar(255),
    primary key (id)) engine=InnoDB

create table users (
    id integer not null,
    code varchar(255),
    email varchar(255),
    is_moderator enum,
    name varchar(255),
    password varchar(255),
    photo varchar(255),
    reg_time datetime,
    primary key (id)) engine=InnoDB

create table hibernate_sequence (next_val bigint) engine=InnoDB
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )