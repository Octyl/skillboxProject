package main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "captcha_codes")
public class CaptchaCodes
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private Date time;

    private String code;

    private String secretCode;

}
