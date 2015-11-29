package com.mycompany.credentialsApp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private List<Role> roles;
    private List<User> users;
}
