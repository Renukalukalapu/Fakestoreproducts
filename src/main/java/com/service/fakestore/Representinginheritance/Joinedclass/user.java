package com.service.fakestore.Representinginheritance.Joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name="joined_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class user {
    @Id
    private int Id;
    private String name;
    private String email;
}
