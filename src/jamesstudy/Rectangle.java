package jamesstudy;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * this.length;
    }
    public double getPerimeter() {
        return 2 * (width + this.length);
    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width = width+ (width * percent)/100;
        this.length = length + (length * percent)/100;
        System.out.println("Chiều dài của rectangle sau khi tăng : "+ width);
        System.out.println("Chiều rộng của rectangle sau khi tăng : " + length);
    }

    @Override
    public double getAreaLast(double percent) {
        this.width = width + (width * percent)/100;
        this.length = length + (length * percent)/100;
        double area = width * length ;
        System.out.println("Area of Rectangle last up is : " + area);
        return area;
    }
}