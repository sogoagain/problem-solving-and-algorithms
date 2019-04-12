import java.util.Stack;

public class BigNumber {
    public String getBigNumber(String number, int k)  {
        Stack<Integer> result = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int num = Character.getNumericValue(number.charAt(i));

            while (!result.isEmpty() && result.peek() < num && i - result.size() <  k) {
                result.pop();
           }
            result.push(num);
        }

        for (int i = 0; i < number.length() - k; i++) {
            stringBuilder.append(result.get(i));
        }

        return stringBuilder.toString();
    }
}
