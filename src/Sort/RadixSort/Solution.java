package Sort.RadixSort;


public final class Solution {
    private Solution() {
    }

    public static void main(String[] args) {
        int[] a = {73, 22, 93, 43, 55, 14, 28, 65, 39, 81};
        Solution.RadixSort(a,2,10);
        for (int t : a)
            System.out.println(t);
    }

    /**
     * 基数排序
     * @param a 待排序的数组
     * @param m m位
     * @param r r进制数
     */
    public static void RadixSort(int[] a, int m, int r){
        int len = a.length;
        int[][] bucket = new int[r][len];//初始化排序桶
        int[] order=new int[len];//用于保存每个桶里有多少个数字
        int index=0;//保存排序后的结果的标号

        //进行m次分配和收集
        for (int i = 0; i < m ; i++){
            //分配
            for (int num : a){//依次将数组a里的每个数字放在相应的桶里
                int digit = getDigit(num,i,r);
                bucket[digit][order[digit]] = num;
                order[digit]++;
            }

            //收集
            for (int j = 0; j < r; j++){//将前一个循环生成的桶里的数据覆盖到原数组中用于保存这一位的排序结果
                if (order[j] != 0){//这个桶里有数据，从上到下遍历这个桶并将数据保存到原数组中
                    for (int k = 0; k < order[j]; k++){
                        a[index++] = bucket[j][k];
                    }
                }
                order[j] = 0;//将桶里计数器置0，用于下一次位排序
            }
            index = 0;//将标号清0用于下次排序
        }
    }

    /**
     * 得到某一位数
     * @param key 待输入的数
     * @param m m位
     * @param r r进制数
     */
    private static int getDigit(int key, int m, int r){
        if (m == 0) return key % r;
        int d = r;
        for (int i = 1; i < m; i++)
            d *= r;
        return (key / d) % r;
    }

}
