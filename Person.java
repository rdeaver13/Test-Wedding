/*
 * Author: Ray Deaver
 * Date: 2/15/2023
 */
package TestWedding;

import java.time.LocalDate;

public class Person {
    // Variables
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    // Constructor
    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    // Reformat for printing 
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", " + this.birthDate;
    }
}
