public class Main {
    public static void main(String[] args) {

        //STRINGS IN JAVA
        String s = "Hello world!";
//        System.out.println(s);
//        // print characters at index 0 and 3
//        System.out.println(s.charAt(0)); // prints H
//        System.out.println(s.charAt(3)); // prints l

        //s.charAt(0) = 'h'; NOT ALLOWED
        Helper.hello("Bogdan");

//        // LOOP THROUGH STRING AND PRINT CHAR BY CHAR
//        for (int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
//
//        // ALTERNATIVE USE CHAR ARRAY
//        char [] chars = s.toCharArray(); // String "abc" -> {'a','b','c'}
//        for (int i = 0; i < chars.length; i++){
//            System.out.println(chars[i]);
//        }

        // CHECK IF 2 STRINGS ARE EQUAL
        // == checks if two strings are pointing to same thing in memory
//        String first = "test";
//        String second = new String("test");
//        String third = "test";
//
//        System.out.println("USING == ");
//        System.out.println(first == second);
//        System.out.println(first == third);
//        System.out.println(second == third);
//
//        // .equals() - compares strings char by char
//        System.out.println("USING .equals()");
//        System.out.println(first.equals(second));
//        System.out.println(first.equals(third));
//        System.out.println(second.equals(third));

        // CHECK IF STRING IS PALINDROME
        Helper.palindrome("anAvolImiLovana");
        Helper.palindrome("RaCecar");
        Helper.palindrome("programming");

        // DO IT BY REVERSING STRING
        System.out.println("REVERSED: " + Helper.reverse("Hello world!"));
        Helper.palindromeReverse("anavolimilovana");
        Helper.palindromeReverse("rock");

        // REPLACE ALL INSTANCES OF CHARACTER IN STRING WITH SOMETHING ELSE
        // replace m with #
        char [] targets = {'g','m','r'};
        Helper.replaceChar("programming", targets, '#');

        // REPLACE WORDS IN STRING
        // replace word hate with love <3
        Helper.replaceWord("I hate basketball and I hate music and I hate gym", "hate", "love");


        // USEFUL METHODS FROM STRING CLASS
        // indexOf(), lastIndexOf(), contains(), substring()
        System.out.println("First index where m appears in programming: " + "programming".indexOf('m')); // returns -1 if char not found
        System.out.println("Last index where m appears in programming: " + "programming".lastIndexOf('m'));
        System.out.println("Does I love Java contain word Java? " + "I love Java".contains("Java"));
        System.out.println("Does I love Java contain word Python? " + "I love Java".contains("Python"));
        System.out.println("Substring from index 0 to 4 of programming is: " + "programming".substring(0,5));



        System.out.println();
        System.out.println();
        // PARSE EMAIL AND EXTRACT ALL PARTS OF IT: USERNAME, DOMAIN...
        Helper.email("bogdan.sinik@famnit.upr.si");
        System.out.println();
        Helper.email("bogdansinik@gmail.com");
        System.out.println();
        Helper.email("89239349@student.upr.si");



    }
}