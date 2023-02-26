# Test-Wedding

This program consists of four program files; Person.java, Couple.java, Wedding.java and TestWedding.java. The purpose of this program is to create a wedding planner displaying the wedding date, wedding location and the names and birthdays of both the bride and the groom. Two wedding planners are displayed upon running the program, both being for different couples. The program is not currently set up for recieving user inputs, all input values are hard coded, however altering the code to recieve user inputs would not be difficult. 

This program sets input values through the TestWedding.java file. The inputs are assigned using four object types; LocalDate, Person, Couple, and String. The TestWedding.java file then uses the Wedding method created in the Wedding.java file to pass the values for the wedding couple, weding location, and wedding date. The values entered for each person in TestWedding.java are passed through the Person.java file, where the first and last names are assigned to objects of type String, and the date of birth is assigned to an object of type LocalDate. A constructor is then used to create a public method for passing objects; firstName, lastName and birthDate. The @Override function is then used to concatenate the three values into a String. Next the Couple.java file creates two objects of type Person. Another public constructor is then used to create the Couple method for passing two objects, person1 and person2. Similarly to the Person.java file, the Couple.java file uses the @Override function to concatenate the two values into a String. The Wedding.java file then creates three objects of types LocalDate, Couple and String. A constructor then creates the Wedding method for passing objects; weddingDate, weddingCouple and weddingLocation. An object of type Wedding in then created in the TestWedding.java file for passing objects; weddingDate, weddingCouple and weddingLocation. The information being handled by the Wedding object is then printed using System.out.println along with the getters created from the other three files.

This results of this program, while being insignificant in themselves, offer a visual for the growth I have made through programming. The data being ouput in a clean and easy to read format shows that I have adequately developed my skills in both output formatting and making my code function cleanly. The results from the program themselves however do offer a valuable baseline for creating much more intricate programs in the future. I learned a lot about working with Packages in Java, as well as gaining a better understanding of object oriented programming. This code could be improved upon by finding a way to remove the @Override functions used in Person.java and Couple.java, possibly formatting them into Strings when creating the output functions. 
