import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMan {

    @Test (dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void testHusbenRetired(Man man) {
        Assert.assertEquals (man.isRetired(), man.getAge()>=65, "Check Retired method");
    }
    @Test (dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void testHusbenSurname(Man man) {
        Assert.assertEquals(man.getLastName(), man.getLastName(), "No surname, maybe didn't store");
    }
    @Test (dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void testHusbenName(Man man) {
        Assert.assertEquals(man.getFirstName(), man.getFirstName(), "No name, maybe didn't store");
    }
    @Test (dataProvider = "manData", dataProviderClass = TestDataProvider.class)
    public void testHusbenAge(Man man) {
        Assert.assertEquals(man.getAge(), man.getAge(), "Wrong age, maybe didn't store");
    }
}