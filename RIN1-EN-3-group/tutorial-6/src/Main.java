public class Main {
    public static void main(String[] args) {
        // STRINGS IN JAVA
        String example = "Hello world!";
//        System.out.println(example);
//
//        // Print char at index 0 and 3
//        System.out.println("Char at 0: " + example.charAt(0)); // prints H same as in array[0]
//        System.out.println("Char at 3: " + example.charAt(3)); // prints l
//
//        Helper.hello("Bogdan");
//
//        // LOOP THROUGH STRING CHAR BY CHAR
//        for (int i = 0; i < example.length(); i++){
//            System.out.println(example.charAt(i));
//        }
//
//        System.out.println();
//        // ALTERNATIVE TRANSFORM STRING TO CHAR ARRAY
//        char [] charArray = example.toCharArray(); // "abc" -> {'a','b','c'}
//        for (int i = 0; i < charArray.length; i++){
//            System.out.println(charArray[i]);
//        }

        // COMPARE 2 STRINGS (CHECK IF EQUAL)
        // == only checks if they reference (point) to the same object in memory
        String first = "test";
        String second = new String("test");
        String third = "test";

        System.out.println("USING ==");

        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == third);

        // .equals() - compares actual values char by char
        System.out.println("USING .equals() METHOD");
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));

        // example.charAt(0) = "T"; NOT ALLOWED

        // CHECK IF STRING IS PALINDROME
        // kayak, civic, racecar, anavolimilovana
        Helper.palindrome("KaYak");
        Helper.palindrome("ana voli milovana");
        Helper.palindrome("JaVa");

        // DO IT USING REVERSED STRING
        //System.out.println(Helper.reverse("Java"));
        Helper.palindromeReverse("KaYak");
        Helper.palindromeReverse("RocK");

        // CHANGE ALL INSTANCES OF SOME CHARACTER TO ANOTHER CHARACTER
        // e.g. a -> #
        char [] targets = {'r','m','g'};
        System.out.println(Helper.replaceChar("programming",targets,'#'));

        // REPLACE ALL INSTANCES OF WORD WITH ANOTHER WORD
        // replace hate with love
        Helper.replaceWord("I hate sport and I hate music and I hate Java", "hate", "love");

        // indexOf(), lastIndexOf(), contains(), substring()
        System.out.println("Index of first char 'a' in Java? " + "Java".indexOf('a'));
        System.out.println("Index of last char 'a' in Java? " + "Java".lastIndexOf('a'));

        System.out.println("I love Java contains substring Java? " + "I love Java".contains("Java"));
        System.out.println("I love Java contains substring Python? " + "I love Java".contains("Python"));

        // substring from index 0 to 5 of I love java
        System.out.println("I love Java".substring(0,6)); // includes 0 but not 6 -> [0,6)
        System.out.println("I love Java".substring(5));
        System.out.println();
        // IMPLEMENT FUNCTION THAT PARSES EMAIL ADDRESS AND EXTRACTS USERNAME AND DOMAINS
        Helper.email("bogdan.sinik@famnit.upr.si");
        System.out.println();
        Helper.email("bogdan.sinik@gmail.com");
        System.out.println();
        Helper.email("8932934@student.upr.si");









    }
}