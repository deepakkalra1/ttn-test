package com.hiberanteThreeExercise.HibernateThreeExercise.question1_2_3_4_5_6;


import javax.persistence.*;

@Entity
@Table(name = "author_subject")
public class Subject {

        @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        @Column(name = "sub_name")
    String name;


    @ManyToOne
            @JoinColumn(name = "au_id")
    Author author;



            //getter and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
