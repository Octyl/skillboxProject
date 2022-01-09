package main.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "is_active")
    private short isActive;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User moderatorId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User authorId;

    @Column(name = "time")
    private Date time;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "view_count")
    private int viewCount;
}
