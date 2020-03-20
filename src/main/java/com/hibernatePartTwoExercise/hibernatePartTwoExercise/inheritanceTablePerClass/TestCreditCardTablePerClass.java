package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceTablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card_table_per_class_strategy")
public class TestCreditCardTablePerClass extends TestParentTablePerClass {
    String card_number;

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }
}
