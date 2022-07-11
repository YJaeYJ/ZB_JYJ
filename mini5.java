// 제로베이스 조영재

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class mini5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week3 = 0;
        int dayMax = 0;
        int year = 0;
        int month = 0;

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy): ");
        year = sc.nextInt();
        sc.nextLine();
        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        month = sc.nextInt();
        sc.nextLine();


        if (month < 13) {
            System.out.printf("[%s년 %s월]\n", year, month);
            System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

            LocalDate select = LocalDate.of(year, month, 1);
            DayOfWeek week2 = select.getDayOfWeek();        // DayOfWeek 객체 생성
            week3 = week2.getValue();                       // 요일 숫자 확인
            dayMax = select.lengthOfMonth();                // 최대 일수 확인
        } else {
            System.out.println("잘못된 입력값입니다.");
            System.out.println("다시 실행해주세요.");
        }
        if (week3 > 0 && week3 < 7) {
            for (int i = 0; i < week3; i++) {
                System.out.print("\t");
            }
        }
        for (int i = 1; i < dayMax + 1; i++) {
            System.out.printf("%02d", i);
            System.out.print("\t");
            week3++;
            if (week3 % 7 == 0) {
                System.out.println();
            }
        }


    }
}

