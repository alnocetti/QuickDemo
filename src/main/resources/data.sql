INSERT INTO label (name, mail, creation_date) VALUES ("Tronic", "cristianhuichaqueo@gmail.com", NOW());
--INSERT INTO label (name, mail, creation_date) VALUES ("Latoli", "alnocetti@gmail.com", NOW());
INSERT INTO label (name, mail, creation_date) VALUES ("Latoli", "cristianhuichaqueo@gmail.com", NOW());
--INSERT INTO label (name, mail, creation_date) VALUES ("Picho", "eaiannicelli@gmail.com", NOW());
INSERT INTO label (name, mail, creation_date) VALUES ("Picho", "cristianhuichaqueo@gmail.com", NOW());
--INSERT INTO label (name, mail, creation_date) VALUES ("Garlopa", "nkuglien@gmail.com", NOW());
INSERT INTO label (name, mail, creation_date) VALUES ("Garlopa", "cristianhuichaqueo@gmail.com", NOW());

INSERT INTO genre (name, creation_date) VALUES ("Tech house", NOW());
INSERT INTO genre (name, creation_date) VALUES ("Bass house", NOW());
INSERT INTO genre (name, creation_date) VALUES ("Bass Music", NOW());
INSERT INTO genre (name, creation_date) VALUES ("Baile funk", NOW());

INSERT INTO label_genre (label_id, genre_id) VALUES (1, 1);
INSERT INTO label_genre (label_id, genre_id) VALUES (1, 2);
INSERT INTO label_genre (label_id, genre_id) VALUES (1, 3);
INSERT INTO label_genre (label_id, genre_id) VALUES (1, 4);

INSERT INTO label_genre (label_id, genre_id) VALUES (2, 1);
INSERT INTO label_genre (label_id, genre_id) VALUES (2, 2);
INSERT INTO label_genre (label_id, genre_id) VALUES (2, 3);

INSERT INTO label_genre (label_id, genre_id) VALUES (3, 1);

INSERT INTO label_genre (label_id, genre_id) VALUES (4, 1);