package main.entity;

import javax.persistence.*;

@Entity(name = "tag2post")
public class TagToPost
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private int postId;

    @ManyToMany
    private int tagId;
}
