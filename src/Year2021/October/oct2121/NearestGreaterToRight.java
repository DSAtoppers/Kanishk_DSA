package Year2021.October.oct2121;

import java.util.ArrayList;
import java.util.Stack;

public class NearestGreaterToRight {

    public static ArrayList<Integer> nearestGreater(int[] arr, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> mainStack = new Stack<>();

        for (int i = size-1; i >= 0; i-- ){
            if (mainStack.size() <= 0){
                arrayList.add(0,-1);
            }else if (mainStack.peek() > arr[i]){
                arrayList.add(0,mainStack.peek());
            }else if (mainStack.peek() <= arr[i]){
                while (mainStack.size() > 0 && mainStack.peek() <= arr[i]){
                    mainStack.pop();
                }
                if (mainStack.size() <= 0){
                    arrayList.add(0,-1);
                }else{
                    arrayList.add(0,mainStack.peek());
                }
            }
            mainStack.add(arr[i]);
        }

        return arrayList;

    }

    public static void main(String[] args) {
        System.out.println(nearestGreater(new int[]{1,3,2,4}, 4));
    }
}
