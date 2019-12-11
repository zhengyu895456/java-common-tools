import com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsAnyEmpty {
    @Test
    public static void IsAnyEmptyTest(){
        String[] strings1 = new String[]{"s","dd"};
        String[] strings2 = new String[]{"s","dd",""};
        String[] strings3 = new String[]{"s","dd",null};
        Assert.assertTrue(CheckUtils.isAnyEmpty(strings1));
        Assert.assertFalse(CheckUtils.isAnyEmpty(strings2));
        Assert.assertFalse(CheckUtils.isAnyEmpty(strings3));
    }
}
