package class9;

public class HW12DArrays {
    public static void main(String[] args) {
        // print all names in array in nested enhanced for loop

        String [][] groceryList= {{"Eggplant","Cucumber","Carrots","Potato"},
                            {"Banana","Apple","Grape","Strawberry"},
                            {"Milk","Cheese","Ice Cream","Butter"},
                            {"Brownie","Cookie","Popsicle","Chocolate"}};

        for(String[] row:groceryList){
            for(String types:row){
                System.out.print (types+" ");
            }
            System.out.println();
        }

        // index based
        System.out.println("===========");
        for(int i = 0; i< groceryList.length; i++){
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
