package com.hiberanteThreeExercise.HibernateThreeExercise.question8;

import com.hiberanteThreeExercise.HibernateThreeExercise.question7Bi.AuthorQues7Bi;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class BookQues8 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String book_name;

    @ManyToMany
   private List<AuthorQues8> authorQues8List;


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

    public List<AuthorQues8> getAuthorQues8List() {
        return authorQues8List;
    }

    public void setAuthorQues8List(List<AuthorQues8> authorQues8List) {
        this.authorQues8List = authorQues8List;
    }

}
