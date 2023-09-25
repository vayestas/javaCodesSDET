package review3;

public class E2LogicalOperators {
    public static void main(String[] args) {

        boolean isMeat=false;
        boolean isEgg=true;
        boolean isFish=false;
        boolean milk=false;
        boolean veggies=true;

        boolean isProtein=isEgg||isMeat||isFish;
        boolean isGoodDiet=(isEgg||isMeat||isFish) &&milk&&veggies;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);

    }
}
