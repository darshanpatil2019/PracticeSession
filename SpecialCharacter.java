public class SpecialCharacter {
    public static void main(String[] args) {

        String s = "darshan#$#@";
        String str = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
                count++;
            } else {
                str = str + s.charAt(i);
            }
        }
        if (count == 0) {
            System.out.println("Special Character is not Found");
        } else {
            System.out.println("Special Character is found : " + count);
        }
        System.out.println("String without special character : " + str);
    }
}
