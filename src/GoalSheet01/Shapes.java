package GoalSheet01;

public class Shapes {
    public static void Shape1()
    {
        System.out.println("  ________");
       System.out.println(" /        \\");
       System.out.println("/          \\");
    }
    public static void Shape2()
    {
        System.out.println("\\          /");
        System.out.println(" \\        /");
        System.out.println("  ________");
    }
    public static void Line()
    {

        System.out.println("_\"_\'_\"_\'_\"_");
    }
    public static void main(String[] args) {
        Shape1();
        Shape2();
        System.out.println("\n");
        Line();
        System.out.println("\n");
        Shape1();
        Shape2();
        System.out.println("\n");
        Line();
        Shape2();
        System.out.println("\n");
        Shape1();
        Line();
        Shape2();


    }
}