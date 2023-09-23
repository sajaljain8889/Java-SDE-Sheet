package Arrays;

public class CharFreqString {

    public static void main(String[] args) {
        String str = "HelloWorld";
        countOccurenceChar(str);
    }

    private static void countOccurenceChar(String str) {
        String lowerCaseString = str.toLowerCase();
        int count[] = new int[26];

        for (char c : lowerCaseString.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            int occ = count[c - 'a'];
            if (occ > 0) {
                System.out.println("Character " + c + " , Count " + occ);
            }
        }
    }

}
