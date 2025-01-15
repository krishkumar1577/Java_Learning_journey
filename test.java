
// public class test {
//     // Class body

//     // Main method..............
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }

//     // Example method
//     public void exampleMethod() {
//         System.out.println("This is an example method.");
//     }

//     // Nested class
//     public class Name {
//         public class A {
//             // Method definition
//             public void funName() {
//                 System.out.println("This is a method inside class A.");
//             }
//         }
//     }
// }

/*public class test {
    public static void main(String[] args){
        int a =10;
        // int c =55;
        if (a % 2 == 0){
            System.out.println("this is an even no" );
        }
        if(a % 2 != 0) {
            System.out.println("this is an odd no");
        }
        
    }
}*/
/**
 * This class provides basic arithmetic operations such as addition, subtraction, multiplication, and division.
 * It also contains a main method to interact with the user via the console.
 * 
 * Packages to be studied:
 * - java.lang: Provides classes that are fundamental to the design of the Java programming language.
 * - java.util: Contains the collections framework, legacy collection classes, event model, date and time facilities, and miscellaneous utility classes.
 * - java.io: Provides for system input and output through data streams, serialization, and the file system.
 * - java.applet: Provides the classes necessary to create an applet and the classes an applet uses to communicate with its applet context.
 * - java.awt: Contains all of the classes for creating user interfaces and for painting graphics and images.
 * - java.net: Provides the classes for implementing networking applications.
 */



// import java.util.Scanner;

// public class test {
    // public double add(double a,double b){
    //     return a+b;
    // }
    // public double sub(double a,double b){
    //     return a-b;
    // }
    // public double mux(double a, double b){
    //     return a*b;
    // }
    // public double div(double a, double b){
    //     return a/b;
    // }

    // public static void main(String[] args){
    //     Scanner scanner = new Scanner(System.in);
        
    //     System.out.println("this is an Calculato program");
        
    //     System.out.print("enter the 1st no here ");
    //     double num1 = scanner.nextDouble();

    //     System.out.print("enter the 2nd no here ");
    //     double num2 = scanner.nextDouble();

    //     System.out.print("enter the operator +,-,*,/");
    //     char operator = scanner.next().charAt(0);

    //     double result;

    //     switch(operator){
    //         case '+':
    //             result = num1 + num2 ;
    //             break;
    //         case '-':
    //             result= num1-num2;
    //             break;
    //         case '*':
    //             result = num1*num2;
    //             break;
    //         case '/':
    //             result= num1/num2;
    //             break;
            
    //         default:
    //             System.out.println("Wrong input");
    //             return;
    //     }
    //     System.out.println("The result is as follow : " + result);
    //     scanner.close();
//     }
// }


// public class test {
//     public static void main(String[] args) {
//         System.out.println("hello, World!");
//     }
// }

// public class test  {
//     public static void main(String[] args){
//         int a = 10 ;
//         int b = 20;
//         if ( a > b){
//             System.out.println("a is greater then b");
//         } else if (b > a){
//             System.out.println("b is greater then a");
//         }
//     }
// }

// Take input and find the factorial of entered no.
// import java.util.Scanner;
// public class test {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the no. here : ");
//         int num1 = scanner.nextInt();
//         System.out.println("you enter the : "+ num1);

//         long fact =  1;
//         for(int i = 1; i <= num1 ;i++){
//             fact*=i;
//         }
//         System.out.println("the Factorial of "+ num1 + " is : "+ fact);
//         scanner.close();
//     }

// }


class animal {
    public void eat() {
        System.out.println("this animal eat");
    }
}
class Dog extends animal {
    public void bark() {
        System.out.println("The Dog barks ");
    }
}
class Cat extends animal {
    public void meow() {
        System.out.println("this cats meow");
    }
}

public class test {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}