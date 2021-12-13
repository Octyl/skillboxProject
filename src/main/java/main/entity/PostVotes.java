package main.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "post_votes")
public class PostVotes
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @OneToMany
    private int userId;

    @OneToOne
    private int postId;

    private Date time;

    private int value;
}
