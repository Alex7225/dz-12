import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWoman {

    @Test(dataProvider = "womanPartner", dataProviderClass = TestDataProvider.class)
    public void testWomanPartner(Woman woman, boolean partner) {
        Assert.assertEquals(woman.isPartner(), partner,"Something wrong, check method");
    }

    @Test(dataProvider = "womanSurname", dataProviderClass = TestDataProvider.class)
    public void testWomanSurename(Woman woman, String surname) {
        Assert.assertEquals(woman.getLastName(), surname, "Wrong surname");
    }

    @Test(dataProvider = "womanName", dataProviderClass = TestDataProvider.class)
    public void testWomanName(Woman woman, String name) {
        Assert.assertEquals(woman.getFirstName(), name, "No name or didn't changed");
    }

    @Test(dataProvider = "womanRetired", dataProviderClass = TestDataProvider.class)
    public void testWomanRetired(Woman woman, boolean retired) {

        Assert.assertEquals (woman.isRetired(), retired, "Check Retired method");
    }

    @Test(dataProvider = "womanAge", dataProviderClass = TestDataProvider.class)
    public void testWomanAge(Woman woman, int age) {

        Assert.assertEquals(woman.getAge(), age, "Wrong age, maybe didn't store");
    }

    @Test(dataProvider = "womanGetPartner", dataProviderClass = TestDataProvider.class)
    public void testWomanGetPartner(Woman woman, String partner) {
        Assert.assertEquals(woman.getRegisterPartnership(), partner, "No partner");
    }

    @Test(dataProvider = "womanData", dataProviderClass = TestDataProvider.class)
    public void testWomanPather(Woman woman, String regPartner) {
        Assert.assertEquals(woman.deregisterPartnership(), regPartner, "No partner");
    }
}