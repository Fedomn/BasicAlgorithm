package Sort.SelectSort;

import junit.framework.TestCase;

import static Sort.util.test.resultData;
import static Sort.util.test.testData;

public class SolutionTest extends TestCase {

    public void testDirectSelectSort() {
        Solution.DirectSelectSort(testData.data);
        assertEquals(testData, resultData);
    }

    public void testHeapSort(){
        Solution.HeapSort(testData.data);
        assertEquals(testData,resultData);
    }

}
