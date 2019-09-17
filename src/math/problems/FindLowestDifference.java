package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int lowestNumber =Integer.MAX_VALUE;

        for(int i =0;i<array1 .length;i++){
            if(lowestNumber > array1[i]){
                lowestNumber= array1[i];
            }
        }
        for(int i =0;i<array2 .length;i++){
            if(lowestNumber > array2[i]){
                lowestNumber= array2[i];
            }
        }
        System.out.println("lowest numbers is :" + lowestNumber);


    }

}
