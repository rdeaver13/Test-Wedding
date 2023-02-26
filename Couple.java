/*
 * Author: Ray Deaver
 * Date: 2/15/2023
 */
package TestWedding;

public class Couple {
    // Person objects
    private Person person1;
    private Person person2;

    // Constructor
    public Couple(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    // Getters
    public Person getPerson1() {
        return this.person1;
    }

    public Person getPerson2() {
        return this.person2;
    }

    // Setters
    public void setPerson1(Person person1) {
        this.person1 = person1;
    }

    public void setPerson2(Person person2) {
        this.person2 = person2;
    }

    // Reformat for printing
    @Override
    public String toString() {
        return "The groom: " + this.person1 + "\n" + "The bride: " + this.person2;
    }

}
