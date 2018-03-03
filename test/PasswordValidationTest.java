import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidationTest {
    
    public PasswordValidationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPwdValidate1() {
        System.out.println("pwdValidate");
        String a = "abcdefdf";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate2() {
        System.out.println("pwdValidate");
        String a = "ABCDKJSHKA";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate3() {
        System.out.println("pwdValidate");
        String a = "12345678";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate4() {
        System.out.println("pwdValidate");
        String a = "!@#$%^&*";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate5() {
        System.out.println("pwdValidate");
        String a = "abcdABCD";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate6() {
        System.out.println("pwdValidate");
        String a = "abcd1234";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate7() {
        System.out.println("pwdValidate");
        String a = "ABCD1234";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate8() {
        System.out.println("pwdValidate");
        String a = "abcd1234@#$";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate9() {
        System.out.println("pwdValidate");
        String a = "ABCD1234@#$";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate10() {
        System.out.println("pwdValidate");
        String a = "abcdABCD1234";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate11() {
        System.out.println("pwdValidate");
        String a = "abcdABCD@#$";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate12() {
        System.out.println("pwdValidate");
        String a = "abcdABCD@1";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "pass";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate13() {
        System.out.println("pwdValidate");
        String a = "abCD@1";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate14() {
        System.out.println("pwdValidate");
        String a = "Pass@12";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "fail";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate15() {
        System.out.println("pwdValidate");
        String a = "Pass@123";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "pass";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testPwdValidate16() {
        System.out.println("pwdValidate");
        String a = "anYthing*5";
        PasswordValidation instance = new PasswordValidation();
        String expResult = "pass";
        String result = instance.pwdValidate(a);
        assertEquals(expResult, result);
    }    
}
