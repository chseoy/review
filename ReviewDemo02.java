import java.util.Scanner;
// Assignment v0.1
public class ReviewDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean isPrime;

        do {
            System.out.println("2이상의 정수를 입력하세요.");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        } while (num1 <= 1 || num2 <= 1);

        if(num2 < num1){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        for(int i = num1; i <= num2; i ++) {
            isPrime = true;
            for(int k = 2; k < i; k++) {
                if(i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println(i + " ");
        }
    }
}