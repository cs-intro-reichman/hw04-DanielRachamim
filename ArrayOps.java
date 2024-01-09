public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(containsTheSameElements(new int[]{1, 2, 1, 1, 2}, new int[]{2, 1}));  // Output: true
        System.out.println(containsTheSameElements(new int[]{2, 2, 3, 7, 8, 3, 2}, new int[]{8, 2, 7, 7, 3}));  // Output: true
        System.out.println(containsTheSameElements(new int[]{1, 2, 3}, new int[]{1, 2, 3}));  // Output: true
        System.out.println(containsTheSameElements(new int[]{3, -4, 1, 2, 5}, new int[]{1, 3, -4, 5}));  // Output: false
        
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length + 1;
        int expected_sum = (n*(n-1))/2;
        int actual_sum = 0;
        for (int i = 0; i < array.length; i++){
           actual_sum = actual_sum + array[i];
        }

        return expected_sum - actual_sum;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = array[1];

        //Stage 1: comparing the first two numbers of the array
        if (max < secondMax) {
            int temp = max;
            max = secondMax;
            secondMax = temp;
        }
        //Stage 2: comparing the rest of the nums and assigning values to the variables accordingly 
        for (int i = 2; i < array.length; i++) {
            int num = array[i];

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Create frequency arrays for array1 and array2
        int maxVal = Math.max(getMaxValue(array1),getMaxValue(array2));
        int frequency1[] = new int [maxVal  +1];
        int frequency2[] = new int [maxVal  +1];
        boolean areEqual = true;

        for (int i = 0; i < array1.length; i++){
            if (frequency1[array1[i]] == 0) {
                frequency1[array1[i]]++; 
            }
        }

        for (int j = 0; j < array2.length; j++){
            if (frequency2[array2[j]] == 0) {
                frequency2[array2[j]]++; 
            }
        }

        for (int i = 0; i < frequency1.length; i++){
            if (frequency1[i] != frequency2[i]) {
                areEqual = false;
            }
        }

        return areEqual;
    }


    //Helper function - Find the maximum value in the array
    
    private static int getMaxValue(int[] arr) {
        int maximum = Integer.MIN_VALUE;;
        for (int number : arr) {
            maximum = Math.max(maximum, number);
        }
        return maximum;
    }

    



    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
