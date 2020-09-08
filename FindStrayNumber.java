public class FindStrayNumber {
    static int stray(int[] numbers) {
        if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
        for (int number: numbers) {
            if(number != numbers[0]){
                return number;
            }
        }
        return 0;
    }
}
