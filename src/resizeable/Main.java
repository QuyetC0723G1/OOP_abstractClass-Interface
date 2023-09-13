package resizeable;

public class Main {

    public static void main(String[] args) {
        long a = Math.round(Math.random()*101 +1);
        System.out.println("percent is : " + a);

        Resizeable[] resizeable = new Resizeable[3];
        resizeable[0] = new Square(5.6);
        resizeable[1] = new Rectangle(7,4);
        resizeable[2] = new Circle(5.5);

        for (int i = 0; i < resizeable.length; i++) {
            resizeable[i].getAreaBeforeUp();
            if (resizeable[i] instanceof Colorable){
                ((Colorable) resizeable[i]).howTocolor();
            }
        }


//
//        resizeable[0].getAreaBeforeUp();
//        resizeable[0].getAreaLastUp(a);
//
//
//        resizeable[1].resize(a);
//        resizeable[1].getAreaBeforeUp();
//        resizeable[1].getAreaLastUp(a);

    }
}
