import java.util.*;
import java.util.stream.Collectors;

class GymSuit {
    int getNumberOfStudentsInClass(int n, int[] lost, int[] reserve) {
        List<Integer> lostStudents = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveStudents = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        int numberOfStudents = n - lostStudents.size();

        List<Integer> self = lostStudents.stream().filter(reserveStudents::contains).collect(Collectors.toList());
        numberOfStudents += self.size();
        lostStudents.removeAll(self);
        reserveStudents.removeAll(self);
        lostStudents.sort(Comparator.naturalOrder());

        for (int lostStudent :
                lostStudents) {
            if (reserveStudents.contains(lostStudent - 1)) {
                numberOfStudents++;
                reserveStudents.remove(Integer.valueOf(lostStudent - 1));
                continue;
            }

            if (reserveStudents.contains(lostStudent + 1)) {
                numberOfStudents++;
                reserveStudents.remove(Integer.valueOf(lostStudent + 1));
            }
        }

        return numberOfStudents;
    }
}
