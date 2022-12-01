import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int birthyear;
        String zodyak="";

        System.out.print("Dogum yilinizi giriniz:");
        birthyear=scan.nextInt();

        switch(birthyear%12){
            case 0:
            zodyak="Maymun";
            break;
            case 1:
            zodyak="Horoz";
            break;
            case 2:
            zodyak="Kopek";
            break;
            case 3:
            zodyak="Domuz";
            break;
            case 4:
            zodyak="Fare";
            break;
            case 5:
            zodyak="Okuz";
            break;
            case 6:
            zodyak="Kaplan";
            break;
            case 7:
            zodyak="Tavsan";
            break;
            case 8:
            zodyak="Ejderha";
            break;
            case 9:
            zodyak="Yilan";
            break;
            case 10:
            zodyak="At";
            break;
            case 11:
            zodyak="Koyun";
            break;
        }
        System.out.print("Cin Zodyagi Burcunuz:"+zodyak);

    }
}
