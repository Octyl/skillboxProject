package main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "users")
public class Users
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private short isModerator;

    private Date regTime;

    private String name;

    private String email;

    private String password;

    private String code;

    private String photo;

}
