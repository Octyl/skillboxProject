package main.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "captcha_codes")
public class CaptchaCodes
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "time")
    private Date time;

    @Column(name = "code")
    private String code;

    @Column(name = "secret_code")
    private String secretCode;

}
