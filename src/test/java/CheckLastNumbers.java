import org.junit.Assert;
import org.junit.Test;

public class CheckLastNumbers {
    @Test
    public void testNewArrayAfterLastNumber(){
        int[] arr = {1,2,3,4,3,5,6};
        int[] arr1 = MainClass.newArrayAfterLastNumber(arr,3);
        int[] arr2 = MainClass.newArrayAfterLastNumber(arr,4);
        int[] arr3 = MainClass.newArrayAfterLastNumber(arr,2);
        int[] arr4 = MainClass.newArrayAfterLastNumber(arr,5);

        int[] actual1 = {3,5,6};
        Assert.assertArrayEquals(arr1,actual1);

        int[] actual2 = {4,3,5,6};
        Assert.assertArrayEquals(arr2,actual2);

        int[] actual3 = {2,3,4,3,5,6};
        Assert.assertArrayEquals(arr3,actual3);

        int[] actual4 = {5,6};
        Assert.assertArrayEquals(arr4,actual4);

    }
}
