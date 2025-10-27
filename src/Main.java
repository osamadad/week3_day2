//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //-----------------------------------------------------------------------
        // shape test

//        Shape shape1= new Shape();
//        Shape shape2=new Shape("Red",true);
//
//        System.out.println(shape1.get_color());
//        System.out.println(shape1.is_filled());
//        shape1.set_color("blue");
//        shape1.set_filled(false);
//
//        System.out.println(shape1.to_string());
//        System.out.println(shape2.to_string());

        //-----------------------------------------------------------------------
        // circle test

        Circle circle1=new Circle();
        Circle circle2=new Circle(5.5);
        Circle circle3=new Circle("purple",true,15);

        System.out.println("the color of the first circle is: "+circle1.get_color());
        System.out.println("the radius of the first circle is: "+circle1.get_radius());

        circle2.set_radius(6.5);
        circle2.set_color("red");

        System.out.println("The area of the third circle is: "+circle3.get_area());
        System.out.println("The perimeter of the third circle is: "+circle3.get_perimeter());

        System.out.println(circle1.to_string());
        System.out.println(circle2.to_string());
        System.out.println(circle3.to_string());

    }
}