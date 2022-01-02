package main.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "captcha_codes")
public class CaptchaCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "time")
    private Date time;

    @Column(name = "code")
    private String code;

    @Column(name = "secret_code")
    private String secretCode;

}
