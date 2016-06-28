/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnum.scenario1;

import largestnum.ResultPojo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ManishaYeramareddy
 */
public class LargestNumScenario1Test {
    
    public LargestNumScenario1Test() {
    }
    

    @Test
    public void testNullList() {
        System.out.println("findLargestNumbers - nulls");
        Integer[] list = null;
        LargestNumScenario1 instance = new LargestNumScenario1();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals(null, pojo.getFirstHighest());
        assertEquals(null, pojo.getSecondHighest());
    }

    
    @Test
    public void testFindLargestNumbers1() {
        System.out.println("findLargestNumbers - 1");
        Integer[] list = new Integer[]{5,100,10,125,15,150,20,175,25,0};
        LargestNumScenario1 instance = new LargestNumScenario1();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals((Integer)175, pojo.getFirstHighest());
        assertEquals((Integer)150, pojo.getSecondHighest());
    }
    
    @Test
    public void testFindLargestNumbers2() {
        System.out.println("findLargestNumbers - 2");
        Integer[] list = new Integer[]{25,93,97,18,71,114,52,48};
        LargestNumScenario1 instance = new LargestNumScenario1();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals((Integer)114, pojo.getFirstHighest());
        assertEquals((Integer)97, pojo.getSecondHighest());
    }
    
}
