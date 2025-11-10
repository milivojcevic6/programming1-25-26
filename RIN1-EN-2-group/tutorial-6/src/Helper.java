import javax.sound.midi.Soundbank;
import java.util.Locale;

public class Helper {
    public static void hello(String name){
        System.out.println("Hello " + name + ", welcome!"); // string concatination
        //System.out.println("Hello ".concat(name).concat(", welcome!")); // both methods do the same
    }

    public static void palindrome(String s){
        s = s.toLowerCase();
        System.out.println("String: " + s);

        boolean isPalindrome = true; // we assume that it is a palindrome
        int length = s.length();
        for (int i = 0; i < s.length() / 2; i++){
            if (s.charAt(i) != s.charAt(length - 1 -i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(s + " is a Palindrome");
        }else {
            System.out.println(s + " is not a Palindrome");
        }
    }

    public static String reverse(String s){
        // direct solution
//        String reversed = "";
//        for (int i = s.length() - 1; i >= 0; i--){
//            reversed += s.charAt(i);
//        }
        // transform to char array first
        char [] chars = s.toCharArray();
        int length = chars.length;
        for(int i = 0; i < length/2; i++){
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }

        String reversed = new String(chars);

        return reversed;
    }

    public static void palindromeReverse(String s){
        s = s.toLowerCase(); // to ignore case of chars
        String reversed = reverse(s);

        // compare reversed and original (s)
        if(reversed.equals(s)){
            System.out.println(s + " is a Palindrome");
        }else {
            System.out.println(s + " is not a Palindrome");
        }
    }

    public static void replaceChar(String text, char [] targets, char replacement){
        // directly on String
//        String replaced = "";
//        for(int i = 0; i < text.length(); i ++){
//            if(text.charAt(i) == target){
//                replaced += replacement;
//            }else{
//                replaced += text.charAt(i);
//            }
//        }

        // using char array
//        char [] chars = text.toCharArray();
//        for(int i = 0; i < chars.length; i++){
//            if(chars[i] == target){
//                chars[i] = replacement;
//            }
//        }

        char [] chars = text.toCharArray();
        int length = chars.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < targets.length; j++){
                if(chars[i] == targets[j]){
                    chars[i] = replacement;
                }
            }
        }


        String replaced = new String(chars);

        //System.out.println(text + ": with char "+ target + " replaced with " + replacement + " looks like: " + replaced);
        System.out.println("REPLACED: " + replaced);
    }

    public static void replaceWord(String text, String target, String replacement){
        String [] words = text.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(target)) {
                words[i] = replacement;
            }
        }

        // create string from string array
        String replaced = String.join(" ", words); // {"I","am","student"} -> "I am Student"

        System.out.println(text + " : with word " + target + " replaced by " + replacement + " looks like: "+ replaced);


    }

    public static void email(String email){
        System.out.println("Email: " + email);

        // extract username and full domain
        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];
        System.out.println("Username: " + username);
        System.out.println("Full domain: " + domain);

//        String [] domainParts = domain.split("\\.");
//        if(domainParts.length == 3){
//            System.out.println("Subdomain: " + domainParts[0]);
//            System.out.println("Main domain: " + domainParts[1]);
//            System.out.println("Top level domain: " + domainParts[2]);
//        }else{
//            System.out.println("Main domain: " + domainParts[0]);
//            System.out.println("Top level domain: " + domainParts[1]);
//        }

        int firstDotIndex = domain.indexOf(".");
        int lastDotIndex = domain.lastIndexOf(".");

        if(firstDotIndex != lastDotIndex){
            String subdomain = domain.substring(0, firstDotIndex);
            System.out.println("Subdomain: " + subdomain);
            String mainDomain = domain.substring(firstDotIndex + 1, lastDotIndex);
            System.out.println("Main domain: " + mainDomain);
            String topLevelDomain = domain.substring(lastDotIndex + 1); // with 1 argument it by default goes to the end of string
            System.out.println("Top level domain: " + topLevelDomain);
        }else{
            String mainDomain = domain.substring(0, firstDotIndex);
            System.out.println("Main domain: " + mainDomain);
            String topLevelDomain = domain.substring(firstDotIndex + 1);
            System.out.println("Top level domain: " + topLevelDomain);
            System.out.println("No subdomain");
        }
    }


}
