public class Main {
    public static void main(String[] args) {
        // STRINGS IN JAVA
        String s = "Hello World!";

        // string concatination
        Helper.hello("Bogdan");

        // access character in string
        System.out.println("First char: " + s.charAt(0));
        System.out.println("Last char: " + s.charAt(s.length() - 1));

        //s.charAt(2) = 's'; NOT ALLOWED

//        // loop through string
//        for( int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
//
//        // transform to char array and then iterate
//        char [] charArray = s.toCharArray();
//        for (int i = 0; i < charArray.length; i ++){
//            System.out.println(charArray[i]);
//        }

        // check if two strings are equal
        System.out.println("USING ==");
        String first = "test";
        String second =  new String("test");
        String third = "test";

        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == third);
        System.out.println();
        // built in method .equals()
        System.out.println("USING .equals METHOD");
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));
        // ALWAYS USE .equals() WITH STRINGS

        // palindrome check
        Helper.palindrome("anavolimilovana");
        Helper.palindrome("kayak");
        Helper.palindrome("programming");

        // alternative reverse string and check if same as original
        System.out.println(Helper.reverse("Programming"));
        Helper.palindromeReverse("programming");
        Helper.palindromeReverse("racecar");

        // replace all instances of char with another character
        // banana (replace a with _) -> b_n_n_
        char [] targets = {'a','b'};
        Helper.replaceChar("banana", targets, '_');

        // replace whole word with another word
        // replace hate with love <3

        Helper.replaceWord("I hate basketball and I hate music and I hate sunny days","hate","love");

        // indexOf(), lastIndexOf(), contains(), substring()

        System.out.println("First index of a in banana: " + "banana".indexOf('a'));
        System.out.println("Last index of a in banana: " + "banana".lastIndexOf('a'));

        System.out.println("Does banana contain substring ana? " + "banana".contains("ana"));
        System.out.println("Does banana contain substring ana? " + "banana".contains("marija"));

        System.out.println("Substing from index 0 to index 3: " + "banana".substring(0,4)); // [0,4) -> 0,1,2,3
        System.out.println("Substing from index 4 to end: " + "banana".substring(4)); // if only 1 parameter then form there to end
        System.out.println();
        System.out.println();
        // parse email address and extract username and all domains
        Helper.email("bogdan.sinik@famnit.upr.si");
        System.out.println();
        Helper.email("pero@gmail.com");
        System.out.println();
        Helper.email("89394932@student.upr.si");



    }
}