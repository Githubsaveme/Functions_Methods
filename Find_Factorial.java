    //4. Find the factorial of  a Number


import java.util.Scanner;

public class Find_Factorial {

	 public static  void printFactorial(int n ){
         //Loop
       if(n<0){
           System.out.println("Invalid");
           return;
       }
       int factorial=1;

       for(int i=n;i>=1;i--){
       factorial =factorial * i;
   }
       System.out.println("This is Factorial:-"+ factorial);
     return ;
}
 public static void main(String[] args) {
      System.out.println("Enter Number:-");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

printFactorial( n);
}
	}


