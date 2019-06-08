
package com.example.modelo;

import java.util.Date;

public class Person {
    
    protected long id;
    protected String name;
    protected String lastName;
    protected Date birthDate;

    public Person(long id, String name, String lastName, Date birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person(){
        
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthDate=" + birthDate +", ";
    }

   
    
    
}
