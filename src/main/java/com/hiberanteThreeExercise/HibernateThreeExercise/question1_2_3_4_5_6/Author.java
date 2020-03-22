package com.hiberanteThreeExercise.HibernateThreeExercise.question1_2_3_4_5_6;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
private String first_name;
private String last_name;





//address

@Embedded
private Address address;






///subjects

@OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Subject> subjectsList;

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }







    //books
    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
               Book book;



//getter and setters below

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

    public void settingSubjects(Subject sub){
        if (subjectsList==null){
            subjectsList = new ArrayList<Subject>();
        }
       sub.setAuthor(this);
        subjectsList.add(sub);

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
