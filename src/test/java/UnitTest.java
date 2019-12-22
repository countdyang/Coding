import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by countdyang on 7/15/2018.
 */
public class UnitTest {

    Combination temp = new Combination();

    @Test
	public void testForTwoSingleDigit(){
        int[] input = {2,3};
        String[] exp = new String[] { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
	}

    @Test
    public void testForTwoSingleDigitContainZeroOne1(){
        int[] input = {0,3};
        String[] exp = new String[] { "d", "e", "f" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }

    @Test
    public void testForTwoSingleDigitContainZeroOne2(){
        int[] input = {1,9};
        String[] exp = new String[] { "w", "x", "y","z" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }

    @Test
    public void testForTwoSingleDigitContainZeroOne3(){
        int[] input = {0,1};
        String[] exp = new String[] { "" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }

    @Test
    public void testForSingleDigitMoreThanTwo(){
        int[] input = {2,3,4};
        String[] exp = new String[] { "adg", "adh","adi","aeg", "aeh","aei","afg", "afh","afi","bdg", "bdh","bdi","beg", "beh","bei","bfg","bfh","bfi", "cdg","cdh","cdi", "ceg", "ceh","cei","cfg","cfh","cfi" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }

    @Test
    public void testForSingleDigitSame(){
        int[] input = {2,2};
        String[] exp = new String[] { "aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }

    @Test
    public void testForMoreThanNineAndContainZeroOne(){
        int[] input = {20,21};
        String[] exp = new String[] { "aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }

    @Test
    public void testForMoreThanNine2(){
        int[] input = {13,99};
        String[] exp = new String[] { "dww", "dwx", "dwy", "dwz", "dxw", "dxx", "dxy", "dxz", "dyw", "dyx", "dyy", "dyz", "dzw", "dzx", "dzy", "dzz",
                                      "eww", "ewx", "ewy", "ewz", "exw", "exx", "exy", "exz", "eyw", "eyx", "eyy", "eyz", "ezw", "ezx", "ezy", "ezz",
                                      "fww", "fwx", "fwy", "fwz", "fxw", "fxx", "fxy", "fxz", "fyw", "fyx", "fyy", "fyz", "fzw", "fzx", "fzy", "fzz",};
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }

    @Test
    public void testForMoreThanNine3(){
        int[] input = {0,1,67};
        String[] exp = new String[] { "mp", "mq", "mr","ms", "np", "nq", "nr", "ns", "op", "oq", "or", "os" };
        List<String> expResult = Arrays.asList(exp);
        Assert.assertEquals(expResult,temp.letterCombination(input));
    }
}
