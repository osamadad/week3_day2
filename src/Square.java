public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double get_side(){
        return super.get_width();
    }

    public void set_side(double side){
        super.set_width(side);
    }

//    public double get_area(){
//
//    }                                             /* you don't need to override these 2 method because the results are the same */
//
//    public double get_perimeter(){
//
//    }

    public String to_string(){
        return "A Square with side: "+get_side()+", which is a subclass of "+super.to_string();
    }
}
