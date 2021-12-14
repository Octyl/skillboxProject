package main.entity;

import javax.persistence.*;

@Entity(name = "tags")
public class Tags
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;
}
