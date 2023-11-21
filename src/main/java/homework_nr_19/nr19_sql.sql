create table studentsID(
id serial primary key,
name varchar(50) not null,
surname varchar(50) not null,
age int not null,
sex varchar(10) check (sex in('Female', 'Male'))
);

select * from studentsID;
insert into studentsID(name, surname, age, sex)
values
('Emily', 'Davis', 23, 'Female');

update studentsID set age = 24 where name = 'Emily' and surname = 'Davis';
delete from studentsID where name = 'Charlie' and surname = 'Brown';
select name, age from studentsID where sex = 'Female';
select name from studentsID where name like 'D%';