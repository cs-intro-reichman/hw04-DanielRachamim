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
        System.out.println(capVowelsLowRest("Hello World")); // "hEllO wOrld"
        System.out.println(capVowelsLowRest("One two tHRee world")); // "OnE twO thrEE wOrld"
        System.out.println(capVowelsLowRest("vowels are fun")); // "vOwEls ArE fUn"
        System.out.println(capVowelsLowRest("intro")); // "IntrO"
        System.out.println(capVowelsLowRest("yellow")); // "yEllOw"
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





    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
