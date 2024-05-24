import interfaces.Phone;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Rafki Desramadhan");
        Phone redmiNote10 = new Xiaomi();

        PhoneUser dian = new PhoneUser(redmiNote10);

        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do {
            System.out.println("===Aplikasi Interface===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("=========================");

            System.out.println("Pilih aksi : ");
            aksi = input.next();

            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();   
            } else if(aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            } else if(aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            } else if(aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            } else if(aksi.equalsIgnoreCase("0")){
                isLooping = false;
            }
        } while(isLooping);
    }
}