import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BigNumber {
    public String getBigNumber(String number, int k) {
        List<Integer> numbers = new LinkedList<>();
        Stack<Integer> result = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            numbers.add(Character.getNumericValue(number.charAt(i)));
        }

        for (int i = 0; i < number.length(); i++) {

            if (i - result.size() == k) {
                result.push(numbers.get(i));
                continue;
            }

            if (result.isEmpty()) {
                result.push(numbers.get(i));
                continue;
            }

            if (result.peek() > numbers.get(i)) {
                result.push(numbers.get(i));
                continue;
            }

            while (!result.isEmpty() && result.peek() < numbers.get(i) && i - result.size() != k) {
                result.pop();
            }

            result.push(numbers.get(i));
        }

        for (int num :
                result) {
            stringBuilder.append(num);
        }

        return stringBuilder.toString();
    }
}
