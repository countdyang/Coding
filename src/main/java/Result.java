/**
 * Created by countdyang on 3/22/2021.
 */
public class Result {
    public static void main(String args[]){
        Intersection output = new Intersection();
        int[] input = {2,10,4,9,3,8};
        int[] result = output.getIntersectionOfIntervals(input);
        System.out.println("[" + result[0] + "," + result[1] + "]");

    }
}
