import java.util.*;

public class HashMapSong {
    public static void main(String[] args) {

    HashMap<String, String> userMap = new HashMap<String, String>();

    userMap.put("trouble", "we were at the table by the window");
    userMap.put("all your light", "all your light cant save me, all your light cant save me");
    userMap.put("ghengis khan", "I get a little bit ghengis khan");
    userMap.put("jump into the fog", "what a great achievement it was");

    Set<String> keys = userMap.keySet();
    for(String key : keys) {
        System.out.println(key);
        System.out.println(userMap.get(key)); 

        }
    }
}

//getting class errors
//cant get it to run