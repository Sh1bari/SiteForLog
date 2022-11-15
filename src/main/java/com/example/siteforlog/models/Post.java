package com.example.siteforlog.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    public Post() {
    }

    public Post(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
