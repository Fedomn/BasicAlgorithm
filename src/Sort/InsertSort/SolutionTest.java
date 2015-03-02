package Sort.InsertSort;

import junit.framework.TestCase;
import static Sort.util.test.testData;
import static Sort.util.test.resultData;

public class SolutionTest extends TestCase {

    public void testdirectInsertSort() {
        Solution.directInsertSort(testData.data);
        assertEquals(testData, resultData);
    }

    public void testhalfInsertSort() {
        Solution.halfInsetSort(testData.data);
        assertEquals(testData,resultData);
    }

    public void testshellSort() {
        Solution.shellSort(testData.data);
        assertEquals(testData,resultData);
    }
}
