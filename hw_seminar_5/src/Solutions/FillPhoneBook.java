package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FillPhoneBook {
    public static HashMap<String, List<Integer>> fillPB(String[] phone) {
        HashMap<String, List<Integer>> outMap = new HashMap<>();
        
        for (String str : phone) {
            String[] ap = str.split(";");
            if (outMap.containsKey(ap[0])) {
                
                outMap.get(ap[0]).add(Integer.parseInt(ap[1]));

            } else {

                List<Integer> pl = new ArrayList<Integer>();
                pl.add(Integer.parseInt(ap[1]));
                outMap.put(ap[0], pl);
                
            }
        }
        return outMap;
    }

}
