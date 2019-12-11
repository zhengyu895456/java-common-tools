import com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsAnyEmpty {
    @Test
    public static void IsAnyEmptyTest(){
        String[] strings = new String[]{"s","dd"};
        Assert.assertTrue(CheckUtils.isAnyEmpty(strings));
    }
}
