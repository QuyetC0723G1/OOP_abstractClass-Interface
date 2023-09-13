package jamesstudy;

public class Square extends Shape implements Resizeable,Colorable{
    private double size = 1.0;

    public Square(double size) {
        this.size = size;
    }
    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(size,2);
    }

    @Override
    public void resize(double percent) {
        this.size = (size * percent);
        System.out.println(" Cạnh của Square sau khi up là : " + size);
    }
    @Override
    public double getAreaLast(double percent) {
        this.size = size + (size * percent)/100;
        double area = Math.pow(size,2);
        System.out.println("Diện tích hình vuông sau khi tăng size là : " +area);
        return area;
    }
    @Override
    public void howTocolor() {
        System.out.println("Color all four sides");
    }
}
