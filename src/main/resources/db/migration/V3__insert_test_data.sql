INSERT INTO captcha_codes
    (id, code, secret_code, time)
VALUES
    (1, 'русский');

INSERT INTO global_settings
    (id, code, name, value)
VALUES
    (1, 'русский');

INSERT INTO posts
    (id, is_active, text, time, title, view_count, user_id)
VALUES
    (1, 'русский');

INSERT INTO post_comments
    (id, parent_id, text, time, post_id, user_id)
VALUES
    (1, 'русский');

INSERT INTO post_votes
    (id, time, value, post_id, user_id)
VALUES
    (1, 'русский');

INSERT INTO tag2post
    (tag_id, post_id)
VALUES
    (1, 'русский');

INSERT INTO tags
    (id, name)
VALUES
    (1, 'необычныеФакты'),
    (2, 'мирЖивотных'),
    (3, 'NatGeo'),
    (4, 'API'),
    (5, 'программирование');

INSERT INTO users
