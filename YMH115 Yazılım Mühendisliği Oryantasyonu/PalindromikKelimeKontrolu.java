import java.util.Locale;
import java.util.Scanner;

public class PalindromikKelimeKontrolu {
    public static void main(String[] args){
        try (Scanner input= new Scanner(System.in)) {
            System.out.println("Bir kelime giriniz:");
            String kelime=input.next();
        
            if (kelime.isEmpty()|| kelime.length()==1){
                System.out.println(kelime+ " kelimesi palindromik bir kelimedir");
            }

            kelime.toLowerCase(Locale.ROOT).replaceAll("\\s", "");

            int low=0;
            int high=kelime.length()-1;

            boolean isPalindrom=true;
            while(low<high){
                if( kelime.charAt(low) !=kelime.charAt(high)){
                    isPalindrom=false;
                    break;
                }
                low++;
                high--;
            }

            if( isPalindrom){
                System.out.println(kelime +" kelimesi palindromik bir kelimedir.");
            }else{
                System.out.println(kelime + " kelimesi palindromik bir kelime değildir");
            }
        }

    }
}
