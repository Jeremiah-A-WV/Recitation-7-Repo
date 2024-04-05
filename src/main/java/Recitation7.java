import java.util.Arrays;

public class Recitation7 {
    public static void main(String[] args) {
        int[] a = {12, 15, 11, 7, 19, 5};

        for (int x: slidingWindowMin(a, 2)) {
            System.out.println(x);
        }
    }
    /*
     * You may add any private helper method you see necessary,
     * but you may NOT change the signatures of the methods below.
     */
    public static boolean lastItemReachable(int[] hopList){

        // Start at first element, name index
        int index = 0;

        // Take current element value, add it to index

        while (index < hopList.length - 1 && hopList[index] != 0) {
            index += hopList[index];
        }

        return (index >= hopList.length - 1);
    }

    public static int[] slidingWindowMin(int[] numberList, int windowSize){
        int[] result = new int[(numberList.length - windowSize) + 1];

        for (int i = 0; i < result.length; i++) {
            int value = numberList[i];
            for(int j = i; j < i + windowSize; j++) {
                if (value > numberList[j]) {
                    value = numberList[j];
                }
            }
            result[i] = value;
        }

        return result;
    }
}
