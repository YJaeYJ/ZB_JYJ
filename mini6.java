// 제로베이스 조영재

/*
3. 각 투표수의 결과는 4명의 대선주자들이 동일한 비율로 랜덤하게 발생(단, 당선자는 동율이 안됨)
    이부분을 어떻게 해야할지 몰라 진행하지 못하였습니다. 죄송합니다.
 */


import java.util.HashMap;
import java.util.Random;

public class mini6 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        Random random = new Random();

        map.put("이재명", 0);
        map.put("윤석열", 0);
        map.put("심상정", 0);
        map.put("안철수", 0);

        int aa1 = 0, aa2 = 0, aa3 = 0, aa4 = 0;     //  투표 수
        int totalTicket = 10000;
        int rd = 0;
        String name = "";
        String name2 = "";

        for (int i = 0; i < totalTicket + 1; i++) {
            rd = random.nextInt(4) + 1;
            System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => %s\n", i / (double) totalTicket * 100, i, name);
            System.out.printf("[기호:1] 이재명: %.2f%%, (투표수: %s)\n", aa1 / (double) totalTicket * 100, aa1);
            System.out.printf("[기호:2] 윤석열: %.2f%%, (투표수: %s)\n", aa2 / (double) totalTicket * 100, aa2);
            System.out.printf("[기호:3] 심상정: %.2f%%, (투표수: %s)\n", aa3 / (double) totalTicket * 100, aa3);
            System.out.printf("[기호:4] 안철수: %.2f%%, (투표수: %s)\n", aa4 / (double) totalTicket * 100, aa4);

            if (rd == 1) {   
                name = "이재명";
                aa1 += map.get(name) + 1;

            } else if (rd == 2) {
                name = "윤석열";
                aa2 += map.get(name) + 1;

            } else if (rd == 3) {
                name = "심상정";
                aa3 += map.get(name) + 1;

            } else if (rd == 4) {
                name = "안철수";
                aa4 += map.get(name) + 1;
            }
        }

        if (aa1 > aa2 && aa1 > aa3 && aa1 > aa4) {
            name2 = "이재명";
        } else if (aa2 > aa1 && aa2 > aa3 && aa2 > aa4) {
            name2 = "윤석열";
        } else if (aa3 > aa1 && aa3 > aa2 && aa3 > aa4) {
            name2 = "심상정";
        } else {
            name2 = "안철수";
        }

        System.out.printf("[투표결과] 당선인: %s", name2);


    }
}
