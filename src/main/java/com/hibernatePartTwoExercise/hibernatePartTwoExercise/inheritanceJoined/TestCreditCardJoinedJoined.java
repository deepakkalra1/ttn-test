package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceJoined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card_joined_strategy")
public class TestCreditCardJoinedJoined extends TestParentJoined {
    @Column(name = "card_number")
    String credit_card_number;

    public String getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }
}
