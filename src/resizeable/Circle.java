package resizeable;

public class Circle implements Resizeable {
    double size;

    public Circle(double radius) {
        this.size = radius;
    }

    @Override
    public void resize(double percent) {
        this.size = (size * percent);
        System.out.println(" Cạnh của Square sau khi up là : " + size);
    }
    @Override
    public void getAreaBeforeUp() {
        double area = Math.pow(size,2)*Math.PI;
        System.out.println("Diện tích Circle trước khi up kích thước là : " +area);
    }

    @Override
    public void getAreaLastUp(double percent) {
        this.size = size + (size*percent)/100;
        double area = Math.pow(size,2);
        System.out.println("Diện tích Circle sau khi up kích thước là : " +area);
    }



}
