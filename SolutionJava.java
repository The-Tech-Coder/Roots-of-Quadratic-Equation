import java.util.Scanner;

public class quadratic {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value of coefficient a: ");  
        double a = x.nextDouble();  
        System.out.print("Enter the value of coefficient b: ");  
        double b = x.nextDouble();  
        System.out.print("Enter the value of coefficient c: ");  
        double c = x.nextDouble();  
        double discriminant = (Math.pow(b, 2)) - (4 * a * c);  
        x.close();
        if (discriminant > 0) {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
            System.out.println("Both the roots are real and different."); 
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if (discriminant == 0) {
            double r1 = -b / (2 * a);  
            System.out.println("Both the roots are real and the same."); 
            System.out.println("The root is " + r1); 
        } 
        else {
            System.out.println("Both the roots are distinct, complex, imaginary."); 
            System.out.println("Quadratic equation has no real roots.");  
        }
    }
}
