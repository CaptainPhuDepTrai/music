package vn.edu.eiu.music.entity;

import javax.persistence.*;

/**
 * Created by Acer on 11/07/2017.
 */
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Embedded
    private PersonalInfo personalInfo;

    public Author() {
    }

    public Author(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Author(String firstName, String lastName) {
        personalInfo = new PersonalInfo(firstName,lastName);
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
}
