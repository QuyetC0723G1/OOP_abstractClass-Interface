package jamesstudy;

public interface Resizeable {
    public void resize(double percent);
    public default double getAreaLast(double percent){
        return 0;
    }
}