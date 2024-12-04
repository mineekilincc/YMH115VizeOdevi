import java.util.Random;
import java.util.Scanner;

public class SayiTahmini{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Random rastgele= new Random();

        int rastegele_sayi= 1 + rastgele.nextInt(49);

        //System.out.println("Rastgele atanan sayı=" + rastegele_sayi);
        System.out.println("Rastgele sayı 1 ile 50 arasındadır.");

        int sayi, sayac=0;

        do{
            System.out.print("Bir sayı giriniz:");
            sayi=scan.nextInt();

            if(sayi> rastegele_sayi){
                System.out.println("Sayıyı küçültün.");
            } else if(sayi<rastegele_sayi){
                System.out.println("Sayıyı büyültün.");
            }
            sayac++;
        }
        while(sayi !=rastegele_sayi);
        System.out.println("Tebrikler. "+ sayac+". denemede buldunuz.");
        scan.close();
    }
}