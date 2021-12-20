package main.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "post_comments")
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id")
    @Column(name = "post_id")
    private int postId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "time")
    private Date time;

    @Column(name = "text")
    private String text;
}
