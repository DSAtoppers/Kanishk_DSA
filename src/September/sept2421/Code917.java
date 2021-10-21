package September.sept2421;

public class Code917 {

    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while (start <= end){
            if (isCharacter(arr[start]) && isCharacter(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }else if(!isCharacter(arr[start])){
                start++;
            }else if (!isCharacter(arr[end])){
                end--;
            }
        }

        return new String(arr);
    }

    private static boolean isCharacter(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
