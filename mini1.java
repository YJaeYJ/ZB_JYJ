// 제로베이스 조영재

public class mini1 {


    public static void main(String[] args) {



        System.out.println("[구구단 출력]");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int A = i * j;
                String aa = String.format("%d X %d = %d\t\t", j, i, A);
                System.out.print(aa);

                if (j == 9) {
                    System.out.println();
                }
            }

        }

    }
}





