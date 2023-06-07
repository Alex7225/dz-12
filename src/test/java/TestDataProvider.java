import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "isRetired")
    public static Object[][] manMethod(){
        Man man1 = new Man("Oleg", "Prokopenko", 24, false);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        return new Object[][]{
                {man1, false},
                {man2, true},
                {man3, false}
        };
    }
    @DataProvider(name = "isName")
    public static Object[][] nameMethod(){
        Man man1 = new Man("Oleg", "Prokopenko", 24, false);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        return new Object[][]{
                {man1, "Oleg"},
                {man2, "Ivan"},
                {man3, "Kolyan"}
        };
    }
    @DataProvider(name = "isSurname")
    public static Object[][] surnameMethod(){
        Man man1 = new Man("Oleg", "Prokopenko", 24, false);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        return new Object[][]{
                {man1, "Prokopenko"},
                {man2, "Mukolaichyk"},
                {man3, "Yachuk"}
        };
    }
    @DataProvider(name = "isAge")
    public static Object[][] ageMethod(){
        Man man1 = new Man("Oleg", "Prokopenko", 24, false);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        return new Object[][]{
                {man1, 24},
                {man2, 66},
                {man3, 45}
        };
    }
    @DataProvider(name = "isPartner")
    public static Object[][] partnerMethod(){
        Man man1 = new Man("Oleg", "Prokopenko", 24, false);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        return new Object[][]{
                {man1, false},
                {man2, true},
                {man3, true}
        };
    }

    @DataProvider(name = "womanPartner")
    public static Object[][] womanMethod(){
        Woman woman1 = new Woman("Olga", "Kononenko", 24, false);
        Woman woman2 = new Woman("Olena", "Petrivna", 61, true);
        Woman woman3 = new Woman("Vika", "Shevchuk", 44, true);
        return new Object[][]{
                {woman1, false},
                {woman2, true},
                {woman3, true}
        };
    }
    @DataProvider(name = "womanSurname")
    public static Object[][] wsurnameMethod(){
        Woman woman1 = new Woman("Olga", "Kononenko", 24, false);
        Woman woman2 = new Woman("Olena", "Petrivna", 61, true);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        woman2.registerPartner(man2);
        Woman woman3 = new Woman("Vika", "Shevchuk", 44, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        woman3.registerPartner(man3);
        return new Object[][]{
                {woman1, "Kononenko"},
                {woman2, "Mukolaichyk"},
                {woman3, "Yachuk"}
        };
    }
    @DataProvider(name = "womanName")
    public static Object[][] wnameMethod(){
        Woman woman1 = new Woman("Olga", "Kononenko", 24, false);
        Woman woman2 = new Woman("Olena", "Petrivna", 61, true);
        Woman woman3 = new Woman("Vika", "Shevchuk", 44, true);
        return new Object[][]{
                {woman1, "Olga"},
                {woman2, "Olena"},
                {woman3, "Vika"}
        };
    }
    @DataProvider(name = "womanRetired")
    public static Object[][] wretiredMethod(){
        Woman woman1 = new Woman("Olga", "Kononenko", 24, false);
        Woman woman2 = new Woman("Olena", "Petrivna", 61, true);
        Woman woman3 = new Woman("Vika", "Shevchuk", 44, true);
        return new Object[][]{
                {woman1, false},
                {woman2, true},
                {woman3, false}
        };
    }
    @DataProvider(name = "womanAge")
    public static Object[][] wageMethod(){
        Woman woman1 = new Woman("Olga", "Kononenko", 24, false);
        Woman woman2 = new Woman("Olena", "Petrivna", 61, true);
        Woman woman3 = new Woman("Vika", "Shevchuk", 44, true);
        return new Object[][]{
                {woman1, 24},
                {woman2, 61},
                {woman3, 44}
        };
    }
    @DataProvider(name = "womanGetPartner")
    public static Object[][] wpartnerMethod(){
        Woman woman1 = new Woman("Olga", "Kononenko", 24, false);
        Man man1 = new Man("Oleg", "Prokopenko", 24, false);
        woman1.registerPartner(man1);
        Woman woman2 = new Woman("Olena", "Petrivna", 61, true);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        woman2.registerPartner(man2);
        Woman woman3 = new Woman("Vika", "Shevchuk", 44, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        woman3.registerPartner(man3);
        return new Object[][]{
                {woman1, "Prokopenko"},
                {woman2, "Mukolaichyk"},
                {woman3, "Yachuk"}
        };
    }
    @DataProvider(name = "womanData")
    public static Object[][] wpartnerRegMethod(){
        Woman woman1 = new Woman("Olga", "Kononenko", 24, false);
        Woman woman2 = new Woman("Olena", "Petrivna", 61, true);
        Man man2 = new Man("Ivan", "Mukolaichyk", 66, true);
        woman2.registerPartner(man2);
        Woman woman3 = new Woman("Vika", "Shevchuk", 44, true);
        Man man3 = new Man("Kolyan", "Yachuk", 45, true);
        woman3.registerPartner(man3);
        return new Object[][]{
                {woman1, "Kononenko"},
                {woman2, "Partner registered!"},
                {woman3, "Partner registered!"}
        };
    }
}
