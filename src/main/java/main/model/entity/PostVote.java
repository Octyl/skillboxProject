package main.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_votes")
@Getter
@Setter
public class PostVote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToOne(targetEntity=Post.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private Post postId;

    private Date time;

    private short value;
}
