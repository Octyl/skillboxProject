alter table post_comments add constraint UK_bm1jee7b8w4mmcpto533xjvnu unique (post_id_id)
alter table post_comments add constraint FKgt0qfmhsm79wnfe87vdj2o4ip foreign key (post_id_id) references posts (id)
alter table post_comments add constraint FKqwj42sg3dn35hr7xsjxql8sic foreign key (user_id_id) references users (id)
alter table post_votes add constraint FK9jh5u17tmu1g7xnlxa77ilo3u foreign key (post_id) references posts (id)
alter table post_votes add constraint FK9q09ho9p8fmo6rcysnci8rocc foreign key (user_id) references users (id)
alter table posts add constraint FK5lidm6cqbc7u4xhqpxm898qme foreign key (user_id) references users (id)
alter table tag2post add constraint FKpjoedhh4h917xf25el3odq20i foreign key (post_id) references posts (id)
alter table tag2post add constraint FKjou6suf2w810t2u3l96uasw3r foreign key (tag_id) references tags (id)

