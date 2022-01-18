import java.util.Scanner;


//Functions & Methods | Java Complete Placement Course | Lecture 7

//1. Print a given name in a function
public class Function {
    public static void printMyName(String name) {

        System.out.println(name);
        return;
    }

    public static  void main(String args[]) {
        System.out.print("Enter Name:-"+" ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);

    }
    
}