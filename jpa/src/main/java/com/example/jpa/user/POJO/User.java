package com.example.jpa.user.POJO;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author WangKun
 * @create 2018-08-27
 * @desc
 **/
@Entity
@Data
@Table(name = "USER")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String name;
    private Integer password;
}
