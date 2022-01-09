package main.model.entity;

import lombok.Getter;
import lombok.Setter;
import main.model.entity.enums.ModerationStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "is_moderator", columnDefinition = "enum")
    private ModerationStatus isModerator;

    @Column(name = "reg_time")
    private Date regTime;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "code")
    private String code;

    @Column(name = "photo")
    private String photo;

}