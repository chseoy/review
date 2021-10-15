import java.util.Scanner;
//v0.7 매서드 사용
public class ReviewDemo01 {
    public static boolean isPrime(int n){
        boolean prime = true;

        int k = 2;
        while (k < n) {
            if(n % k ==0) {
                prime = false;
                break;
            }
            k++;
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do{
            System.out.println("2 이상의 정수를 입력하세요.");
            number = sc.nextInt();
        } while (number <= 1);

        System.out.println(number + (isPrime(number) ? "은(는) 소수!" : "은(는) 소수가 아닙니다."));
    }
}

//import java.util.Scanner;
////v0.6 for문을 while문으로
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean isPrime = true;
//
//        int k = 2;
//        while(k<number) {
//            if (number % k == 00) {
//                isPrime = false;
//                break;
//            }
//            k++;
//        }
//
//        if(isPrime) // isPrime 변수 값이 true면
//            System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수가 아닙니다");
//    }
//}

//import java.util.Scanner;
////v0.5 for문 안의 불필요한 반복횟수 더더더 줄이기
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean isPrime = true;
//
//        for(int k=2; k<number; k++){ // 반복 횟수 2회 감소
//            if(number % k == 0) {
//                isPrime = false;
//                break; // 첫번째 약수가 발견되면 for문 탈출
//            }
//        }
//
//        if(isPrime) // isPrime 변수 값이 true면
//            System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수가 아닙니다");
//    }
//}

//import java.util.Scanner;
////v0.3 가독성 증가
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean isPrime = true;
//
//        for(int k=2; k<number; k++){ // 반복 횟수 2회 감소
//            if(number % k == 0)
//                isPrime = false;
//        }
//
//        if(isPrime) // isPrime 변수 값이 true면
//            System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수가 아닙니다");
//    }
//}

//import java.util.Scanner;
////v0.2 for 반복 횟수 2회 감소
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int cnt = 0;
//
//        for(int k=2; k<number; k++){ // 반복 횟수 2회 감소
//            if(number % k == 0)
//                cnt++;
//        }
//
//        if(cnt == 0) // 카운트가 0이 유지되면 true
//            System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수가 아닙니다");
//    }
//}
//
//
////import java.util.Scanner;
////// v0.1
////public class ReviewDemo01 {
////    public static void main(String[] args) {
////        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
////        Scanner sc = new Scanner(System.in);
////        int number = sc.nextInt();
////        int cnt = 0;
////
////        for(int k=1; k<=number; k++){
////            if(number % k == 0)
////                cnt++;
////        }
////
////        if(cnt == 2)
////            System.out.println(number + "은(는) 소수!");
////        else
////            System.out.println(number + "은(는) 소수가 아닙니다");
////    }
////}