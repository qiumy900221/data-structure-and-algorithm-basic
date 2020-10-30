package linearsearch;

/**
 * @author mingyu
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <T> int searchIndex(T[] data, T target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        // 如果在data数组中没有找到target元素，则返回-1
        return -1;
    }
}
