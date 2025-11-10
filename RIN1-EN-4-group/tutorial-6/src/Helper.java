public class Helper {
    public static void hello(String name){
        System.out.println("Hello " + name + ", welcome!"); // STRING CONCATINATION WITH +
        System.out.println("Hello ".concat(name).concat(", welcome!")); // they do the same
    }

    public static void palindrome(String s){
        s = s.toLowerCase(); // to ignore case
        System.out.println(s);

        boolean isPalindrome = true; // assume that it is a palindrome
        for(int i = 0; i < s.length()/2; i++){
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
        // From string directly
//        String reversed = "";
//
//        for( int i = s.length() - 1; i >= 0; i--){
//            reversed += s.charAt(i); // "" + k + a + y + a + K = kayaK
//        }

        // using char array
        char [] chars = s.toCharArray();

        for ( int i = 0; i < chars.length / 2; i++ ){
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        String reversed = new String(chars); // String.valueOf(chars)

        return reversed;
    }

    public static void palindromeReverse(String s){
        s = s.toLowerCase(); // to ignore case

        String reversed = reverse(s);

        if(s.equals(reversed)){
            System.out.println(s + " is a palindrome.");
        }else {
            System.out.println(s + " is not a palindrome.");
        }

    }

    public static void replaceChar(String text, char [] targets, char replacement){
        // with string
//        String replaced = "";
//
//        for( int i = 0; i < text.length(); i++){
//            if(text.charAt(i) == target){
//                //replaced += replacement;
//                replaced = replaced.concat(String.valueOf(replacement));
//            }else{
//                replaced += text.charAt(i);
//            }
//        }



       // System.out.println("Sting: " + text + " with char " + target + " replaced with " + replacement + ": " + replaced);

        char [] chars = text.toCharArray();

        for(int i = 0; i < chars.length; i++){
            for( int j = 0; j < targets.length; j++){
                if(chars[i] == targets[j]){
                    chars[i] = replacement;
                }
            }
        }

        String replaced = new String(chars);
        System.out.println(replaced);
    }

    public static void replaceWord(String text, String target, String replacement){
        String [] words = text.split(" "); // "I love Java" -> {"I","love","Java"}

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                words[i] = replacement;
            }
        }

        // join does: {"I","love","Java"} -> "I love Java"
        String replaced = String.join(" ", words);

        System.out.println(text + " with word " + target + " replaced with " + replacement + ": " + replaced);
    }

    public static void email(String email){
        System.out.println("Email: " + email);
        // first way
        int indexOfAt = email.indexOf("@");
        String username = email.substring(0, indexOfAt);
        System.out.println("Username: " + username);
        String domain = email.substring(indexOfAt + 1);
        System.out.println("Full domain: " + domain);

        //alternative
//        String [] emailParts = email.split("@");
//        String username = emailParts[0];
//        String domain = emailParts[1];

        int indexOfFirstDot = domain.indexOf(".");
        int indexOfLastDot = domain.lastIndexOf(".");

        if(indexOfFirstDot != indexOfLastDot){
            String subdomain = domain.substring(0, indexOfFirstDot);
            System.out.println("Subdomain: " + subdomain);
            String maindomain = domain.substring(indexOfFirstDot + 1, indexOfLastDot);
            System.out.println("Main domain: " + maindomain);
            String topLevelDomain = domain.substring(indexOfLastDot + 1);
            System.out.println("Top level domain: " + topLevelDomain);
        }else{
            System.out.println("No subdomain");
            System.out.println("Main domain: " + domain.substring(0,indexOfFirstDot));
            System.out.println("Top level domain: " + domain.substring(indexOfFirstDot + 1));
        }
    }


}
