public class Factorial {
    public int factorial(int n) {
        // implementation
        
        int fact = 0;
        
        if (n == 0 || n == 1)
            return 1;
        else
            fact = n * factorial(n-1); //Recursion used
        
        return fact;
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(new Factorial().factorial(number));
    }
}
