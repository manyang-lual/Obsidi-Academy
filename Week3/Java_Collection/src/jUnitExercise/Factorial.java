package jUnitExercise;

public class Factorial {

   
    public static int factorial(int input) {
    	 int fact=1;
         int number=input;
         while(input>=1){
             fact=fact*input;
             input--;
         }
         
         return fact;
    }
}