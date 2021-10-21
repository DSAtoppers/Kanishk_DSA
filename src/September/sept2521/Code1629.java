package September.sept2521;

public class Code1629 {

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] arr = new int[releaseTimes.length];
        arr[0] = releaseTimes[0];
        int last = releaseTimes[0];
        for(int i = 1; i < releaseTimes.length; i++){
            int remain = releaseTimes[i] - last;
            arr[i] = remain;
            last = releaseTimes[i];
        }

        char highest = 0;
        int longest = 0;

        for(int i = 0; i < arr.length; i++){
            if(longest < arr[i]){
                highest = keysPressed.charAt(i);
                longest = arr[i];
            }else if(longest == arr[i]){
                if (highest < keysPressed.charAt(i)){
                    highest = keysPressed.charAt(i);
                    longest = arr[i];
                }
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        System.out.println(slowestKey(new int[]{9,29,49,50},"cbcd"));
    }
}
