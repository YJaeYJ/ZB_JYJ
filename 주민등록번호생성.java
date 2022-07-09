// 제로베이스 조영재

import java.util.Random;
import java.util.Scanner;

public class mini4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        String month2 = "";
        String day2 = "";
        String gender2 = "";
        boolean error = false;


        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy): ");
        int year1 = sc.nextInt();
        sc.nextLine();
        System.out.print("출생월을 입력해 주세요.(mm): ");
        int month1 = sc.nextInt();
        sc.nextLine();
        System.out.print("출생일을 입력해 주세요.(dd): ");
        int day1 = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력해 주세요. (m/f): ");
        String gender1 = sc.next();
        sc.nextLine();


        if (year1 > 0) {
            year1 = year1 % 100;
            sb.append(year1);
        }
        if (month1 < 10) {
            month2 = ("0" + month1);
            sb.append(month2);
        } else if (month1 > 12) {
            System.out.println("잘못된 출생월 입니다.");
            error = true;
        } else {
            sb.append(month1);
        }
        if (day1 < 10) {
            day2 = ("0" + day1);
            sb.append(day2);
        } else if (day1 > 31) {
            System.out.println("잘못된 출생일 입니다.");
            error = true;
        } else {
            sb.append(day1);
        }
        if (gender1.equals("m")) {
            gender2 = "-3";
            sb.append(gender2);
        } else if (gender1.equals("f")) {
            gender2 = "-4";
            sb.append(gender2);
        } else {
            System.out.println("잘못된 성별입니다.");
            error = true;

        }

        if (error == false) {
            for (int i = 0; i < 6; i++) {
                sb.append(random.nextInt(10));
            }
            System.out.println(sb);
        } else {
            System.out.println("다시 입력해주세요.");
        }

    }
}
