public class HighAndLow {

    public static String highAndLow(String numbers) {
        var allNumbers = numbers.split(" ");
        var first = allNumbers[0];
        int high = Integer.valueOf(first);
        int low =  Integer.valueOf(first);

        for (int i = 1; i < allNumbers.length ; i++) {
            if(Integer.valueOf(allNumbers[i]) > high)
                high = Integer.valueOf(allNumbers[i]);
            if(Integer.valueOf(allNumbers[i]) < low)
                low = Integer.valueOf(allNumbers[i]);
        }

        String result = "";
        result += Integer.toString(high);
        result += " ";
        result += Integer.toString(low);

        return result;
    }

    public static void main(String[] args) {

    }
}