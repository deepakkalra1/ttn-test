package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceSingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class TestCreditCard extends TestParent {
    String card_number;

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }
}
