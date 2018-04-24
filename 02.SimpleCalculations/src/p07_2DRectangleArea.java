import java.util.Scanner;

public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());


        double width= Math.abs(x2-x1);
        double height=Math.abs(y2-y1);
        double area=width*height;
        double perimeter=2*(width+height);
        System.out.println(Math.abs(area));
        System.out.println(Math.abs(perimeter));
    }
}
