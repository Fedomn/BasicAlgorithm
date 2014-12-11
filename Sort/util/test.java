package Sort.util;

/**
 * 数据对象方便使用assertEquals*
 */
public final class test {
    public int[] data;
    public static test testData = new test(new int[]{0, 2, 4, 6, 8, 9, 7, 5, 3, 1});
    public static final test resultData = new test(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

    private test(int[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof test)) return false;
        test temp = (test) obj;
        for (int i = 0; i < temp.data.length; i++)
            if (temp.data[i] != this.data[i]) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
