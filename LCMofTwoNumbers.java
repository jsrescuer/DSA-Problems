public class LCMofTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        int hcf = 1;
        int lcm;
//        finding by HCF
        for (int i = 1; i<=num1 && i<=num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        lcm = (num1 * num2) / hcf;
        System.out.println("LCM is: " + lcm);
    }
}
