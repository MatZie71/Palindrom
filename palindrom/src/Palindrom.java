import java.util.Scanner;

public class Palindrom{
String haslo;
boolean zadanie(String wpisanyWyraz){
    haslo=wpisanyWyraz;



    String malyWyraz=wpisanyWyraz.toLowerCase();
    String bezSpacji = malyWyraz.replace(" ", "");
    int dlugoscHasla=bezSpacji.length();
    //   System.out.println(bezSpacji);
//int x=0;
//if(0++)


    boolean czyPalindrom=true;

    for(int x=0;x<bezSpacji.length();x++){
        if((bezSpacji.charAt(x) != bezSpacji.charAt(--dlugoscHasla))){

            czyPalindrom=false;
        }
    }
return czyPalindrom;


}
    
}
class PalindromTest {

    public static void main(String[]args){
Palindrom palindrom=new Palindrom();
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz:");
        String wpisanyWyraz = scan.nextLine();


        if(palindrom.zadanie(wpisanyWyraz)==true){
            System.out.println("Twoje zdanie jest palindromem");
        }

        else{
            System.out.println("Twoje zdanie nie jest palindromem");

        }



}
}
