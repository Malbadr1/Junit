import org.junit.jupiter.api.*;

public class NameTest {
    @BeforeEach
    public  void beforeEach(){
        System.out.println("hhhhhhhhhhhhh");
    }

    @Test
    public void Should_return_Name_if_contain_special_charachter(){
        System.out.println("The first case");
        String actualResult= Name.checkName("Ali@");
        String expectedResult= "User";
        Assertions.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void a_Should_return_Name_if_not_contain_special_charachter(){
        System.out.println("The 3d case");
        String actualResult= Name.checkName("Ali");
        String expectedResult="Ali";
        Assertions.assertEquals(actualResult,expectedResult);
    }
}
