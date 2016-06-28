/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnum.scenario2;

import largestnum.ResultPojo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ManishaYeramareddy
 */
public class LargestNumScenario2Test {
    
    public LargestNumScenario2Test() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of findLargestNumbers method, of class LargestNumScenario2.
     */
    @Test
    public void testNullEmptyList() {
        Integer[] list = null;
        LargestNumScenario2 instance = new LargestNumScenario2();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals(null, pojo.getFirstHighest());
        assertEquals(null, pojo.getSecondHighest());
        
        list = new Integer[]{};
        pojo = instance.findLargestNumbers(list);
        
        assertEquals(null, pojo.getFirstHighest());
        assertEquals(null, pojo.getSecondHighest());
    }
    
    @Test
    public void testFindLargestNumbers1() {
        Integer[] list = new Integer[]{5,100,10,125,15,150,20,175,25,0};
        LargestNumScenario2 instance = new LargestNumScenario2();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals((Integer)175, pojo.getFirstHighest());
        assertEquals((Integer)150, pojo.getSecondHighest());
    }
    
    @Test
    public void testFindLargestNumbers2() {
        Integer[] list = new Integer[]{25,93,97,18,71,114,52,48};
        LargestNumScenario2 instance = new LargestNumScenario2();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals((Integer)114, pojo.getFirstHighest());
        assertEquals((Integer)97, pojo.getSecondHighest());
    }
    
    @Test
    public void testFindLargestNumbersSingleEntry() {
        Integer[] list = new Integer[]{2};
        LargestNumScenario2 instance = new LargestNumScenario2();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals((Integer)2, pojo.getFirstHighest());
        assertEquals(null, pojo.getSecondHighest());
    }
    
    @Test
    public void testFindLargestNumbersNoTies() {
        Integer[] list = new Integer[]{2,2,1};
        LargestNumScenario2 instance = new LargestNumScenario2();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals((Integer)2, pojo.getFirstHighest());
        assertEquals((Integer)1, pojo.getSecondHighest());
    }
    
    @Test
    public void testFindLargestNumbersAllSame() {
        Integer[] list = new Integer[]{2,2,2};
        LargestNumScenario2 instance = new LargestNumScenario2();
        ResultPojo pojo = instance.findLargestNumbers(list);
        
        assertEquals((Integer)2, pojo.getFirstHighest());
        assertEquals(null, pojo.getSecondHighest());
    }
    
}
