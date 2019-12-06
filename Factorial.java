public class Factorial {
    // main function
    public static void main(String[] args) {
        for (int i = -1; i <= 15; i++) {
            try {
                System.out.println("Iterative output for " + i + " input: " + iterative(i));
            } catch (Exception e) {
                System.out.println("Iterative error for " + i + " input");
            }
            try {
                System.out.println("Pure recursion output for " + i + " input: " + pureRecursive(i));
            } catch (Exception e) {
                System.out.println("Pure recursion error for " + i + " input");
            }
            try {
                System.out.println("Tail recursion output for " + i + " input: " + tailRecursive(i));
            } catch (Exception e) {
                System.out.println("Tail recursion error for " + i + " input");
            }
            System.out.println("");
        }
    }

    // Recursive function to find factorial of a number
    public static long pureRecursive(int n)
    {
        if (n == 1) {
            return 1;
        }
        if(n <= 0) {
            throw new IllegalArgumentException();
        }
        return n*pureRecursive(n-1);
    }

    // A method for tail recursion which will only call tail() method
    public static Long tailRecursive(int n)
    {
        return tail(n, 1);
    }

    //A method for tail recursion
    private static Long tail(int n, int z)
    {
        if (n == 1)
            return (long)z;
        if(n <= 0) {
            throw new IllegalArgumentException();
        }
        return tail(n - 1, n * z);
    }

    //using iterative version
    public static long iterative(int n)
    {
        int param = 1;
        if(n <= 0) {
            throw new IllegalArgumentException();
        }
        for (int j = 1; j <= n; j++ )
            param *= j;
        return param;
    }
}