public class ConvertString {
    public static void main(String[] args) {
        String str = "HapPy";
        StringBuilder str1 = new StringBuilder(str);
        System.out.println("Old String : " + str);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                str1.setCharAt(i, Character.toUpperCase(str1.charAt(i)));

            } else if (Character.isUpperCase(str.charAt(i))) {
                str1.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("New String : " + str1);
    }
}

