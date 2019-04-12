import java.util.Stack;

public class BigNumber {
    public String getBigNumber(String number, int k)  {
        Stack<Integer> result = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int num = Character.getNumericValue(number.charAt(i));

            if (i - result.size() ==  k) {
                result.push(num);
                continue;
            }

            if (result.isEmpty()) {
                result.push(num);
                continue;
            }

            if (result.peek() > num) {
                result.push(num);
                continue;
            }

            while (!result.isEmpty() && result.peek() < num && i - result.size() !=  k) {
                result.pop();
            }

            result.push(num);
        }

        while (result.size() > number.length() - k) {
            result.pop();
        }

        for (int num :
                result) {
            stringBuilder.append(num);
        }

        return stringBuilder.toString();
    }
}
