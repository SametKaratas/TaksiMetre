import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, ucret;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac km gittiniz :");
        km = input.nextDouble();
        ucret = (km * 2.20) + 10;
        ucret = (ucret < 20) ? 20 : ucret; 
        System.out.print("tutar :" + ucret);
    }
}