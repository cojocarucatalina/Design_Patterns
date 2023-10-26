package prototype;

public class Circle extends Prototype{

    private int radius;

    public Circle (Circle shape){
        super(shape);
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }
}
