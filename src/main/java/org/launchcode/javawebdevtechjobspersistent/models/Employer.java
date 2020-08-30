package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Employer extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

//    @NotNull(message = "Name is required.")
//    @Size(min = 3, max = 100)
//    private String name;

    @NotNull(message = "Location is required.")
    @Size(min = 3, max = 100)
    private String location;


    public Employer() {}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


}
