package Sort.SwapSort;

import junit.framework.TestCase;

import static Sort.util.test.testData;
import static Sort.util.test.resultData;

public class SolutionTest extends TestCase {
    public void testBubbleSort() {
        Solution.BubbleSort(testData.data);
        assertEquals(testData, resultData);
    }

    public void testQuickSort(){
        Solution.QuickSort(testData.data,0,testData.data.length-1);
        assertEquals(testData, resultData);
    }


}
