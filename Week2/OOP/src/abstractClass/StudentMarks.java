package abstractClass;

import java.util.Scanner;
public class StudentMarks {
   Scanner scan1 = new Scanner(System.in);
   double math=10;
   double science=85;
   double english=75;
   
   public boolean wasPromroted(StudentMarks marks) {
      if(this.math>=85 && science>=75 && english>=75) {
         return true;
      }
      return false;
   }
   public static void main(String args[]) {
      
      StudentMarks marks = new StudentMarks();
      marks.math=100;
      boolean bool = marks.wasPromroted(marks);
      if(bool) {
         System.out.println("Congratulations you've got promoted");
      } else {
         System.out.println("Sorry try again");
      }
      
   }
}
