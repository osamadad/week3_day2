public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color="green";
        this.filled=true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String get_color() {
        return color;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public boolean is_filled() {
        return filled;
    }

    public void set_filled(boolean filled) {
        this.filled = filled;
    }

    public String to_string(){
        if (this.filled){
            return  "A Shape with color of "+this.color+" and filled";
        }
        else {
            return  "A Shape with color of "+this.color+" and Not filled";
        }
    }
}
