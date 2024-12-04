import java.util.Scanner;

public class FibonacciSerisiHesaplama {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Hangi sayıya kadar fibonacci serisi oluşturmak istiyorsunuz? :");
        int number=scan.nextInt();

        int a=0, b=1;
        System.out.println("Fibonacci:"+a);

        while (b<=number){
            System.out.println(  b);
            int temp=b;

            b= a+b;
            a=temp;
        }

        System.out.println();
        scan.close();
    }
    
}
