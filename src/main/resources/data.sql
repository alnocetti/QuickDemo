INSERT INTO label (name, mail, creation_date) VALUES ("Tronic", "demos@tronic.com", NOW());
INSERT INTO label (name, mail, creation_date) VALUES ("Latoli", "demos@latoli.com", NOW());
INSERT INTO label (name, mail, creation_date) VALUES ("Picho", "demos@picho.com", NOW());
INSERT INTO label (name, mail, creation_date) VALUES ("Garlopa", "demos@garlopa.com", NOW());

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