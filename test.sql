##use test;

drop table if exists user;

create table user
(
    id BIGINT(20) NOT NULL COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT(11) NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

insert into user (id,name,age,email) values
(1,'Jone',18,'test@baomidou.com'),
(2,'Jack',20,'test@baomidou.com'),
(3,'Tom',28,'test@baomidou.com'),
(4,'Sandy',21,'test@baomidou.com'),
(5,'Billie',24,'test@baomidou.com');