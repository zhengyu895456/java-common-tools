import com.zeroten.common.util.ArrayUtils;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestArraySort {
    @Test
    public void ArraySortTest(){
        int[] arr = new int[]{21,14,5,64,75,54,32,6};
        ArrayUtils.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
