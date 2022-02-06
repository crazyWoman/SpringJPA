DROP TABLE IF EXISTS TBL_STUDENTS;
DROP TABLE IF EXISTS TBL_COUNTRIES;



CREATE TABLE TBL_COUNTRIES (
                               id  int  PRIMARY KEY,
                               country_name  VARCHAR(250) not null
);

CREATE TABLE TBL_STUDENTS (
                               id INT   PRIMARY KEY,
                               first_name VARCHAR(250) NOT NULL,
                               last_name VARCHAR(250) NOT NULL,
                               country_id  int null
);


ALTER TABLE TBL_STUDENTS
    ADD FOREIGN KEY (country_id)
        REFERENCES TBL_COUNTRIES(id);

