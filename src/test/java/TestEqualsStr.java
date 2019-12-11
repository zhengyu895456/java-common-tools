import com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEqualsStr {
    @Test
    public static void EqualsStrTest(){
        String str1 = new String("s");
        String str2 = new String("s");
        Assert.assertTrue(CheckUtils.equals(str1,str2));
    }
}
