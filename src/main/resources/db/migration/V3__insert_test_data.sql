INSERT INTO captcha_codes
    (id, code, secret_code, time)
VALUES(
    (1, 32df2, 1111, 2021-01-01 13:32:00),
    (2, 421da, 3221, 2021-01-11 23:02:10));

INSERT INTO global_settings
    (id, code, name, value)
VALUES(
    (1, 1, "MULTIUSER_MODE,", "YES"),
    (2, 2, "POST_PREMODERATION,", "YES"),
    (3, 3, "STATISTICS_IS_PUBLCI,", "YES"),);


INSERT INTO posts
    (id, is_active, text, time, title, view_count, user_id)
VALUES(
    (1, 1,
    CONCAT("В этой серии из двух статей я приглашаю вас заглянуть в один любопытный и не самый популярный уголок математики",
         "в котором обитают необычные создания — p-адические числа, а попутно хочу рассказать о написанной мной",
         "Haskell-библиотеке для работы с ними, а также о двух классных инструментах: о типах-литералах (type literals)",
         "и семействах типов (type families), приближающих нас к заветным зависимым типам."),
    2021-01-01 13:32:00, "Знакомство с p-адическими числами.", 23, 1),
    (2, 1,
    CONCAT("Довольно много людей в последнее время пытаются попасть в IT",
        "Пишут статьи на различных ресурсах, как им это удалось сделать. ",
        "Но найти статьи о том, что происходит после того, как проходит эйфория довольно трудно."),
    2022-01-15 11:12:20, "Войти в IT и, что дальше?", 12, 3));

INSERT INTO post_comments
    (id, parent_id, text, time, post_id, user_id)
VALUES(
    (1, NULL, "Спасибо за пост!!",  2021-01-12 14:02:31, 1, 2),
    (2, 1, "Спасибо за отзыв", 2021-01-12 15:33:02, 1, 2),
    (3, NULL, "Очень интересно",  2021-01-11 11:12:35, 2, 3));

INSERT INTO post_votes
    (id, user_id, post_id, time, value)
VALUES(
    (1, 2, 1, 2021-01-09 01:42:11, 1),
    (2, 1, 1, 2021-01-10 14:02:31, -1),
    (3, 3, 1, 2021-01-11 15:03:55, 1)
    (4, 3, 2, 2021-01-11 16:11:34, 1));

INSERT INTO tag2post
    (tag_id, post_id)
VALUES(
    (1, 1),
    (5, 1),
    (5, 2),
    (4, 2));

INSERT INTO tags
    (id, name)
VALUES(
    (1, 'необычныеФакты'),
    (2, 'мирЖивотных'),
    (3, 'NatGeo'),
    (4, 'API'),
    (5, 'программирование'));

INSERT INTO users
    (id, is_moderator, reg_time, name, email, password, code, photo)
VALUES(
    (1, 1, 2020-03-03 14:12:51, "ADMIN", "blog@gmail.com", "admin",
    "https://static.chipdip.ru/lib/048/DOC006048300.jpg"),
    (2, 0, 2022-01-02 19:13:11, "Anton", "antoh32@mail.ru", "123456",
    "https://lettersandnumbers.org/college-style/numbers/college-number-32.jpg"),
    (3, 0, 2021-11-22 16:56:52, "Marina", "mar_ina1997@yandex.ru", "Mir12",
    "https://animesuperhero.com/wp-content/uploads/2021/01/atla.jpg")
);

