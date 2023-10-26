package prototype;

public class Rectangle extends Prototype {


    private int width;
    private int height;

    public Rectangle(Rectangle shape){
        super(shape);
        this.width = shape.width;
        this.height = shape.height;
    }
    @Override
    public Prototype clone() {
        return new Rectangle(this);
    }
}
