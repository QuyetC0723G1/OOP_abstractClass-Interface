package resizeable;

public class Square implements Resizeable,Colorable {
    double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        this.size = size+ (size * percent)/100;
        System.out.println(" Cạnh của Square sau khi up là : " + size);
    }

    @Override
    public void getAreaBeforeUp() {
        System.out.println("Diện tích hình vuông trước khi tăng size là : " + Math.pow(size,2));
    }

    @Override
    public void getAreaLastUp(double percent) {
        this.size = size + (size * percent)/100;
        double area = Math.pow(size,2);
        System.out.println("Diện tích hình vuông sau khi tăng size là : " +area);
    }

    @Override
    public void howTocolor() {
        System.out.println("Color all four sides");
    }
}
