
--password nikossour
INSERT INTO USER(address, afm, email, first_name, last_name, password, role_type) VALUES ('Kaykasoy 123', '123412345', 'nicksour@hotmail.com', 'Nick', 'Sourvanos', '$2a$10$KmgUZ7wdSb.7EiO.f8Ic0uiZADvgEFufkmWwZs6rEAY.hUjW7rhjm', 'ADMIN_ROLE');
--password georgealev
INSERT INTO USER(address, afm, email, first_name, last_name, password, role_type) VALUES ('Agiou Meletiou 234', '123412341', 'georgealev@hotmail.com', 'Giwrgos', 'Alevizos', '$2a$10$5YHVExwDp0EvUX4ZZs0OKOH4qCsXhnK0.q82tgCQTzd7Q4DkdZf.6', 'SIMPLE_USER_ROLE');
-- password johnmich
INSERT INTO USER(address, afm, email, first_name, last_name, password, role_type) VALUES ('Pagkrati 123', '123434566','johnmich@hotmail.com', 'John', 'Michalopoulos', '$2a$10$qckBoJ0IuHwnBGgxFfXpGODASDVd1rvLkp2inwk3AXVRA3xn5tqCW', 'SIMPLE_USER_ROLE');
--password tommy
INSERT INTO USER(address, afm, email, first_name, last_name, password, role_type) VALUES ('Panepistimiou 123', '234534566','tommykoumassis@hotmail.com', 'Tom', 'Koumassis', '$2a$10$va6p2IG7Btzdff5uNDfoTeklc6ECJGSpZlgi.689/bPqT1Jb0wYYe', 'SIMPLE_USER_ROLE');

INSERT INTO VEHICLE(COLOR, MODEL, PLATE_NUMBER, YEAR_OF_MANUFACTURE, USER_ID) VALUES ('RED', 'TOYOTA AYGO', 'ASD-1234', '2003', 1);
INSERT INTO VEHICLE(COLOR, MODEL, PLATE_NUMBER, YEAR_OF_MANUFACTURE, USER_ID) VALUES ('BLUE', 'TOYOTA AURIS', 'WER-1234', '2003', 2);
INSERT INTO VEHICLE(COLOR, MODEL, PLATE_NUMBER, YEAR_OF_MANUFACTURE, USER_ID) VALUES ('WHITE', 'VOLKSWAGEN POLO', 'QWE-1234', '2007', 3);
INSERT INTO VEHICLE(COLOR, MODEL, PLATE_NUMBER, YEAR_OF_MANUFACTURE, USER_ID) VALUES ('RED', 'TOYOTA YARIS', 'GHJ-1234', '2000', 4);

INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 1);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 1);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 1);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 1);

INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 2);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 2);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 2);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'PENDING', 2);

INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'COMPLETED', 3);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'COMPLETED', 3);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'COMPLETED', 3);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'COMPLETED', 3);

INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'IN_PROGRESS', 4);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'IN_PROGRESS', 4);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'IN_PROGRESS', 4);
INSERT INTO REPAIR(COST, DESCRIPTION, REPAIR_DATE, REPAIR_TYPE, STATUS, VEHICLE_ID) VALUES (20.00, 'Service', '2018-12-5', 'MINOR_REPAIR', 'IN_PROGRESS', 4);
