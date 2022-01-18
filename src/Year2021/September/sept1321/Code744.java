package Year2021.September.sept1321;

public class Code744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        char result = letters[0];
        while (start <= end){
            int mid = start + (end-start)/2;
            if (letters[mid] > target){
                result = letters[mid];
                end = mid -1;
            }else if (letters[mid] <= target){
                start = mid +1;
            }else{
                result = letters[mid];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'g'));
    }
}
