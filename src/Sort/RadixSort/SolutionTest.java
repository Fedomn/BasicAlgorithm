package Sort.RadixSort;

import junit.framework.TestCase;
import static Sort.util.test.testData;
import static Sort.util.test.resultData;

public class SolutionTest  extends TestCase {
    public void testRadixSort(){
        Solution.RadixSort(testData.data, 1, 10);
        assertEquals(testData, resultData);
    }

}
