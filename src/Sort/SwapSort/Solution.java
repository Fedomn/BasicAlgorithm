package Sort.SwapSort;

public final class Solution {
    private Solution() {
    }

    /**
     * 冒泡排序
     */
    public static void BubbleSort(int arr[]){
        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < len - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     */
    public static void QuickSort(int arr[],int left, int right){
        if(left >= right) return;
        int i = left, j = right;
        int temp = arr[left];//设置基准数

        while(i != j){
            while(arr[j] >= temp && i < j) j--;//从右边开始找 小于基准的数 停下
            while(arr[i] <= temp && i < j) i++;//从左边开始找 大于基准的数 停下
            if(i < j){//交换2个数字位置
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //将基准数交换与停下位置交换 此时停下位置的数 一定小于 基准数
        arr[left] = arr[i];
        arr[i] = temp;

        //递归执行分出的2个区域
        QuickSort(arr, left, i - 1);
        QuickSort(arr, i + 1, right);
    }
}
