package ir.sapp.bot.municipality.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
    @Id
    private String id;
}
