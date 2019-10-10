package app;

import java.util.ArrayList;
import java.util.Collections;

class Useful {
   public void g(){};
   public void f(){};
}

class MoreUseful extends Useful{
   public void h(){};
   public void i(){};
   public void j(){};
   public void k(){};
}

class Insurance{
   public static final int LOW = 100;
   
   public int premium(){
     return LOW;
   }
   
   public static String category(){
     return "Insurance";
   }
   
 }
 
 class CarInsurance extends Insurance implements TestInterface{
   public static final int HIGH = 200;
   
   public int premium(){
     return HIGH;
   }
   
   public static String category(){
     return "Car Insurance";
   }

   @Override
   public void test() {
      System.out.println("test");

   }
   static void test2(){
      System.out.println("test2_Car");
   }
   
 }
interface TestInterface{
   void test();
   static void test2(){
      System.out.println("test2");
   }
   
   default void test3(int x) {
      System.out.println("test" + x);
   }
}
abstract class AbstractClass{
   
}
public class App {
    public static void main(String[] args) throws Exception {
      System.out.println("Hello Java");
      Useful[] u = {
         new Useful(),
         new MoreUseful()
      };
      u[0].f();
      u[1].g();
      ((MoreUseful)u[1]).h();

      // An example of static and dynamic binding in Java
    Insurance current = new CarInsurance();
    
    // dynamic binding based upon object
    int premium = current.premium(); 
    
    // static binding based upon class
    String category = CarInsurance.category();
    
    System.out.println("premium : " + premium);
    System.out.println("category : " + category);

    CarInsurance carInsurance = new CarInsurance();
    carInsurance.test();
    CarInsurance.test2();
    carInsurance.test3(456);
    TestInterface.test2();

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


      Integer one = new Integer(1);
      Integer anotherOne = new Integer(1);
      if (one.intValue() == anotherOne.intValue()){
         System.out.println("equal");
      }
      else {
         System.out.println("not equal");
      }
      short s1 = 3;
      short s2 = 1;
      s2 = (short) (s1 ^ s2);
      System.out.println(s2);

    }
}