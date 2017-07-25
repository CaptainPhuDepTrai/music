package vn.edu.eiu.music.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Acer on 11/07/2017.
 */

@Embeddable
public class PersonalInfo {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public PersonalInfo() {
    }

    public PersonalInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
