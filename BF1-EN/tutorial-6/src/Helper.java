public class Helper {
    public static void hello(String name){
        System.out.println("Hello " + name + ", welcome!"); // string concatination a + b + c = abc
        System.out.println("Hello ".concat(name).concat(", welcome!")); // they to exactly the same
        // .concat() works only with strings (no chars)
    }

    public static void palindrome(String s){
        s = s.toLowerCase(); // or toUpperCase() in order to ignore case

        boolean isPalindrome = true; // we assume that it is a palidrome

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(s + " is a palindrome.");
        }else{
            System.out.println(s + " is not a palindrome.");
        }

    }

    public static String reverse(String s){
        // USING STRING
//        String reversed = "";
//        for ( int i = s.length() - 1; i >= 0; i--){
//            //reversed = reversed.concat(String.valueOf(s.charAt(i)));
//            reversed += s.charAt(i);
//        }

        // USING CHAR ARRAY
        char[] chars = s.toCharArray(); // "abc" -> {'a','b','c'}

        for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        String reversed = new String(chars); // String.valueOf(chars)

        return reversed;
    }

    public static void palindromeReverse(String s){
        s = s.toLowerCase();
        String reversed = reverse(s);

        if(s.equals(reversed)){
            System.out.println(s + " is a palindrome.");
        }else{
            System.out.println(s + " is not a palindrome.");
        }
    }

    public static void replaceChar(String text, char [] targets, char replacement){
        // USING STRING FOR 1 TARGET
//        String replaced = "";
//        for( int i = 0; i < text.length(); i++){
//            if(text.charAt(i) == target){
//                replaced += replacement;
//            }else{
//                replaced += text.charAt(i);
//            }
//        }
//
//        System.out.println(text + ": with char " + target + " replaced with " + replacement + ": " + replaced);

        // FOR MORE TARGETS CHAR ARRAY
        char [] chars = text.toCharArray();

        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < targets.length; j++){
                if(chars[i] == targets[j]){
                    chars[i] = replacement;
                }
            }
        }

        String replaced = new String(chars); // or String.valueOf(chars)
        System.out.println(replaced);
    }

    public static void replaceWord(String text, String target, String replacement){
        String [] words = text.split(" ");
        // "I love Java".split(" ") -> {"I", "love", "Java"}
        for ( int  i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                words[i] = replacement;
            }
        }

        // String.join(" ", {"I", "love", "Java"}) ->  "I love Java"
        String replaced = String.join(" ", words);
        System.out.println(replaced);

    }

    public static void email(String email){
        System.out.println("Email: " + email);
        // split at @
        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);

        int firstDotIntex = domain.indexOf("."); // returns -1 if not found
        int lastDotIndex = domain.lastIndexOf(".");

        if(firstDotIntex != lastDotIndex){
            String subdomain = domain.substring(0,firstDotIntex);
            System.out.println("Subdomain: " + subdomain);
            String mainDomain = domain.substring(firstDotIntex + 1,lastDotIndex);
            System.out.println("Main domain: " + mainDomain);
            String topLevelDomain = domain.substring(lastDotIndex + 1);
            System.out.println("Top level domain: " + topLevelDomain);
        }else {
            System.out.println("Subdomain not found");
            System.out.println("Main domain: " + domain.substring(0,firstDotIntex));
            System.out.println("Top level domain: " + domain.substring(firstDotIntex + 1));
        }
    }


}
