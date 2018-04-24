import java.util.Scanner;

public class p10_RadianstoDegrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double angle = input.nextDouble();
        double result = Math.round(angle*180/Math.PI);
        System.out.println(result);
    }
}
