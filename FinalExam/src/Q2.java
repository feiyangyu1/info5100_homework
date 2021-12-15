import java.util.*;

public class Q2 {
    public static List<List<String>> anagramGroup(String[] words){
        Map<String, LinkedList<String>> map = new HashMap<>();
        for(String word : words){
            char[] array = word.toCharArray();
            Arrays.sort(array);
            String key = String.valueOf(array);
            if(!map.containsKey(key)){
                map.put(key, new LinkedList<String>());
                map.get(key).add(word);
            }
            else{
                map.get(key).add(word);
            }

        }

       return new LinkedList<List<String>>(map.values());
    }
}
