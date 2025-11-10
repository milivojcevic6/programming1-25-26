import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // STRINGS IN JAVA
        String s = "Some text";
        System.out.println(s);

        // STRING CONCATIONATION
        // Helper.hello("Bogdan");

        // PRINT CHARS FROM ARRAY
        System.out.println("Print first char: " + s.charAt(0));
        System.out.println("Print last char: " + s.charAt(s.length()-1));

        //s.charAt(0) = "M"; NEVER EVER EVER

//        // LOOP THROUGH STRING CHAR BY CHAR
//        for(int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
//
//        // USING CHAR ARRAY
//        char [] charArray = s.toCharArray();
//        charArray[0] = 'M';
//
//        for(int i = 0; i < charArray.length; i++){
//            System.out.println(charArray[i]);
//        }

        // CHECK IF 2 STRINGS ARE EQUAL
        // == - checks if location in memory is the same
        // .equals() - checks char by char
        String first = "test";
        String second = new String("test");
        String third = "test";

        System.out.println("USING == ");
        System.out.println(first == second); //false
        System.out.println(first == third); //true
        System.out.println(second == third); //false

        System.out.println("USING .equals() METHOD");
        System.out.println(first.equals(second)); //true
        System.out.println(first.equals(third)); //true
        System.out.println(second.equals(third)); //true

        // never ever ever ==
        // always .equals() with strings

        // CHECK IF PALINDROME
        Helper.palindrome("radar");
        Helper.palindrome("kayak");
        Helper.palindrome("programming");
        Helper.palindrome("anavolimilovana");

        // IF WE USE REVERSED STRING
        System.out.println(Helper.reverse("Programming"));
        Helper.palindromeReverse("programming");
        Helper.palindromeReverse("radar");

        // WE WANT TO REPLACE ALL INSTANCES OF CHAR WITH ANOTHER CHAR
        // banana (replace a with !) -> b!n!n!
        char [] targets = {'b','a'};
        Helper.replaceChar("banana",targets,'!');

        // WE WANT TO REPLACE WHOLE WORD
        // "I love Java".split(" ") -> {"I", "love", "Java"}
        // replace hate with love <3
        Helper.replaceWord("I hate basketball and I hate music and I hate Java", "hate", "love");

        // useful built in methods
        // indexOf(), lastIndexOf(), contains(), substring()

        System.out.println("Find first index of a: " + "banana".indexOf('a'));
        System.out.println("Find last index of a: " + "banana".lastIndexOf('a'));

        System.out.println("If banana contains ana: " + "banana".contains("ana"));
        System.out.println("If banana contains ana: " + "banana".contains("marija"));

        System.out.println("Get substring from index 0 to index 3: " + "banana".substring(0,4)); //[0,4)
        System.out.println("Get substring from index 4 to the end: " + "banana".substring(4)); // [4,end]

        // PARSE EMAIL ADDRESS AND EXTRACT USERNAME AND DOMAIN
        System.out.println();
        Helper.email("bogdan.sinik@famnit.upr.si");
        System.out.println();
        Helper.email("pero@gmail.com");
        System.out.println();
        Helper.email("89251132@student.upr.si");


    }
}