public class Circle extends Shape{
    private double radius=1;
    private final double pi=3.141592;

    public Circle() {
        super();            /* redundant */
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double get_radius() {
        return radius;
    }

    public void set_radius(double radius) {
        this.radius = radius;
    }

    public double get_area(){
        return this.pi*(Math.pow(this.radius,2));
    }

    public double get_perimeter(){
        return 2*this.pi*this.radius;
    }

    public String to_string(){
        return "A Circle with radius of "+this.radius+", which is a subclass of "+super.to_string();
    }
}
