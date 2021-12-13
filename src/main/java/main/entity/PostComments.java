package main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "post_comments")
public class PostComments
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private int parentId;

    private int postId;

    private int userId;

    private Date time;

    private String text;
}
