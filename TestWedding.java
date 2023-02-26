/*
 * Author: Ray Deaver
 * Date: 2/15/2023
 * Create a class named Person that holds the following fields: 
 * two String objects for the person’s first and last name 
 * and a LocalDate object for the person’s birthdate.
 * Create a class named Couple that contains two Person objects.
 * Create a class named Wedding for a wedding planner that includes the date of the wedding, 
 * the names of the Couple being married, and a String for the location.
 * Provide constructors for each class that accept 
 * parameters for each field, and provide get methods for each field.
 * Then write a program that creates two Wedding objects 
 * and in turn passes each to a method that displays all the details. 
 * Save the files as Person.java, Couple.java, Wedding.java, and TestWedding.java. 
 */

package TestWedding;

import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args) {
        // Assign values to objects
        LocalDate weddingDate1 = LocalDate.of(2023, 9, 22);
        Person husband1 = new Person("Aaron", "Jones", LocalDate.of(1997, 11, 16));
        Person wife1 = new Person("Julia", "Harboro", LocalDate.of(1999, 2, 5));
        Couple weddingCouple1 = new Couple(husband1, wife1);
        String weddingLocation1 = "Barbados";

        Wedding wedding1 = new Wedding(weddingDate1, weddingCouple1, weddingLocation1);

        System.out.println("The wedding will be on " + wedding1.getWeddingDate());
        System.out.println(wedding1.getWeddingCouple());
        System.out.println("The wedding will be held in " + wedding1.getWeddingLocation());
        System.out.print("\n");

        LocalDate weddingDate2 = LocalDate.of(2024, 11, 26);
        Person husband2 = new Person("Andrew", "Roberts", LocalDate.of(1999, 8, 3));
        Person wife2 = new Person("Michelle", "Kinsley", LocalDate.of(1999, 7, 7));
        Couple weddingCouple2 = new Couple(husband2, wife2);
        String weddingLocation2 = "Hawaii";

        Wedding wedding2 = new Wedding(weddingDate2, weddingCouple2, weddingLocation2);

        System.out.println("The wedding will be on " + wedding2.getWeddingDate());
        System.out.println(wedding2.getWeddingCouple());
        System.out.println("The wedding will be held in " + wedding2.getWeddingLocation());
        System.out.print("\n");

    }
    
}
