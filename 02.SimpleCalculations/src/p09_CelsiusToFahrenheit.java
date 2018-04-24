import java.util.Scanner;

public class p09_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double celsius = input.nextDouble();
        double fahrenheit=(celsius * 9 / 5.0) + 32;
        System.out.printf("%.2f",fahrenheit);
    }
}
