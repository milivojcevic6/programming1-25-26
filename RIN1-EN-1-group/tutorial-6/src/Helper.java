import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;

public class Helper {
    public static void hello(String name){
        System.out.println("Hello " + name);
        //System.out.println("Hello ".concat(name));
    }

    public static void palindrome(String text){
        boolean palindrome = true;
        text = text.toLowerCase();
        System.out.println("Text: " + text);
        for (int i = 0; i < text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length() - 1 -i)){
                palindrome = false;
            }
        }

        if(palindrome){
            System.out.println("It is palindrome");
        }else {
            System.out.println("It is not palindrome");
        }
    }

    public static String reverse(String s){
//        char [] charArray = s.toCharArray();
//        int length = charArray.length;
//        for(int i = 0; i < length/2; i++){
//            char temp = charArray[i];
//            charArray[i] = charArray[length - 1 - i];
//            charArray[length - 1 - i] = temp;
//        }
//        return new String(charArray);
        String reversed = "";
        for (int i = s.length()-1; i >= 0; i--){
            reversed += s.charAt(i);
        }

        return reversed;

    }

    public static void palindromeReverse(String s){
        s = s.toLowerCase();
        String reversed = reverse(s);

        if(reversed.equals(s)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }

    public static void replaceCharacters(String s, char [] target, char replacement){
//        String replaced = "";
//        for (int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == target){
//                replaced += replacement;
//            }else{
//                replaced += s.charAt(i);
//            }
//        }

//        char [] chars = s.toCharArray();
//        for(int i = 0; i < chars.length; i++){
//            if(chars[i] == target){
//                chars[i] = replacement;
//            }
//        }
        char [] chars = s.toCharArray();
        for( int i = 0; i < chars.length; i++){
            for(int j = 0; j < target.length; j++){
                if(chars[i] == target[j]){
                    chars[i] = replacement;
                }
            }
        }

        String replaced = new String(chars);

        //System.out.println("String: (" + s + ") with char " + target + " replaced with " + replacement + " = " + replaced);
        System.out.println("REPLACED: " + replaced);
    }

    public static void replaceWord(String text, String target, String replacement){
        String [] words = text.split(" "); // get words in array
        for (int i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                words[i] = replacement;
            }
        }

        String replaced = String.join(" ", words); //{"asd","add"} join(" ") does this: "asd add"
        System.out.println("Replaced: " + replaced);
    }

    public static void email(String email){
        System.out.println("Email: " + email);

        String [] emailParts = email.split("@");
        String username = emailParts[0];
        String domain = emailParts[1];

        System.out.println("Username: " + username);
        System.out.println("Full domain: " + domain);

        // extract subdomain and main domain
        // full domain: famnit.upr.si
        int firstDotIndex = domain.indexOf('.'); // returns -1 if not found
        int lastDotIndex = domain.lastIndexOf('.');

        if(firstDotIndex != lastDotIndex){
            String subdomain = domain.substring(0, firstDotIndex);
            System.out.println("Subdomain: " + subdomain);
            String mainDomain = domain.substring(firstDotIndex + 1, lastDotIndex);
            System.out.println("Main domain: " + mainDomain);
            String topLevelDomain = domain.substring(lastDotIndex + 1); // if no second value it goes to the end of string
            System.out.println("Top level domain: " + topLevelDomain);
        }else {
            String mainDomain = domain.substring(0, firstDotIndex);
            System.out.println("Main domain: " + mainDomain);
            String topLevelDomain = domain.substring(lastDotIndex + 1);
            System.out.println("Top level domain: " + topLevelDomain);
        }


    }




}
