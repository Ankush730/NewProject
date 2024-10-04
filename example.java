import java.util.*;


public class example {
    public static void main(String[]arr){
    String str = "bbaaccd";
    get(str);
    }
    public static void get(String t){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i:t.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("the answer is :"+entry.getKey());
            }
        }
    }
}
