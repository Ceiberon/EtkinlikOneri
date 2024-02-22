import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sıcaklık;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava kaç derece ?");
        sıcaklık = input.nextDouble();

        if (sıcaklık < 5) {
            System.out.println(" Hava Kayağa gitmeye uygun");

        } else if (sıcaklık >= 5 && sıcaklık <= 15) {
            System.out.println("Hava Sinemaya gitmeye uygun");

        } else if (sıcaklık > 15 && sıcaklık <= 25) {
            System.out.println("Hava pikniğe gitmeye uygun");

        } else if (sıcaklık > 25) {
            System.out.println("Hava yüzmeye gitmeye uygun");
        }

    }

}

