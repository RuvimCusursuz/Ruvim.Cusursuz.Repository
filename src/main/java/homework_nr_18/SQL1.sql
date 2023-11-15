create table Books (
book_id serial primary key,
name text,
author text,
date_of_publishing date,
genre text,
avaible_count int
);

select * from books;

insert into books (name, author, date_of_publishing, genre,avaible_count)
values
('The Great Gatsby', 'F.Sco Fitzgerald', '1925-01-01', 'Classics', 3),
('To Kill a Mockingbird', 'Harper Lee', '1960-01-01', 'Ficnon', 5),
('1984', 'George Orwell', '1949-01-01', 'Science Ficnon', 2),
('Pride and Prejudice', 'Jane Austen', '1813-01-01', 'Romance', 4);

select name from books;

select author from books where book_id = '4';
delete from books where book_id = '1';