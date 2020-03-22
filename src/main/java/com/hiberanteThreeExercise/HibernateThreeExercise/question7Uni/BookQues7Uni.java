package com.hiberanteThreeExercise.HibernateThreeExercise.question7Uni;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookQues7Uni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String book_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
}
