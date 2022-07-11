// 제로베이스 조영재

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mini7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("[로또 당첨 프로그램]");
        System.out.print("\n로또 개수를 입력해 주세요.(숫자 1 ~ 10): ");
        int num = sc.nextInt();
        sc.nextLine();

        int[][] array = new int[num][6];        // 로또 번호
        int[] array2 = new int[6];               // 당첨 번호
        char ch = '@';
        int nn = 0;

        // 로또 번호 생성
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 6; j++) {
                int rd = random.nextInt(45) + 1;
                array[i][j] = rd;
                for (int k = 0; k < j; k++) {
                    if (array[i][j] == array[i][k]) {
                        j--;
                    }
                }
            }
        }

        //  나의 로또 번호 출력
        for (int i = 0; i < num; i++) {
            Arrays.sort(array[i]);
            ch++;
            System.out.println(ch + "\t" + Arrays.toString(array[i]));
        }

        // 당첨 번호 생성
        for (int i = 0; i < 6; i++) {
            int rd = random.nextInt(45) + 1;
            array2[i] = rd;
            for (int j = 0; j < i; j++) {
                if (array2[i] == array2[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(array2);
        System.out.println("\n[로또 발표]");
        System.out.println("\t" + Arrays.toString(array2));

        // 나의 로또 번호 출력 // 당첨 번호랑 일치하는지 확인
        ch = '@';
        System.out.println("\n[내 로또 결과]");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 7; k++) {
                    if (k == 6) {

                    } else if (array2[j] == array[i][k]) {
                        nn++;
                    }
                }
            }
            Arrays.sort(array[i]);
            ch++;
            System.out.println(ch + "\t" + Arrays.toString(array[i]) + " => " + nn + "개 일치");
            nn = 0;
        }

    }
}


