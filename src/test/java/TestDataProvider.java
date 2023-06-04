import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "manData")
    public static Object[][] manMethod(){
        return new Object[][]{{new Man("Oleg", "Prokopenko", 24, false)},
                {new Man("Ivan", "Mukolaichyk", 66, true)},
                {new Man("Kolyan", "Yachuk", 42, true)}};
    }

    @DataProvider(name = "womanData")
    public static Object[][] womanMethod(){
        return new Object[][]{{new Woman("Olga", "Prikolna", 24, false)},
                {new Woman("Olena", "Petrivna", 61, true)},
                {new Woman("Vika", "Shevchuk", 44, false)}};
    }
}
