package creational.PrototypeDesignPattern;

public abstract class Shape {
    private String color;
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

}
