import java.util.Scanner;

//2. Make a function to add 2 Numbers and return the sum
       
 public class Calculatesum {

public static int calculatesum(int a,int b){
           int sum= a + b;
           return sum;
    }
    public static void main(String args[]){
        System.out.print("Enter number:="+" ");
           Scanner sc=new Scanner(System.in);{
               int a=sc.nextInt();
               int b= sc.nextInt();

               int sum=calculatesum(a,b);{
                System.out.println("Sum of 2 Number is:"+sum);
            }
        }
    }
    }