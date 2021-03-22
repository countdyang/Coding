/**
 * Created by countdyang on 3/22/2021.
 */
public class Intersection {

    public int[] getIntersectionOfIntervals(int[] input){
        if(input == null || input.length == 0){
            return null;
        }
        int[] result = new int[2];
        int head = Integer.MIN_VALUE;
        int tail = Integer.MAX_VALUE;
        for (int i=0; i<input.length; i=i+2){
            int add = i + 1;
            int range = input[i] + input[add];
            if(head < input[i]){// To maintain the largest start position.
                head = input[i];
            }
            if(tail > range){// To maintain the smallest end position.
                tail = range;
            }
        }
        if(head >= tail){// These situations mean no overlapping in given array.
            return null;
        }else {
            result[0] = head;
            result[1] = tail - head;// Calculate interval length.
            return result;
        }
    }
}
