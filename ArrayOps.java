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
        int without_dups1[] = deduplicate(array1);
        int without_dups2[] = deduplicate(array2);
        
        boolean areEqual = true;

        // comparing the deduplicated arrays
        if (without_dups1.length == without_dups2.length) {
            for (int i = 0; i < without_dups1.length; i++) {
                int temp = without_dups1[i];
                boolean numExists = false;
                for (int j = 0; j < without_dups2.length; j++) {
                    if (temp == without_dups2[j]) {
                        numExists = true;
                        break;
                    }
                }
                if (numExists == false) {
                    areEqual = false;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        return areEqual;
        }

    //Helper function - Find the maximum value in the array
    
    public static int getMaxValue(int[] arr) {
        int maximum = Integer.MIN_VALUE;;
        for (int number : arr) {
            maximum = Math.max(maximum, number);
        }
        return maximum;
    }

    //Helper function - deleting the duplicate values from a given array and returning a new one 
    public static int[] deduplicate(int[] array) {
        int[] newArray = new int[array.length];
        int specialIndex = 0;
        for (int i = 0; i < array.length; i++) {
        boolean isSpecial = true;
        // Checks if the current element is already in the uniqueArray
        for (int j = 0; j < specialIndex; j++) {
            if (array[i] == newArray[j]) {
                isSpecial = false;
                    break;
                }
            }
            // If the element is unique it adds it to the uniqueArray
            if (isSpecial) {
                newArray[specialIndex] = array[i];
                specialIndex++;
            }
        }

        // Create a new array with the correct size
        int[] finalArray = new int[specialIndex];
            
        // coying the elements from uniqueArray to resultArray
        for (int i = 0; i < specialIndex; i++) {
            finalArray[i] = newArray[i];
        }

        return finalArray;
    }


    public static boolean isSorted(int [] array) {
        int n = array.length;

        // Check for increasing order
        boolean increasing = true;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                increasing = false;
                break;
            }
        }

        // Check for decreasing order
        boolean decreasing = true;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                decreasing = false;
                break;
            }
        }

        // The array is sorted if either increasing or decreasing is true
        return increasing || decreasing;
    }
}

    
