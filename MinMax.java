import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int[] result = new int[2];
        result[0] = Arrays.stream(arr).min().getAsInt();
        result[1] = Arrays.stream(arr).max().getAsInt();

        return result;
    }

    public static void main(String[] args) {
        MinMax.minMax(new int[]{1,2,3,4,5});
    }
}