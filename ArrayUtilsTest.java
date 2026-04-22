
package com.mycompany.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ArrayUtilsTest {
    @Test
    void testFindMax(){
        int arr[]={12, 5, 8, 20, 3};
        int result=ArrayUtils.findMax(arr);
        assertEquals(20,result);
    } 
    @Test
    void testFindMin()
    {
        int arr[]={12, 5, 8, 20, 3};
         int result=ArrayUtils.findMin(arr);
        assertEquals(3,result);
    }
}
