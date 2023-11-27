import java.util.Scanner;
public class odev6 {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut : ");
        armut = input.nextDouble();

        System.out.print("Elma : ");
        elma = input.nextDouble();

        System.out.print("Domates : ");
        domates = input.nextDouble();

        System.out.print("Muz : ");
        muz = input.nextDouble();

        System.out.print("Patlıcan : ");
        patlican = input.nextDouble();

        toplam = armut + elma + domates + muz + patlican;
        System.out.print("Toplam : " + toplam);


    }
}


