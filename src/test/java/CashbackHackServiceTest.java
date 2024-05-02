
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void calculationCashbackTest (){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(500);

        Assert.assertEquals (result, 500);

    }

    @Test
    public void calculationCashbackTest1 (){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(1000);

        Assert.assertEquals (result, 1000);

    }
}




