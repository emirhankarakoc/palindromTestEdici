import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = scanner.nextInt();
        String kopya = ""+sayi;
        String dumbelek = "";
        char ch;
        for(int i=0;i<kopya.length();i++){
            ch = kopya.charAt(i);
            dumbelek = ch + dumbelek ;
        }
        int test = 0;
        for(int j = 0;j<kopya.length();j++){
            if(kopya.charAt(j)==dumbelek.charAt(j)) test++;
        }
if(test == kopya.length())
    System.out.println("Palindromdur");
else System.out.println("Palindrom degildir.");

       // for(int i =0;i<kopya.length();i++){
      //      if()
     //   }


    }
}