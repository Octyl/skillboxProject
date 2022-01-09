package main.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "post_comments")
@Getter
@Setter
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    private Post postId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private User userId;

    @Column(name = "time")
    private Date time;

    @Column(name = "text")
    private String text;
}
