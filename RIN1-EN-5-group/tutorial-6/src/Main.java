public class Main {
    public static void main(String[] args) {
        // STRINGS IN JAVA
        String s = "Hello world!";
//        System.out.println(s);
//
//        Helper.hello("Bogdan");
//
//        // print chars at index 0 and 2
//        System.out.println(s.charAt(0)); // prints H
//        System.out.println(s.charAt(2)); // prints l

        // ITERATE THROUGH STRING CHAR BY CHAR
//        for(int i = 0; i < s.length(); i++) { //dont forget ()
//            System.out.println(s.charAt(i));
//        }
//
//        // transform to char array then print
//        char [] chars = s.toCharArray(); // "bla" -> {'b','l','a'}
//        for(int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

        // COMPARE 2 STRINGS (CHECK IF EQUAL)
        // == - it compares if two strings are pointing to same reference in memory
        String first = "test";
        String second = new String("test");
        String third = "test";

        System.out.println("USING ==");
        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == third);

        // .equals METHOD
        System.out.println();
        System.out.println("USING .equals() METHOD");
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));

        //s.charAt(0) = "T"; NOT ALLOWED

        // CHECK IF STRING IS PALINDROME
        Helper.palindrome("Ana voli Milovana");
        Helper.palindrome("kayak");
        Helper.palindrome("programming");

        // USING REVERSED STRING
        System.out.println(Helper.reverse("Java is cool"));
        Helper.palindromeReverse("Java is cool");
        Helper.palindromeReverse("kayak");

        // REPLACE ALL INSTANCES OF CHAR WITH ANOTHER CHARACTER
        //  e.g. replace m with * in programming -> progra**ing
        char [] targets = {'m','g'};
        Helper.replaceChar("programming", targets,'*');


        // REPLACE WORD WITH ANOTHER WORD
        // e.g. replace hate with love
        Helper.replaceWord("I hate basketball and I hate music and I hate sunny days","hate","love");

        // USEFUL BUILT IN METHODS
        // indexOf(), lastIndexOf(), contains(), substring()
        // find first occurrence (index) of m in programming
        System.out.println("First occurrence of m in programing at index: " + "programming".indexOf('m'));
        // last index of m
        System.out.println("Last occurrence of m in programing at index: " + "programming".lastIndexOf('m'));

        // contains checks if substring is contained in string
        System.out.println("I love Java".contains("Java"));
        System.out.println("I love Java".contains("Python"));

        // substring substring(startindex, endindex)
        System.out.println("Substring of programing from 0 to 3: " + "programming".substring(0,4)); // start index included end excluded [0,4)
        System.out.println("programming".substring(4));// if only 1 parameter end is by default end of the string
        System.out.println();
        System.out.println();
        // EMAIL PARSER THAT EXTRACTS USERNAME AND DOMAINS
        Helper.email("bogdan.sinik@famnit.upr.si");
        System.out.println();
        Helper.email("pero@gmail.com");
        System.out.println();
        Helper.email("8923294@student.upr.si");



    }

}