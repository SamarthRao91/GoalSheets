public class Quadratic {
    public static void main(String[] args) {
       quadraticFunction(2,4,5);
    }
    public static void quadraticFunction(int a, int b, int c)
    {
        double derivative = (Math.sqrt(((b*b)-(4*a*c))));
        double solution1 = (-b + derivative)/(2*a);
        double solution2 = (-b - derivative)/(2*a);


        System.out.println("Solution #1 " + solution1 + "\n");
        System.out.println("Solution #2 " + solution2);


    }
}
