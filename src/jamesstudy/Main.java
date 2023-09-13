package jamesstudy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r =new Random();
        int a = r.nextInt(100);
        System.out.println("percent is : " + a);

        Resizeable[] resizeable = new Shape[3];
        resizeable[0] = new Square(5);
        resizeable[1] = new Circle(6);
        resizeable[2] = new Rectangle(4,6);
        for (Resizeable value : resizeable) {
            value.getAreaLast(a);
            if (value instanceof Colorable) {
                ((Colorable) value).howTocolor();
            }
        }






    }
}
