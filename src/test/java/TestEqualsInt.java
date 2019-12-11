import com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEqualsInt {
    @Test
    public static void EqualIsIntTest(){
        Integer n1 = 234;
        Integer n2 = 234;
        Integer n3 = null;
        Integer n4 = 432;
        Assert.assertTrue(CheckUtils.equals(n1,n2));
        Assert.assertFalse(CheckUtils.equals(n1,n3));
        Assert.assertFalse(CheckUtils.equals(n1,n4));
    }
}
