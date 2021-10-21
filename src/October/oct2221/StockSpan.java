package October.oct2221;

import java.util.ArrayList;
import java.util.Stack;

class PairValue{
    int greatestValue;
    int indexValue;

    public PairValue(int greatestValue, int indexValue){
        this.greatestValue = greatestValue;
        this.indexValue = indexValue;
    }
}

// 100 85 50 70 60

public class StockSpan {

    public static ArrayList<Integer> stockSpan(int[] arr, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<PairValue> stack = new Stack<>();

        for (int i = 0; i < size; i++){
            if (stack.size() <= 0){
                arrayList.add(-1);
            }else if(stack.peek().greatestValue > arr[i]){
                arrayList.add(stack.peek().indexValue);
            }else if(stack.peek().greatestValue <= arr[i]){
                while (stack.size() > 0 && stack.peek().greatestValue <= arr[i]){
                    stack.pop();
                }

                if (stack.size() <= 0){
                    arrayList.add(-1);
                }else{
                    arrayList.add(stack.peek().indexValue);
                }
            }

            stack.add(new PairValue(arr[i],i));
        }

        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(stockSpan(new int[]{100, 80, 60, 70, 60, 75, 85}, 7));
    }
}
