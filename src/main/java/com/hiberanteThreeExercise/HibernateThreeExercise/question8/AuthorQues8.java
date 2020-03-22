package com.hiberanteThreeExercise.HibernateThreeExercise.question8;

import com.hiberanteThreeExercise.HibernateThreeExercise.question1_2_3_4_5_6.Address;
import com.hiberanteThreeExercise.HibernateThreeExercise.question7Bi.BookQues7Bi;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class AuthorQues8 {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;





//address

    @Embedded
    private Address address;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book_mapping"
            ,joinColumns = @JoinColumn(name = "au_id",referencedColumnName = "id")
            ,inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    private List<BookQues8> bookQues8List;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public List<BookQues8> getBookQues8List() {
        return bookQues8List;
    }

    public void setBookQues8List(List<BookQues8> bookQues8List) {
        this.bookQues8List = bookQues8List;
    }
}
