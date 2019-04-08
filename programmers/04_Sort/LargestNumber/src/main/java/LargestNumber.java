import java.util.Arrays;

public class LargestNumber {
    public String getLargestNumber(int[] numbers) {
        int[] sortedNumbers = Arrays.stream(numbers).boxed().sorted((Integer o1, Integer o2) -> Integer.valueOf(o2 + "" + o1) - Integer.valueOf(o1 + "" + o2)).mapToInt(i -> i).toArray();

        if(Arrays.stream(sortedNumbers).distinct().count() == 1 && sortedNumbers[0] == 0) {
            return "0";
        }

        String result = "";
        for (int number :
                sortedNumbers) {
            result += number;
        }
        return result;
    }
}
