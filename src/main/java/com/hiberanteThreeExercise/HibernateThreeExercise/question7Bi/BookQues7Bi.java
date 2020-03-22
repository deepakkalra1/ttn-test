package com.hiberanteThreeExercise.HibernateThreeExercise.question7Bi;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookQues7Bi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String book_name;

    @ManyToOne
    @JoinColumn(name = "au_id")
    AuthorQues7Bi authorQues7Bi;

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

    public AuthorQues7Bi getAuthorQues7Bi() {
        return authorQues7Bi;
    }

    public void setAuthorQues7Bi(AuthorQues7Bi authorQues7Bi) {
        this.authorQues7Bi = authorQues7Bi;
    }
}
