import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("What number would you like the factorial of? ");
        int number = scanner1.nextInt();
        System.out.println();
        System.out.println("Initial Value: " + number);
        System.out.println("Pure Recursive: " + pureRecursive(number));
        System.out.println("Tail Recursive: " + tailRecursive(number));
        System.out.println("Iterative: " + iterative(number));
    }
    //The function ofpure recursive
    public static long pureRecursive(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("Number is non-positive!");
        }
        long result;
        if (n == 1)
        {
            return 1;
        }
        result = pureRecursive(n-1) * n;
        return result;
    }
    //The function of tail recursive
    public static long tailRecursive(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("Number is non-positive!");
        }
        return tail(n,1);
    }
    //Actual function of tail recursive
    private static long tail(int n, long add)
    {
        if (n == 1)
        {
            return add;
        }
        return tail(n -1, n * add);
    }
    //Factorial calculation
    public static long iterative(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("Number is non-positive!");
        }
        long fac = 1;
        long i = 1;
        while (i <= n)
        {
            fac = fac * i;
            i++;
        }
        return fac;
    }
}