public class PermutationCombination {
    public static void main(String[] args) {
        int n = 10, r = 5;
        int permutation;
        int combination;
        int nFactorial;
        int nMinusRFactorial;

//    Permutation formula: nPr = n! / (n-r)!
//    Combination formula: nCr = n! / (r! * (n-r)!)

        nFactorial = factorial(n);
        nMinusRFactorial = factorial(n-r);
        permutation = nFactorial / nMinusRFactorial;
        combination = nFactorial / (factorial(r) * nMinusRFactorial);

        System.out.println("Permutation = "+permutation);
        System.out.println("Combination = "+combination);
    }

    //    Calculating factorial
    public static int factorial(int n) {
        int factorial = 1;
        for (int i=1; i<= n; i++) {
            factorial *=i;
        }
        return factorial;
    }
}
