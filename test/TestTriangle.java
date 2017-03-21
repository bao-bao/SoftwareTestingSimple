/* Created by AMXPC on 2017/3/15. */

import java.util.ArrayList;

public class TestTriangle implements Test {
    public static void main(String[] args) {
        Executor executor = new Executor("testResource\\Triangle.xls", "testResource\\TriangleTest.xls", "Triangle");
        TestTriangle testTriangle = new TestTriangle();
        try {
            ArrayList<Object> result = executor.execute(testTriangle, TestTriangle.class.getMethod("invoke", Object.class), 3, 1);
            executor.write(result, 4);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public Boolean invoke(Object args) {
        String[] argdata = (String[]) args;
        double arg1 = Double.valueOf(argdata[0]);
        double arg2 = Integer.valueOf(argdata[1]);
        double arg3 = Integer.valueOf(argdata[2]);
        return JudgeTriangle.judgeTriangle(arg1, arg2, arg3);
    }
}
