package resizeable;

public class Rectangle implements Resizeable{
    double width;
    double height;
    double percent;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        System.out.println("Chiều dài của rectangle trước khi tăng là : ");
        return width;
    }
    public double getHeight() {
        System.out.println("Chiều cao của rectangle trước khi tăng là : ");
        return height;
    }
    @Override
    public void resize(double percent) {
        this.width = width+ (width * percent)/100;
        this.height = height + (height * percent)/100;
        System.out.println("Chiều dài của rectangle sau khi tăng : "+ width);
        System.out.println("Chiều rộng của rectangle sau khi tăng : " + height);
    }

    @Override
    public void getAreaBeforeUp() {
        double area = height * width;
        System.out.println("Area of Rectangle before up is : "+ area );
    }

    @Override
    public void getAreaLastUp(double percent) {
        this.width = width + (width * percent)/100;
        this.height = height + (height * percent)/100;
        double area = width * height ;
        System.out.println("Area of Rectangle last up is : " + area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
