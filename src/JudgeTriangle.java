/* Created by AMXPC on 2017/3/15. */

public class JudgeTriangle {
    public static boolean judgeTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c && b + c > a && c + a > b);
    }
}
