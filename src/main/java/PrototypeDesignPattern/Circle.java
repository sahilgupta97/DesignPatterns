package PrototypeDesignPattern;

public class Circle extends Shape {
    private int radius;

    Circle(Circle target) {
        super(target);
        if(target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
