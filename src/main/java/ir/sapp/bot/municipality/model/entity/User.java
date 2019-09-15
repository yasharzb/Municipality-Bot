package ir.sapp.bot.municipality.model.entity;

import ir.sapp.bot.municipality.model.internal.UserState;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class User {
    @Id
    private String id;

    private UserState state;
    private ArrayList<?> inputs;

    public User() {
    }
}
