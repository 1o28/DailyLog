
class removeWhitespaceString {

    static int removeSpaces(char[] str) {
        int count = 0;

        for (int i = 0; i < str.length; i++)
            if (str[i] != ' ')
                str[count++] = str[i];

        // System.out.print(count);
        return count;
    }

    public static void main(String[] args) {
        char str[] = "g eeks for ge eeks ".toCharArray();
        // System.out.println(str.length);
        int i = removeSpaces(str);
        System.out.println(String.valueOf(str).substring(0, i));
    }
}
