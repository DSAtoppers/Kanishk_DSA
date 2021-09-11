package sept1021;

public class Code1394 {

    public static int findLucky(int[] arr) {
        int luckyNum = -1;

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if (arr[j] == num){
                    count++;
                }
            }
            if(count == num){
                if (luckyNum < num){
                    luckyNum = num;
                }
            }
        }

        return luckyNum;
    }

    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{1,2,2,3,3,3}));
    }
}
