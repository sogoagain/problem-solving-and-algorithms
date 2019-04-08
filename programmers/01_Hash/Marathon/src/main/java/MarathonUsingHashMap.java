import java.util.HashMap;
import java.util.Map;

public class MarathonUsingHashMap implements Marathon {
    @Override
    public String findPersonWhoCantFinish(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String name :
                participant) {
            if (!map.containsKey(name)) {
               map.put(name, 1);
               continue;
            }
            map.replace(name, (map.get(name) + 1));
        }

        for (String name :
                completion) {
            if(map.get(name) == 1) {
                map.remove(name);
                continue;
            }
            map.replace(name, map.get(name) - 1);
        }

        return map.keySet().iterator().next();
    }
}

