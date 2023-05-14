package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesCalcTest {

    @Test

    public void testSum() {
        SalesCalcService service = new SalesCalcService();

        int[] SalesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesSum(SalesArr);
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMid() {
        SalesCalcService service = new SalesCalcService();

        int[] SalesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.salesMid(SalesArr);
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMax() {
        SalesCalcService service = new SalesCalcService();

        int[] SalesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.salesMax(SalesArr);
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMin() {
        SalesCalcService service = new SalesCalcService();

        int[] SalesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.salesMin(SalesArr);
        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void testLowMid() {
        SalesCalcService service = new SalesCalcService();

        int[] SalesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesLowMid(SalesArr);
        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void testUpMid() {
        SalesCalcService service = new SalesCalcService();

        int[] SalesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesUpMid(SalesArr);
        Assertions.assertEquals(expected, actual);

    }
}
