INSERT INTO PUBLIC.SUBJECTS(TITLE, MARK)
VALUES ('Укр.мова'),
       ('Математика'),
       ('Фізика',);


INSERT INTO PUBLIC.FACULTIES(TITLE, ALL_PLACES, BUDGET_PLACES)
VALUES ('Фізико-математичний факультет', 20, 5),
       ('Філологічний факультет', 30, 10),
       ('Інженерний факультет', 50, 15),
       ('Факультет інформаційних технологій', 60, 20),
       ('Будівельний факультет', 25, 3),
       ('Юридичний факультет', 30, 2),
       ('Факультет економіки', 25, 4),
       ('Факультет інженерних систем', 35, 15),
       ('Транспортний факультет', 15, 4),
       ('Факультет міжнародних відносин', 40, 21),
       ('Факультет автоматизації виробничих процесів', 24, 5),
       ('Факультет ядерної фізики', 26, 4),
       ('Факультет мехатроніки', 15, 3),
       ('Архітектурний факультет', 22, 8),
       ('Факультет урбаністики', 40, 15);


INSERT INTO PUBLIC.USERS(SURNAME, NAME, FATHERSNAME, EMAIL, PASSWORD, CITY, REGION, ENABLE)
VALUES ('', '', '', 'admin@mail.com', 'admin', '', '', true);


INSERT INTO PUBLIC.FACULTY_USER_SUBJECT(FACULTY_ID, USER_ID, SUBJECT_ID)
VALUES (1, 1, 1),
       (1, 1, 2);

INSERT INTO PUBLIC.ROLES (ROLE_ID, ROLE_NAME) VALUES
('1', 'Admin'), ('2', 'Applicant');


INSERT INTO PUBLIC.STATEMENTS(FINALIZED, FACULTY_ID)
VALUES (FALSE, 1);


INSERT INTO PUBLIC.ROLES_USERS(ROLE_ID, USER_ID)
VALUES (1, 1);

INSERT INTO PUBLIC.USERS_STATEMENTS(STATEMENT_ID, USER_ID)
VALUES (1, 1);

INSERT INTO PUBLIC.FACULTIES_STATEMENTS(FACULTY_ID, STATEMENT_ID)
VALUES (1, 1);