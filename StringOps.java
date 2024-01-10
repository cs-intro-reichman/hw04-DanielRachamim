public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(camelCase("Hello World")); // Output: "helloWorld"
        System.out.println(camelCase("HELLO world")); // Output: "helloWorld"
        System.out.println(camelCase(" tWo wordS")); // Output: "twoWords"
        System.out.println(camelCase("world")); // Output: "world"
        System.out.println(camelCase(" Intro to coMPUter sCIEncE ")); // Output: "introToComputerScience"
    }

    public static String capVowelsLowRest (String string) {
        // Setting the constants
        String new_str = "";
        String lowerVowels = "aeiou";
        String upperVowels = "AEIOU";

        for (int i = 0; i < string.length(); i++) {
            boolean isLowerVowel = false;
            boolean isUpperVowel = false;
            char temporaryChar = string.charAt(i);
            // Checking if the tmpChar is a lower case or upper case vowel
            for (int j = 0; j < lowerVowels.length(); j++) {
                if (temporaryChar == lowerVowels.charAt(j)) {
                    isLowerVowel = true;
                    break;
                } else {
                    for (int k = 0; k < upperVowels.length(); k++) {
                        if (temporaryChar == upperVowels.charAt(k)) {
                            isUpperVowel = true;
                            break;
                        }
                    }
                }
            }
            // Appending the tmpChar to the outStr while manipulting its case
            if (isUpperVowel) {
                new_str += temporaryChar;
            } else if (isLowerVowel) {
                temporaryChar = toUpperCase(temporaryChar);
                new_str += temporaryChar;
            } else {
                if ((temporaryChar != ' ') && (isUpperCase(temporaryChar))) {
                    temporaryChar = toLowerCase(temporaryChar);
                    new_str += temporaryChar;
                } else {
                    new_str += temporaryChar;
                }
            }
        }
        return new_str;
    }




    public static String camelCase (String string) {
        String new_str = "";
        int numberOfSpaces = 0;
        int spaceIndex = 0;
        // Looping thorugh the string
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            //First word:
            if (numberOfSpaces == 0) {
                if (isLowerCase(temp)) {
                    new_str += temp;
                } else if (isUpperCase(temp)) {
                    temp = toLowerCase(temp);
                    new_str += temp;
                } else if ((temp == ' ') && (i != 0)) {
                    numberOfSpaces++;
                    spaceIndex = i;
                } else if ((temp == ' ') && (i == 0)) {
                    numberOfSpaces = 0;
                }
            // Second word and so on
            } else {
                if ((temp != ' ') && (i == spaceIndex + 1)) {
                    if (isLowerCase(temp)) {
                        temp = toUpperCase(temp);
                        new_str += temp;
                    } else new_str += temp;
                } else if (temp != ' ') {
                    if (isUpperCase(temp)) {
                        temp = toLowerCase(temp);
                        new_str += temp;
                    } else new_str += temp;
                } else if (temp == ' ') {
                    spaceIndex = i;
                }
            }
        }
        return new_str;
    }


    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }




    /* Helper functions
     * Gets a char and lower case it
     */
    public static char toLowerCase (char character) {
        character += 32;
        return character;
    }
    
    /*
     * Gets a char and upper case it
     */
    public static char toUpperCase (char character) {
        character -= 32;
        return character;
    }

    /*
     * Gets a char and checks if its upper case
     */
    public static boolean isUpperCase (char character) {
        if (character > 'A' && character < 'Z') {
            return true;
        }

        else return false;
    }

    /*
     * Gets a char and checks if its lower case
     */
    public static boolean isLowerCase (char character) {
        if (character > 'a' && character < 'z') {
            return true;
        } 

        else return false;
    }

    public static boolean containsSpace(String input) {
        // Check if the input string contains a space without using contains
        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

}
