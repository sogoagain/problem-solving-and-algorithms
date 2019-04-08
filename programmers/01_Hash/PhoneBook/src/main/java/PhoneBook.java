import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public boolean findPrefix(String[] phone_book) {
        Map<String, String> hashMap = new HashMap<>();
        for (String phone :
                phone_book) {
            String key = phone;
            hashMap.put(key, phone);

            for (String temp :
                    phone_book) {
               if(temp.length() > phone.length()) {
                  key = temp.substring(0, phone.length());
                  if (hashMap.containsKey(key)) {
                      return false;
                  }
               }
            }
        }

        return true;
    }
}
