//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape1= new Shape();
        Shape shape2=new Shape("Red",true);

        System.out.println(shape1.get_color());
        System.out.println(shape1.is_filled());
        shape1.set_color("blue");
        shape1.set_filled(false);

        System.out.println(shape1.to_string());
        System.out.println(shape2.to_string());
    }
}