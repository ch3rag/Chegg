public abstract class AbstractShape implements Shape {

    private final String shapeName;

    public AbstractShape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return "Shape is a " + shapeName;
    }
}
