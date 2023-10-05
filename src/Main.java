import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //Hotellets växter
        VäxtNamn laura = new Palmer("Palmen Laura", 5);  //Exempel på polymorfism
        Palmer olof = new Palmer("Palmen Olof", 1);
        KöttätandeVäxter meatloaf = new KöttätandeVäxter("Köttätande växten Meatloaf", 0.7);
        Kaktusar igge = new Kaktusar("Kaktusen Igge", 0.2);



        Scanner scanner = new Scanner(System.in);  //Tar in user-input
        System.out.println("Vilken växt ska få mat?");
        String input = scanner.nextLine().toUpperCase();
        if (input.equals("PALMEN LAURA")) {
            laura.MängdenVätskaUtskrift();
        } else if (input.equals("PALMEN OLOF")) {
            olof.MängdenVätskaUtskrift();
        }

        else if (input.equals("KÖTTÄTANDE VÄXTEN MEATLOAF")) {
            meatloaf.MängdenVätskaUtskrift();
        }
        else if (input.equals("KAKTUSEN IGGE")) {
            igge.MängdenVätskaUtskrift();

        }else {
            System.out.println("Denna växt finns ej i växthuset. Vänligen ange en annan växt");
        }


    }
}