import com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsEmpty {
    @Test
    public static void isEmptyTest(){
        String[] str = new String[]{};
        Assert.assertTrue(CheckUtils.isEmpty(str));
    }
}
