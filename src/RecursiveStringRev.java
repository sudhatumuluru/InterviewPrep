public class RecursiveStringRev {
    public static void main(String[] args) {
        String str = "Sudha";
        String reversedStr = reverse(str);
        System.out.println("The reverse of the string \""
                + str + "\" is \"" + reversedStr + "\".");
    }
 
    private static String reverse(String str) {
        if (str == null || str.length() <= 1)
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}