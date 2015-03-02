package Sort.MergeSort;


public final class Solution {
    private Solution() {
    }

    /**
     * MergeSort 逐个递归直到有序数列只有1个元素
     */
    public static void MergeSort(int a[], int left, int right){
        if(left >= right) return;
        int mid = (left + right) / 2;

        //二路归并排序里面有两个MergeSort，多路归并排序里面写多个MergeSort就可以了
        MergeSort(a, left, mid);
        MergeSort(a, mid + 1, right);
        MergeArray(a, left, mid, right);
    }

    /**
     * 将有二个有序数列a[first...mid]和a[mid...last]合并
     */
    private static void MergeArray(int a[], int left, int mid, int right){
        int[] temp = new int[a.length];
        int i = left, j = mid + 1, k = 0;

        //逐个归并
        while(i <= mid && j <= right){
            if(a[i] <= a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        //将左边剩余的归并
        while(i <= mid)
            temp[k++] = a[i++];
        //将右边剩余的归并
        while(j <= right)
            temp[k++] = a[j++];

        //从临时数组拷贝到原数组
        for(int index = 0; index < k; index++)
            a[left + index] = temp[index];
    }
}
