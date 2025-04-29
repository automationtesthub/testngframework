package TestNGExamples;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExamples {

    @Test
    public void validations()
    {
        SoftAssert sa = new SoftAssert();
        String exp = "vtiger";
        String act = "vtiger1";
        sa.assertEquals(exp,act);

        String exp1 = "vtiger";
        String act1 = "vtiger2";
        sa.assertEquals(exp1,act1);

        sa.assertAll();


    }
}
