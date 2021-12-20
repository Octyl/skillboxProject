package main.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "post_votes")
public class PostVote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id")
    private int userId;

    @OneToOne
    @Column(name = "post_id")
    private int postId;

    @Column(name = "time")
    private Date time;

    @Column(name = "value")
    private short value;
}
