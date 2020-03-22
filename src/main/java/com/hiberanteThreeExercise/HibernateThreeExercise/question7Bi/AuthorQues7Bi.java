package com.hiberanteThreeExercise.HibernateThreeExercise.question7Bi;

import com.hiberanteThreeExercise.HibernateThreeExercise.question1_2_3_4_5_6.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class AuthorQues7Bi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;





//address

    @Embedded
    private Address address;




   // books keeping Bi directional
    @OneToMany(mappedBy = "authorQues7Bi",cascade = CascadeType.ALL)
    private List<BookQues7Bi> bookList;


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

    public List<BookQues7Bi> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookQues7Bi> bookList) {
        this.bookList = bookList;
    }


    public void settingBooks(BookQues7Bi book){
        if (bookList==null){
            bookList= new ArrayList<BookQues7Bi>();
        }
        book.setAuthorQues7Bi(this);
        bookList.add(book);

    }

}


