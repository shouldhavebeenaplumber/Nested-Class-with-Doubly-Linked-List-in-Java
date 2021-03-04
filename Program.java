/**
 * Nathan Tai
 * P148535
 * 12/02/2021
 * Java III, AT2, Question 1
 * "You need to make a nested class that shows countries with cities inside.
 * These countries must be stored in a doubly linked list with no less than
 * four countries in it."
 */
package nestedclasscountries;

public class Program {

    Country cnt = new Country();

    public static void main(String[] args) {

        //Instantiate countries as nodes
        Country c1 = new Country("Australia", "Perth");
        Country c2 = new Country("America", "Washington");
        Country c3 = new Country("Germany", "Berlin");
        Country c4 = new Country("New Zealand", "Auckland");

        //Set links
        c1.setPrev(null);
        c1.setNext(c2);
        c2.setPrev(c1);
        c2.setNext(c3);
        c3.setPrev(c2);
        c3.setNext(c4);
        c4.setPrev(c3);
        c4.setNext(null);

        //Show data in nodes
        System.out.println(c1.displayData());
        System.out.println(c2.displayData());
        System.out.println(c3.displayData());
        System.out.println(c4.displayData());
    }
}
