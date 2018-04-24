import java.util.Scanner;

public class p12_CurrencyConverter {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        double money = Double.parseDouble(console.nextLine());
        String currency1 = (console.nextLine());
        String currency2 = (console.nextLine());
        double result = 0.0;
        if (currency1.equals("BGN"))
        {
            if (currency2.equals("EUR"))
            { result = money / 1.95583; }
            else if (currency2.equals("GBP"))
            { result = money / 2.53405; }
            else
            { result = money / 1.79549; }
        }
        else if (currency1.equals("EUR"))
        {
            if (currency2.equals("BGN"))
            { result = money * 1.95583; }
            else if (currency2.equals("GBP"))
            { result = (money * 1.95583) / 2.53405; }
            else
            { result = (money / 1.79549) * 1.95583; }
        }
        else if (currency1.equals("USD"))
        {
            if (currency2.equals("BGN"))
            { result = money * 1.79549; }
            else if (currency2.equals("GBP"))
            { result = (money / 2.53405) * 1.79549; }
            else
            { result = (money / 1.95583) * 1.79549; }
        }
        else
        {
            if (currency2.equals("BGN"))
            {result = money * 2.53405;}
            else if (currency2.equals("EUR"))
            {result = (money / 1.95583) * 2.53405;  }
            else
            {  result = (money / 1.7954954) * 2.53405; }  }
        System.out.printf("%.2f %s",result,currency2);

    }
}

