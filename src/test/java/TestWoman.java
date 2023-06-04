import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWoman {

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanPartner(Woman woman) {

        Assert.assertTrue(woman.isPartner(), "Woman has no partner");
    }

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanSurename(Woman woman) {
        Assert.assertEquals(woman.getLastName(), "Mukolaichyk", "No Partner or Surname didn't changed");
    }

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanName(Woman woman) {

        Assert.assertEquals(woman.getFirstName(), "Olga", "No name or didn't changed");
    }

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanRetired(Woman woman) {

        Assert.assertEquals (woman.isRetired(), woman.getAge()>=60, "Check Retired method");
    }

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanAge(Woman woman) {

        Assert.assertEquals(woman.getAge(), 24, "Wrong age, maybe didn't store");
    }

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanGetPartner(Woman woman) {
        Assert.assertEquals(woman.getRegisterPartnership(), "Mukolaichyk", "No partner");
    }

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanPather(Woman woman) {
        Assert.assertEquals(woman.deregisterPartnership(), "Partner registered!", "No partner");
    }
}