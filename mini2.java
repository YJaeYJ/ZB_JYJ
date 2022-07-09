// 제로베이스 조영재

import java.util.Scanner;


public class mini2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액): ");
        int a = sc.nextInt();
        int b = 0;

        if (a > 0) {
            b = a / 10;
            if (b >= 300) {
                System.out.printf("결제 금액은 %d원이고, 캐시백은 300원 입니다.", a);
            } else if (b >= 200) {
                System.out.printf("결제 금액은 %d원이고, 캐시백은 200원 입니다. ", a);
            } else if (b >= 100) {
                System.out.printf("결제 금액은 %d원이고, 캐시백은 100원 입니다.", a);
            } else {
                System.out.printf("결제 금액은 %d원이고, 캐시백은 없습니다.", a);
            }
        }

    }
}
