/* Created by AMXPC on 2017/3/15. */

import java.util.ArrayList;

public class TestDate implements Test {
    public static void main(String[] args) {
        Executor executor = new Executor("testResource\\Date.xls", "testResource\\DateTest.xls", "Date");
        TestDate testDate = new TestDate();
        try {
            ArrayList<Object> result = executor.execute(testDate, TestDate.class.getMethod("invoke", Object.class), 1, 8);
            executor.write(result, 2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public String invoke(Object args) throws Exception {
        String[] argdata = (String[]) args;
        String arg1 = argdata[0];
        return NextDate.getNextDate(arg1);
    }
}
