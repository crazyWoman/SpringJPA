DROP TABLE IF EXISTS TBL_BOOKS;

CREATE TABLE TBL_BOOKS (
                               id INT   PRIMARY KEY,
                               author_name VARCHAR(250) NOT NULL,
                               book_title VARCHAR(250) NOT NULL
);