
package BeeCrowd.Beginner;
import java.util.Scanner; 
import java.lang.Math;

class MyClass {
  public static void main(String[] args) {
    double x;
    double area;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    x = myObj.nextDouble(); // Read user input
    area =  Math.PI * x * x;
    float answer =  (float) area;
    System.out.println(String.format("A=%.4f", answer));  
    myObj.close();
    

  }
}