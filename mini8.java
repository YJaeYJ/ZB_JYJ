import java.util.Scanner;

public class mini8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] val1 = {720000, 5100000, 10080000, 21700000, 57000000, 80000000, 210000000};
        int[] val2 = {6, 15, 24, 35, 38, 40, 42, 45};
        int[] val3 = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000};
        long lm = 1000000000;
        long money2 = 0;
        int ii = 0;
        long money3 = 0;
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("\n연소득을 입력해 주세요.: ");
        long money = sc.nextInt();
        sc.nextLine();

        if (money <= lm) {
            for (int i = 0; money > val3[i]; i++) {
                if (money > val3[i]) {
                    System.out.printf("%10d * %2d%% = %10d\n", val3[i], val2[i], val1[i]);
                    money -= val3[i];
                    ii++;
                    money3 += val1[i];
                }
            }
        } else if (money > lm) {        // 10억 넘으면
            for (int i = 0; i < 7; i++) {
                System.out.printf("%10d * %2d%% = %10d\n", val3[i], val2[i], val1[i]);
                money -= val3[i];
                ii++;
                money3 += val1[i];
            }
        }
        money2 = money * val2[ii] / 100;
        money3 += money2;
        System.out.printf("%10d * %2d%% = %10d\n", money, val2[ii], money2);
        System.out.printf("\n%-18s    %10d\n", "[세율에 의한 세금]:", money3);
        System.out.printf("%-18s %10d\n", "[누진공제 계산에 의한 세금]:", money3);


    }
}
