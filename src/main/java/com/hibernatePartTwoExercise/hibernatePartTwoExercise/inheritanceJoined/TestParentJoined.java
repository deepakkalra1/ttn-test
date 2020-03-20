package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceJoined;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "parent_joined_strategy")
public class TestParentJoined {

    @Id
    int id;
    int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
