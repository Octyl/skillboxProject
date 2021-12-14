package main.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "post_comments")
public class PostComments
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "post_id")
    private int postId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "time")
    private Date time;

    @Column(name = "text")
    private String text;
}
