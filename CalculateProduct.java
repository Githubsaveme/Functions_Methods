//3. Make a function to multiply 2 Numbers and return the product.
import java.util.Scanner;

public class CalculateProduct {

	// 1st Method
//	public static int calculateproduct(int a,int b){
//         int product= a * b;
//         return product;
//     }
//     public static void main(String args[]){
//         System.out.print("Enter number:="+" ");
//         Scanner sc=new Scanner(System.in);{
//             int a=sc.nextInt();
//             int b= sc.nextInt();
//
//             int product=calculateproduct(a,b);{
//                 System.out.println("Product of 2 Number is:"+ product);
//             }
//         }
               
         
          //2nd Method
         public static int calculateproduct(int a, int b) {
             return a * b;
         }


         public static void main(String args[]) {
             System.out.println("Enter numbers:" + " ");
             Scanner sc = new Scanner(System.in);
             {
                 int a = sc.nextInt();
                 int b = sc.nextInt();

                 System.out.println("product of 2 number:- " + calculateproduct(a, b));
             }
	}

}
