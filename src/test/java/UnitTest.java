import org.junit.Assert;
import org.junit.Test;



/**
 * Created by countdyang on 3/22/2021.
 */
public class UnitTest {

    Intersection output = new Intersection();

    @Test
	public void testForExampleCase(){
        int[] input = {2,10,4,9,3,8};
        int[] expResult = {4,7};
        Assert.assertArrayEquals(expResult,output.getIntersectionOfIntervals(input));
	}

    @Test
    public void testForNoOverlappingCase(){
        int[] input = {2,1,4,1,6,2};
        int[] expResult = null;
        Assert.assertArrayEquals(expResult,output.getIntersectionOfIntervals(input));
    }

    @Test
    public void testForNegativeNumberCase(){
        int[] input = {-1,5,3,3,1,5};
        int[] expResult = {3,1};
        Assert.assertArrayEquals(expResult,output.getIntersectionOfIntervals(input));
    }

    @Test
    public void testForOnePointOverlappingCase(){
        int[] input = {2,1,3,1};
        int[] expResult = null;
        Assert.assertArrayEquals(expResult,output.getIntersectionOfIntervals(input));
    }

}
