import java.util.*;

public class MarathonUsingList implements Marathon{
    @Override
    public String findPersonWhoCantFinish(String[] participant, String[] completion) {
        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));

        List<String> resultList = new ArrayList<>(participantList);
        resultList.removeAll(completionList);

        if(resultList.size() != 0) {
            return resultList.iterator().next();
        }

        return findRetire(participantList, completionList);
    }

    private String findRetire(List<String> participantList, List<String> completionList) {
        for (String name :
                participantList) {
            int index = completionList.indexOf(name);
            if(index == -1) {
                return name;
            }
            completionList.remove(index);
        }

        return completionList.get(0);
    }
}
