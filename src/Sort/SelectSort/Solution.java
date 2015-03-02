package Sort.SelectSort;

public final class Solution {
    private Solution() {
    }

    /**
     *	直接选择排序 (与直接插入排序类似 都分有序和无序区 ，
     *	不同的是 直接插入排序是将无序区的第一个元素直接插入到有序区中
     *		     直接选择排序是将无序区选一个最小元素放到无序的开头 有序区的最后)
     */
    public static void  DirectSelectSort(int a[]){
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int minSite = i;
            for (int j = i + 1; j < len; j++) {//找出最小元素位置
                if(a[j] < a[minSite])
                    minSite = j;
            }
            //把最小元素和无序区的开头交换
            int temp = a[minSite];
            a[minSite] = a[i];
            a[i] = temp;
        }
    }

    /**
     * 堆排序：
     * 1、首先建立二叉堆，分为最小堆(父节点的值<=2个子节点的值)或者最大堆(父节点的值>=2个子节点的值)
     * 2、把二叉堆第0个元素A[0]和最后一个元素A[n]交换值。
     * 3、重复1和2步骤 构建堆的范围为0~上一个堆的最后位置 每次交换堆中最后一个元素
     */
    public static void HeapSort(int[] a){
        int len = a.length;
        //建立最大堆 对于完全二叉树上所有编号大于(len-1)/2的结点均没有孩子 以他们为根的子树显然满足大根堆条件
        for(int i = len / 2 - 1; i >= 0; i--)
            MakeHeap(a, i, len);
        for(int i = len - 1; i >= 0; i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            MakeHeap(a, 0, i);
        }
    }

    /**
     * 建最大堆函数：heap待筛选的堆 	 r为堆的根节点	upper为无序区的上界
     */
    private static void MakeHeap(int[] heap, int r, int upper){
        int child = 2 * r + 1;//根的左孩子
        int temp = heap[r];//根的值

        while(child < upper){//沿孩子向下筛选
            if(child + 1 < upper && heap[child + 1] > heap[child])//找出左右孩子中值大的一个
                child++;
            if(heap[child] < temp) break;//建立最大堆

            heap[(child - 1) / 2] = heap[child];//把孩子的值交换给根
            child = 2 * child + 1;//指向下一个孩子 以便向下调整子树
        }
        heap[(child - 1)/2] = temp;
    }
}
