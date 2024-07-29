import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine().trim());  // 첫 줄에서 num을 읽어옴

        for (int i = 0; i < num; i++) {
            if (in.hasNextLine()) {
                String[] nums = in.nextLine().trim().split(" ");  // 한 줄을 읽고 공백으로 분리
                if (nums.length == 6) {  // 입력값이 6개인지 확인
                    int x1 = Integer.parseInt(nums[0]);
                    int y1 = Integer.parseInt(nums[1]);
                    int r1 = Integer.parseInt(nums[2]);

                    int x2 = Integer.parseInt(nums[3]);
                    int y2 = Integer.parseInt(nums[4]);
                    int r2 = Integer.parseInt(nums[5]);

                    double dx = Math.pow(x2 - x1, 2);
                    double dy = Math.pow(y2 - y1, 2);

                    double d = Math.sqrt(dx + dy);
                    if (d == 0 && r1 == r2) {
                        System.out.println(-1);
                    } else if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                        System.out.println(1);
                    } else if (Math.abs(r1 - r2) < d && d < r1 + r2) {
                        System.out.println(2);
                    } else {
                        System.out.println(0);
                    }
                } else {
                    System.out.println("입력값이 올바르지 않습니다.");
                }
            }
        }
        in.close();
    }
}