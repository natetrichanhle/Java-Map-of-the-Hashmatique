import java.util.Set;
import java.util.HashMap;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Marvins Room", "Cups of the Rose");
        trackList.put("High", "You only say you love me when you're high");
        trackList.put("Loser", "Im such a loser swear to god i'm the worst");
        trackList.put("Is It You", "you, you let me listen and you let me wandering");

        String title = trackList.get("Marvins Room");
        System.out.println("The song name is: " + title);

        // get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
    }
}

