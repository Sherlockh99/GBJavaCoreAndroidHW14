import org.junit.Assert;
import org.junit.Test;

public class CheckArrayTest {
    @Test
    public void testCheckArray(){
        int[] arr1 = {1,1,4,1,1,4,4,1};
        int[] arr2 = {1,1,3,1,1,3,3,1};
        int[] arr3 = {1,1,3,1,1,4,5,1};

        Assert.assertEquals(true,MainClass.checkArray(arr1,1,4));
        Assert.assertEquals(false,MainClass.checkArray(arr2,1,4));
        Assert.assertEquals(false,MainClass.checkArray(arr3,1,5));

    }
}
