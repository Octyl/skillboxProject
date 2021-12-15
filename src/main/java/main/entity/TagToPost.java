package main.entity;

import javax.persistence.*;

@Entity(name = "tag2post")
public class TagToPost
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "post_id")
    @Column(name = "post_id")
    private int postId;

    @ManyToMany(mappedBy = "post_id")
    @JoinColumn(name = "tag_id")
    @Column(name = "tag_id")
    private int tagId;
}
