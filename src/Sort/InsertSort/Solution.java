package Sort.InsertSort;

/**
 *	插入排序包含：1、直接插入排序 	2、折半插入排序		3、希尔排序
 */
public final class Solution {
    private Solution(){}

    /**
     * 直接插入排序
     */
    public static void directInsertSort(int arr[]){
        int len = arr.length;
        int i,j;
        for(i=1; i<len; i++){
            int key = arr[i];
            for(j=i-1; j>=0 && arr[j] > key; j--)//从有序区最后往前比较 找出位置 并后移
                arr[j+1] = arr[j];
            arr[j+1] = key;
        }
    }

    /**
     * 折半插入排序
     */
    public static void halfInsetSort(int arr[]){
        int len = arr.length;
        int i,j;
        for(i = 1; i < len; i++){
            int key = arr[i];
            int mid, low = 0, high = i - 1;//在有序区里进行折半查找
            while(low <= high){
                mid = (low + high) / 2;
                if(key > arr[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            //找到了位置low
            for(j = i - 1; j >= low ;j--)
                arr[j+1] = arr[j];
            arr[j+1] = key;
        }
    }

    /**
     * 希尔排序
     */
    public static void shellSort(int arr[]){
        int len = arr.length;
        for(int gap = len / 2; gap > 0 ; gap /= 2)//获取步长
            for(int i = gap; i < len; i++)//从每组最后一个开始 直接插入排序
                for(int j = i - gap; j >= 0 && arr[j] > arr[j+gap]; j -= gap){//比较每组中前面的数据 进行交换
                    int temp = arr[j];
                    arr[j] = arr[j+gap];
                    arr[j+gap] = temp;
                }
    }
}
