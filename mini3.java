// 제로베이스 조영재

import java.util.Scanner;

public class mini3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tk = 0;

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자): ");
        int a = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력): ");
        int b = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n): ");
        char c = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n): ");
        char d = sc.next().charAt(0);
        sc.nextLine();

        if (a < 3) {
            tk = 0;
        } else if (a < 13 || b >= 17) {
            tk = 4000;
        } else if (c == 'y' || d == 'y') {
            tk = 8000;
        } else {
            tk = 10000;
        }
        System.out.print("입장료: " + tk);


    }
}
