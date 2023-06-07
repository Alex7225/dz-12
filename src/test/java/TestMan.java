import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestMan {

    @Test (dataProvider = "isRetired", dataProviderClass = TestDataProvider.class)
    public void testHusbenRetired(Man man, boolean expectResult) {
        Assert.assertEquals (man.isRetired(), expectResult, "Check Retired method");
    }
    @Test (dataProvider = "isName", dataProviderClass = TestDataProvider.class)
    public void testHusbenName(Man man, String name) {
        Assert.assertEquals(man.getFirstName(), name, "No name, maybe didn't store");
    }
    @Test (dataProvider = "isSurname", dataProviderClass = TestDataProvider.class)
    public void testHusbenSurname(Man man, String surname) {
        Assert.assertEquals(man.getLastName(), surname, "No surname, maybe didn't store");
    }
    @Test (dataProvider = "isAge", dataProviderClass = TestDataProvider.class)
    public void testHusbenAge(Man man, int age) {
        Assert.assertEquals(man.getAge(), age, "Wrong age, maybe didn't store");
    }
    @Test (dataProvider = "isPartner", dataProviderClass = TestDataProvider.class)
    public void testHusbenPartner(Man man, boolean result) {
        Assert.assertEquals(man.isPartner(), result, "Wrong age, maybe didn't store");
    }
}