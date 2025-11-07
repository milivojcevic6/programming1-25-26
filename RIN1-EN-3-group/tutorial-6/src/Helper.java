public class Helper {
    public static void hello(String name){
        System.out.println("Hello " + name + ", welcome!"); // string concatination "He" + "llo" = "Hello"
        //System.out.println("Hello ".concat(name).concat(", welcome!")); // result is the same
    }

    public static void palindrome(String s){
        s = s.toLowerCase();
        s = s.replaceAll(" ","");
        System.out.println("STRING: " + s);

        boolean isPalindrome = true; // assume it is a palindrome

        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(s + " IS PALINDROME");
        }else {
            System.out.println(s + " IS NOT PALINDROME");
        }

    }

    public static String reverse(String s){
        // Directly with string
//        String reversed = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reversed += s.charAt(i); // ""+k+a+y+a+k = "kayak"
//        }
//        return reversed;

        // USING CHAR ARRAY
        char [] chars = s.toCharArray();
        for(int i = 0; i < chars.length/2; i++){
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }

        return new String(chars);
    }

    public static void palindromeReverse(String s){
        s = s.toLowerCase();
        String reversed = reverse(s);

        if(s.equals(reversed)){
            System.out.println(s + " IS PALINDROME");
        }else {
            System.out.println(s + " IS NOT PALINDROME");
        }
    }

    public static String replaceChar(String text, char [] targets, char replacement){
        // string directly
//        String replaced = "";
//
//        for(int i = 0; i < text.length(); i++){
//            if(text.charAt(i) == target){
//                replaced += replacement;
//            }else{
//                replaced += text.charAt(i);
//            }
//        }
//        return replaced;

        //char array
//        char [] chars = text.toCharArray();
//        for(int i = 0; i < chars.length; i++){
//            if(chars[i] == target){
//                chars[i] = replacement;
//            }
//        }

        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < targets.length; j++){
                if(chars[i] == targets[j]){
                    chars[i] = replacement;
                }
            }
        }

        return new String(chars);
    }

    public static void replaceWord(String text, String target, String replacement){
        String [] words = text.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                words[i] = replacement;
            }
        }

        String replaced = String.join(" ", words); // {"I","am","Bogdan"} -> "I am Bogdan"

        System.out.println(replaced);
    }

    public static void email(String email){
        // bogdan.sinik@famnit.upr.si
        System.out.println("Email: " + email);
        String [] emailParts = email.split("@");

        String username = emailParts[0];
        String domain = emailParts[1];
        System.out.println("Username: " + username);
        System.out.println("Full domain: " + domain);

        // find index of first dot
//        int firstDotIndex = domain.indexOf("."); // if not found returns -1
//        int lastDotIndex = domain.lastIndexOf(".");
//        if(firstDotIndex != lastDotIndex){
//            // famnit.upr.si
//            String subdomain = domain.substring(0,firstDotIndex);
//            System.out.println("Subdomain: " + subdomain);
//            String mainDomain = domain.substring(firstDotIndex+1,lastDotIndex);
//            System.out.println("Main domain: " + mainDomain);
//            String topLevelDomain = domain.substring(lastDotIndex+1);
//            System.out.println("Top level domain: " + topLevelDomain);
//        }else {
//            System.out.println("No subdomain found");
//            String mainDomain = domain.substring(0, firstDotIndex);
//            System.out.println("Main domain: " + mainDomain);
//            String topLevelDomain = domain.substring(firstDotIndex+1);
//            System.out.println("Top level domain: " + topLevelDomain);
//        }

        // another way
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
