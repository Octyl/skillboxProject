package main.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "posts")
public class Posts
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private short isActive;

    @OneToOne
    private int moderatorId;

    @OneToOne
    private int userId;

    private Date time;

    private String title;

    private String text;

    private int viewCount;
}
