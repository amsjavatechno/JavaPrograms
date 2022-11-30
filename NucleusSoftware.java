import java.util.*;

public class MAPS {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 1);
        for (int i = 3; i <= 26; i++) {
            Character ch = (char)(i+64);
            Integer integer  = (int) (map.get(
                ( Character.valueOf( (char) (i+63) ) )
                )
                + 
            (int)    (map.get(
                    (Character.valueOf( (char) (i+62) ) ) 
                    )
                )
            );
            map.put(ch, integer);
           
        }
        
        // for (Map.Entry<Character,Integer> e: map.entrySet() ) {
        //     System.out.println(e.getKey()+" = "+e.getValue());
        // }

        String str = "ABHISHEK";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result + map.get(str.charAt(i));
        }
        System.out.println(result);

    }
}
