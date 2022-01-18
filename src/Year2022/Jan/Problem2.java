package Year2022.Jan;

public class Problem2 {

    //If we use split, it is just slightly faster than this.
    //If find any new approach, solve this

    public static int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i = 0; i < sentences.length; i++){
            int spaces = 0;
            for (int j = 0; j < sentences[i].length(); j++){
                if (sentences[i].charAt(j) == ' '){
                    spaces++;
                }
            }
            if (spaces+1 > max){
                max = spaces+1;
            }

        }

        return max;

    }

    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(s));
    }
}
