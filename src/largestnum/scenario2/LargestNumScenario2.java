/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnum.scenario2;

import java.util.Objects;
import largestnum.ResultPojo;

/**
 *
 * @author ManishaYeramareddy
 */
public class LargestNumScenario2 {
    
    //O(n) - assumes NO ties - Ex: 2,2,1 rets 2,1
    public ResultPojo findLargestNumbers(Integer[] list) {
        ResultPojo retPojo = new ResultPojo();
        
        if(list == null || list.length <= 0) {
            return retPojo;
        }
        
        for(Integer i : list) {
            if(retPojo.getFirstHighest() == null) {
                retPojo.setFirstHighest(i);
            } else if(i > retPojo.getFirstHighest()) {
                if(!Objects.equals(i, retPojo.getFirstHighest())) {
                    retPojo.setSecondHighest(retPojo.getFirstHighest());
                }
                retPojo.setFirstHighest(i);
            } else if( !Objects.equals(i, retPojo.getFirstHighest()) && (retPojo.getSecondHighest() == null || retPojo.getSecondHighest() < i)) {
                retPojo.setSecondHighest(i);
            }
        }
        return retPojo;
    }
    
    public static void main(String[] args) {
        LargestNumScenario2 instance = new LargestNumScenario2();
        
        Integer[] nums = new Integer[]{5,100,10,125,15,150,20,175,25,0};
        ResultPojo ret = instance.findLargestNumbers(nums);
        System.out.println("First Highest: "+ret.getFirstHighest()+" ; Second Highest: "+ret.getSecondHighest());
        
        Integer[] nums2 = new Integer[]{3,7};
        ret = instance.findLargestNumbers(nums2);
        System.out.println("First highest: "+ret.getFirstHighest()+" ; second highest: "+ret.getSecondHighest());
    }
    
    
}
