import java.util.Scanner;
// v0.1
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자기자신 외에는 나누어 떨어지지 않는 수
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;

        for (int k = 1; k <= num; k++) {
            if(num % k == 0)
                cnt++;
        }

        if(cnt == 2)
            System.out.println(num + "은(는) 소수입니다.");
        else
            System.out.println(num + "은(는) 소수가 아닙니다.");
    }
}
