create database if not EXISTS intellif_base;
create table if not EXISTS t_user(
id bigint primary key auto_increment,
name varchar(255),
age int
)