package picard;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by farjoun on 10/22/17.
 */
public class TestStringUtilSplitTest {

    @Test( invocationCount = 10, successPercentage = 50)
    public void TestTestStringUtilSplit() {

        TestStringUtilSplit tester = new TestStringUtilSplit();
        Assert.assertTrue(tester.run() > 0.7, "We should stop using StringUtil.split as the StringTokenizer takes less than 70% of the time");
    }
}