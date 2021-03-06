package main.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "posts")
public class Posts
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "is_active")
    private short isActive;

    @OneToOne
    @Column(name = "moderator_id")
    private int moderatorId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "time")
    private Date time;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "view_count")
    private int viewCount;
}
