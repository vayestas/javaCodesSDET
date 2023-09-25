package class11;

public class Hw5 {
    public static void main(String[] args) {
        /*
        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?
         */

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] sentences=a.split("[?]");
        int numberCount=0;

        for(String number:sentences){
            if(number.trim().length()>0){
                numberCount++;
            }
        }
        System.out.println(numberCount);

    }
}
