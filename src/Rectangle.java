public class Rectangle extends Shape{
    private double width=1;
    private double length =1;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double get_width() {
        return width;
    }

    public void set_width(double width) {
        this.width = width;
    }

    public double get_length() {
        return length;
    }

    public void set_length(double height) {
        this.length = height;
    }

    public double get_area(){
        return this.length*this.width;
    }

    public double get_perimeter(){
        return 2*(length+width);
    }

    public String to_string() {
        return "A Rectangle with width: "+this.width+" and length: "+this.length
                +", which is a subclass of "+super.to_string();
    }
}
