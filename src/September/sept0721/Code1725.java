package September.sept0721;

public class Code1725 {

    // Completed

    public static int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;
        for(int i=0;i<rectangles.length;i++){
            int min = Math.min(rectangles[i][0],rectangles[i][1]);
            if(max<min){
                max = min;
                count=1;
            }
            else if(max==min){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
