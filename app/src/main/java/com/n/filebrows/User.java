package com.n.filebrows;


import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class User {
    @Id
    public long id;
    public String name;
}