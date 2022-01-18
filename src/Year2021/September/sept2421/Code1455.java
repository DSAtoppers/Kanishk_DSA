package Year2021.September.sept2421;

public class Code1455 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split("\\s+");

        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() >= searchWord.length()){
                String s = arr[i].substring(0,searchWord.length());
                if (s.equals(searchWord)){
                    return i + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("love errichto jonathan dumb", "dumb"));
    }
}
