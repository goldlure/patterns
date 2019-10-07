package app;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("Hello Java");

      Employee CEO = new Employee("John","CEO", 30000);
      Employee headSales = new Employee("Robert","Head Sales", 20000);
      Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
      Employee clerk1 = new Employee("Laura","Marketing", 10000);
      Employee clerk2 = new Employee("Bob","Marketing", 10000);
      Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
      Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

      CEO.add(headSales);
      CEO.add(headMarketing);
      headSales.add(salesExecutive1);
      headSales.add(salesExecutive2);
      headMarketing.add(clerk1);
      headMarketing.add(clerk2);
      //print all employees of the organization
      System.out.println(CEO); 
      // print one by one down to the subordinates tree
      for (Employee headEmployee : CEO.getSubordinates()) {
         System.out.println(headEmployee);
         for (Employee employee : headEmployee.getSubordinates()) {
            System.out.println(employee);
         }
      }
      ArrayList<Movie> list = new ArrayList<Movie>(); 
      list.add(new Movie("Force Awakens", 8.3, 2015)); 
      list.add(new Movie("Star Wars", 8.7, 1977)); 
      list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
      list.add(new Movie("Return of the Jedi", 8.4, 1983));

      Collections.sort(list);
      for (Movie movie: list) 
            System.out.println(movie.getRating() + " " + 
                               movie.getName() + " " + 
                               movie.getYear()); 

      RatingCompare ratingCompare = new RatingCompare();
      Collections.sort(list, ratingCompare);
      for (Movie movie: list) 
            System.out.println(movie.getRating() + " " + 
                               movie.getName() + " " + 
                               movie.getYear()); 

    }
}