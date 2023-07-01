package Solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintPhoneBook {
    public static void printPB(HashMap<String, List<Integer>> printBook) {
        
        // TreeMap<String, List<Integer>> sortedMap = new TreeMap<>();
        // sortedMap.putAll(printBook);
        
        //  for (Map.Entry<String, List<Integer>> item : sortedMap.entrySet()) {
        //         System.out.println(item.getValue() + " - " + item.getKey());

        // }
        
        for (Map.Entry<String, List<Integer>> item : printBook.entrySet()) {
                System.out.println(item.getValue() + " - " + item.getKey());

        }
    }
}
