package linearsearch;

/**
 * @author mingyu
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static int searchIndex(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        // 如果在data数组中没有找到target元素，则返回-1
        return -1;
    }
}
