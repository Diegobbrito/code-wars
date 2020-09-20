import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenAndSort {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> list = new ArrayList<>();

        for (int[] arr : array) {
            Arrays.stream(arr)
                    .forEach(list::add);
        }
        int j =0;
        int [] result = new int[list.size()];
        for (int i : list) {
            result[j] = i;
            j++;
        }
        Arrays.sort(result);
        return result;

//        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }

    public static void main(String[] args) {

      Assert.assertArrayEquals(new int[]{}, FlattenAndSort.flattenAndSort(new int[][]{}));
    	Assert.assertArrayEquals(new int[]{1}, FlattenAndSort.flattenAndSort(new int[][]{{}, {1}}));
    	Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, FlattenAndSort.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
    	Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100}, FlattenAndSort.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}));
    	Assert.assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, FlattenAndSort.flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));

    }
}
