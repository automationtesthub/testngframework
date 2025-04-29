package JunitExamples;

import org.junit.Assert;
import org.junit.Test;

public class AssertionExamples {

    @Test
    public void validations()
    {
        String exp = "vtiger";
        String act = "vtiger";
        Assert.assertEquals(exp,act);
        /*
        if(exp.equals(act))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test failed");
        }

         */

    }
}
