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
VALUES(
    (
    1,
    1,
    CONCAT("В этой серии из двух статей я приглашаю вас заглянуть в один любопытный и не самый популярный уголок математики",
         "в котором обитают необычные создания — p-адические числа, а попутно хочу рассказать о написанной мной",
         "Haskell-библиотеке для работы с ними, а также о двух классных инструментах: о типах-литералах (type literals)",
         "и семействах типов (type families), приближающих нас к заветным зависимым типам."),
    2021-01-01 13:32:00,
    "Знакомство с p-адическими числами.",
    23,
    1),
    (
    2,
    1,
    CONCAT("Довольно много людей в последнее время пытаются попасть в IT",
        "Пишут статьи на различных ресурсах, как им это удалось сделать. ",
        "Но найти статьи о том, что происходит после того, как проходит эйфория довольно трудно."),
    2022-01-15 11:12:20,
    "Войти в IT и, что дальше?",
    12,
    3));

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
VALUES(
    (1, 'необычныеФакты'),
    (2, 'мирЖивотных'),
    (3, 'NatGeo'),
    (4, 'API'),
    (5, 'программирование'));

INSERT INTO users
    (id, is_moderator, reg_time, name, email, password, code, photo)
VALUES(
    (1,
    1,
    2020-03-03 14:12:51,
    "ADMIN",
    "blog@gmail.com",
    "",
    "https://static.chipdip.ru/lib/048/DOC006048300.jpg"
    ),
    (2,
    0,
    2022-01-02 19:13:11,
    "Anton",
    "antoh32@mail.ru",
    "123456",
    "https://lettersandnumbers.org/college-style/numbers/college-number-32.jpg"
    ),
    (3,
    0,
    2021-11-22 16:56:52,
    "Marina",
    "mar_ina1997@yandex.ru",
    "Mir12",
    "https://animesuperhero.com/wp-content/uploads/2021/01/atla.jpg"
    )
);

