import java.util.Scanner;

public class p11_USDtoBGN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double usd = input.nextDouble();
        double bgn=usd*1.79549;
        System.out.printf(".%2f",bgn);
    }
}
