package linearsearch;

import java.text.MessageFormat;

/**
 * @author mingyu
 */
public class Main {

    public static void main(String[] args) {

        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int target = 66;

        int index = LinearSearch.searchIndex(data, target);
        System.out.println(MessageFormat.format("index of target element in array is {0}", index));
    }
}
