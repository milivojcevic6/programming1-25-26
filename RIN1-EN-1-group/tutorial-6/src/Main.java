public class Main {
    public static void main(String[] args) {

        // STRINGS
        String text = "Something in written form";
        System.out.println(text + " and we like it");

        // HELLO FUNCTION
        Helper.hello("Bogdan");

        // ACCESS EACH CHARACTER OF STRING
        System.out.println(text.charAt(3)); // prints e
        System.out.println(text.charAt(0)); // prints S

//        // LOOP THROUGH STRING CHAR BY CHAR
           String example = "Hello world!";
//        for (int i = 0; i < example.length(); i++){
//            System.out.println(example.charAt(i)); // for arrays we had arr[i]
//        }
//
//        // USE CHAR ARRAY
//        char [] charArray = example.toCharArray();
//        for (int i = 0; i < charArray.length; i++){
//            System.out.println(charArray[i]);
//        }

        // EQUALITY CHECK
        String first = new String("test");
        String second = new String("test");
        String third = "test";
        String fourth = "test";
        // == checks if they reference same object
        // .equals() checks equality char by char

        System.out.println(first == second);
        System.out.println(first.equals(second));

        System.out.println(third == fourth);

        // PALINDROME CHECK
        Helper.palindrome("RaCecar");
        Helper.palindrome("rock");
        Helper.palindrome("Anavolimilovana");

        // REVERSE STRING
        System.out.println(Helper.reverse("rock"));

        // REPLACE ALL INSTANCES OF SOME CHARACTER IN STRING
        // replace o with _
        char [] targets = {'t', 'i', 'o'};
        Helper.replaceCharacters(text, targets, '_');

        // REPLACE WORD IN STRING
        // hate with love
        Helper.replaceWord("I hate basketball and I hate music and I hate programming","hate", "love");

        // indexOf(), lastIndex(), contains(), substring()
        String s = "I love Java programming";
        // find index of first 'o'
        System.out.println("First index of 'o': " + s.indexOf('o'));
        // find idex of last 'o'
        System.out.println("Last index of 'o': " + s.lastIndexOf('o'));
        // check if it contains word "Java"
        System.out.println("Does it contain Java? " + s.contains("Java"));
        System.out.println("Does it contain Python? " + s.contains("Python"));
        // Get substring from index 0 to 10
        System.out.println("Substring of " + s + " from 0 to 10: " + s.substring(0,11)); // first inclusive last exclusive [0,11)
        System.out.println();
        // EMAIL PARSING
        Helper.email("bogdan.sinik@famnit.upr.si");
        System.out.println();
        Helper.email("bogdansinik@gmail.com");
        System.out.println();
        Helper.email("89229394@student.upr.si");






    }
}