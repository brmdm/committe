INSERT INTO PUBLIC.SUBJECTS(TITLE)
VALUES ('Укр.мова'),
       ('Математика'),
       ('Фізика'),
       ('Хімія'),
       ('Анг.мова');


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
VALUES ('', '', '', 'admin@mail.com', '$2y$10$HtPxIc3iDAwuZ3i9ZVA0N.0WMSiOfqWHIxwB.zDXGN.t2H6DZqVXm', '', '', true);

INSERT INTO PUBLIC.STATEMENTS(YEAR, FINALIZED, FACULTY_ID)
VALUES (2019, FALSE, 1);

INSERT INTO PUBLIC.FACULTIES_SUBJECTS(FACULTY_ID, SUBJECT_ID)
VALUES (1, 1);

INSERT INTO PUBLIC.USERS_SUBJECTS(USER_ID, SUBJECT_ID)
VALUES (1, 1);

INSERT INTO PUBLIC.USERS_ROLE(ROLE, USER_ID)
VALUES ('USER', 1),
       ('ADMIN', 1);

INSERT INTO PUBLIC.USERS_STATEMENTS(STATEMENT_ID, USER_ID)
VALUES (1, 1);