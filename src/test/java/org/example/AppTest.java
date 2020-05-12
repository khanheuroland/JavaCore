package org.example;

import static org.junit.Assert.assertTrue;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test  //Annotation, @Test la mot annotation chi ra rang no la mot test case
    @Ignore
    public void Check_SumOrderNumber()
    {
        //Assum
        int expectedNumber = 2550;

        //Action
        int actualNumber = App.SumOrderNumber();

        //Assertion
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    @Ignore
    public void Check_TheNumber_is_Prime()
    {
        //Assume
        int number = 7;
        boolean expected = true;

        //Action
        Boolean actual = App.CheckSNT(number);

        //Assertion
        Assert.assertEquals(expected, actual);
    }

    @Test
    @Ignore
    public void Check_TheNumber_is_not_Prime()
    {
        //Assume
        int number = 8;
        boolean expected = false;

        //Action
        Boolean actual = App.CheckSNT(number);

        //Assertion
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Check_FibonacyList()
    {
        System.out.println(App.GetResult("5+6-333+4"));
        //System.out.println(App.GetNumber("5+6-33+4",4));
        /*
        int[] expected = {1,2,3,5,8,13,21,34,55,89};

        //Action
        int[] actual = App.getFibinacyList();

        //Assertion
        Assert.assertArrayEquals(expected, actual);*/
    }
}
/*
Viết một method tên là CheckPrimeNumber nhận vào một số n bất kỳ. Tra ra kết quả số đó có phải là số nguyên tố hay không
Viết Test Method (Testcase) thực hiện test cho method vừa viết

 */

