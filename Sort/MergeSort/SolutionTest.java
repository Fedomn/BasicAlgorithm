package Sort.MergeSort;

import junit.framework.TestCase;
import static Sort.util.test.testData;
import static Sort.util.test.resultData;

public class SolutionTest extends TestCase {

    public void testMergeSort() {
        Solution.MergeSort(testData.data, 0, testData.data.length - 1);
        assertEquals(testData, resultData);
    }
}
