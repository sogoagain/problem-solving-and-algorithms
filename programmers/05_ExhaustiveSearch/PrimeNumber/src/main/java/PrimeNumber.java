import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {
    public int findPrimeNumber(String numbers) {
        Set<Integer> makedNumber = new HashSet<>();
        permutation(numbers, "", makedNumber);

        int count = 0;
        for (int number :
                makedNumber) {
            if (checkPrimeNumber(number)) {
                count++;
            }
        }

        return count;
    }

    private boolean checkPrimeNumber(int number) {
        if(number == 0 || number == 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void permutation(String numbers, String prefix, Set<Integer> makedNumber) {
        for (int i = 0; i < numbers.length(); i++) {
            String numberLeftAfterOne = numbers.substring(0, i) + numbers.substring(i + 1);
            permutation(numberLeftAfterOne, prefix + numbers.charAt(i), makedNumber);
        }
        if(prefix.equals("")) {
            return;
        }
        makedNumber.add(Integer.valueOf(prefix));
    }
}
