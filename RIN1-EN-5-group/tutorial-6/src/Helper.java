import javax.sound.midi.Soundbank;

public class Helper {
    public static void hello(String name){
        System.out.println("Hello " + name + ", welcome!"); // string concatination
        // "Hell" + "o wo" + "rld!" = "Hello world!"
        System.out.println("Hello ".concat(name).concat(", welcome!"));
        String s = "something " + "new";
        System.out.println(s);
    }

    public static void palindrome(String s){
        s = s.toUpperCase(); //toLowerCase() words as well
        // remove spaces
        s = s.replaceAll(" ", "");
        boolean isPalindrome = true; // we assume that it is a palindrome

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
        // STRING VERSION
//        String reversed = "";
//        for (int i = s.length() - 1; i >= 0; i--){
//            reversed += s.charAt(i);
//        }
//
//        return reversed;

        // CHAR ARRAY APPROACH
        char [] chars = s.toCharArray();
        for(int i = 0; i < chars.length/2; i++){
            char temp = chars[i];
            chars[i] = chars[chars.length - 1- i];
            chars[chars.length - 1 - i] = temp;
        }

        return new String(chars);
    }

    public static void palindromeReverse(String s){
        s = s.toUpperCase();
        String reversed = reverse(s);

        if(s.equals(reversed)){
            System.out.println(s + " is a palindrome.");
        }else{
            System.out.println(s + " is not a palindrome.");
        }
    }

    public static void replaceChar(String text, char [] targets, char replacement){
        // STRING WAY
//        String replaced = "";
//        for(int i = 0; i < text.length(); i++){
//            if(text.charAt(i) == target){
//                replaced += replacement;
//            }else {
//                replaced += text.charAt(i);
//            }
//        }

        // CHAR ARRAY WAY
//        char [] chars = text.toCharArray();
//        for(int i = 0; i < chars.length; i++){
//            if(chars[i] == target){
//                chars[i] = replacement;
//            }
//        }
        char [] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++){
            for (int j = 0; j < targets.length; j++){
                if(chars[i] == targets[j]){
                    chars[i] = replacement;
                }
            }
        }


        String replaced = new String(chars);

        System.out.println("REPLACED: " + replaced);
    }

    public static void replaceWord(String text, String target, String replacement){
        String [] words = text.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                words[i] = replacement;
            }
        }

        String replaced = String.join(" ", words); // {"I","hate","rain"} -> I hate rain
        System.out.println("REPLACED: " + replaced);
    }

    public static void email(String email){
        System.out.println("Email: " + email);
//        String [] emailParts = email.split("@");
//        String username = emailParts[0];
//        String domain = emailParts[1];

         String username = email.substring(0,email.indexOf("@"));
         String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Username: " + username);
        System.out.println("Full domain: " + domain);

//        int firstDotIndex = domain.indexOf("."); // if not found returns -1
//        int lastDotIndex = domain.lastIndexOf(".");
//
//        if(firstDotIndex != lastDotIndex){
//            String subdomain = domain.substring(0,firstDotIndex);
//            System.out.println("Subdomain: " + subdomain);
//            String mainDomain = domain.substring(firstDotIndex+1,lastDotIndex);
//            System.out.println("Main domain: " + mainDomain);
//            String topLevelDomain = domain.substring(lastDotIndex+1);
//            System.out.println("Top level domain: " + topLevelDomain);
//        }else{
//            System.out.println("No subdomain");
//            String mainDomain = domain.substring(0,firstDotIndex);
//            System.out.println("Main domain: " + mainDomain);
//            String topLevelDomain = domain.substring(firstDotIndex+1);
//            System.out.println("Top level domain: " + topLevelDomain);
//        }

        String [] domainParts = domain.split("\\.");

        if(domainParts.length == 3){
            System.out.println("Subdomain: " + domainParts[0]);
            System.out.println("Main domain: " + domainParts[1]);
            System.out.println("Top level domain: " + domainParts[2]);
        }else{
            System.out.println("No subdomain");
            System.out.println("Main domain: " + domainParts[0]);
            System.out.println("Top level domain: " + domainParts[1]);
        }




    }
}
