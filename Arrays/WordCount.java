package Arrays;

public class WordCount {

    public static void main(String args[]) {
        String str = "mka\\t";
        int wCount = wordCount(str);
        System.out.println(wCount);
    }

    private static int wordCount(String str) {
        char[] ch = str.toCharArray();
        int length = str.length() - 1;
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i]) && i != length) {
                isWord = true;
            }

            if (!Character.isLetter(ch[i]) && isWord) {
                wordCount++;
                isWord = false;
            }

            if (Character.isLetter(ch[i]) && i == length) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
