package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceTablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cheque_table_per_class_strategy")
public class TestChequeTablePerClass extends TestParentTablePerClass {
    String cheque_number;

    public String getCheque_number() {
        return cheque_number;
    }

    public void setCheque_number(String cheque_number) {
        this.cheque_number = cheque_number;
    }
}
