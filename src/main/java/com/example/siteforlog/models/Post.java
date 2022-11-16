package com.example.siteforlog.models;


import lombok.*;

import javax.persistence.*;


@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String login;

    private String password;

}
