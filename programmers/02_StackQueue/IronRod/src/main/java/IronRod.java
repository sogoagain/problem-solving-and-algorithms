import java.util.Stack;

public class IronRod {
    public int cut(String arrangement) {
        Stack<Character> stack = new Stack<>();
        int countCuttingRod = 0;

        for (int i = 0; i < arrangement.length(); i++) {
            char character = arrangement.charAt(i);

            if(character == '(') {
                stack.push(character);
                continue;
            }

            stack.pop();
            if(arrangement.charAt(i-1) == '(') {
                countCuttingRod += stack.size();
                continue;
            }
            countCuttingRod += 1;
        }

        return countCuttingRod;
    }
}
