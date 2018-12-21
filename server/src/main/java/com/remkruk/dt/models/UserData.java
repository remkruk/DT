package com.remkruk.dt.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class UserData {

    @Id
    private UUID id;
}
