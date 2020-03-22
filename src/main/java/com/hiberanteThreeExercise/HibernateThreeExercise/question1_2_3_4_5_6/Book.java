package com.hiberanteThreeExercise.HibernateThreeExercise.question1_2_3_4_5_6;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            int id;

String book_name;

@OneToOne
@JoinColumn(name = "au_id")
Author author;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
