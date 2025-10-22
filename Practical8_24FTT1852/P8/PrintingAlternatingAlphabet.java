package P8;

public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        String[] alphabet = new String[26];


        // Fill array with a-z
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf((char) ('a' + i));
        }

        // print a-z and z-a alternately using one loop
        for (int i = 0, j = 25; i < 26; i++, j--) {
            System.out.print(alphabet[i] + " " + alphabet[j] + " ");
        }
    }
}
