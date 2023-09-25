package class24;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
        System.out.println(words);
        System.out.println("**************");

        for (int i = 0; i < words.size(); i++) {
            i++;

            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        /*
        words.removeIf((String x)->{
            if(x.endsWith("e")){
                return true;
            }else {
                return  false;
            }
        });
         */
        System.out.println(words);
    }
}
