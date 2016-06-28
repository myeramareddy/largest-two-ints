/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnum.scenario1;

import largestnum.ResultPojo;

/**
 *
 * @author ManishaYeramareddy
 */
public class LargestNumScenario1 {

    public ResultPojo findLargestNumbers(Integer[] list) {
        ResultPojo pojo = new ResultPojo();
        if(list == null || list.length <= 0) {
            return pojo;
        }
        
        for(Integer i : list) {
            if(pojo.getFirstHighest() == null || pojo.getFirstHighest() < i) {
                pojo.setSecondHighest(pojo.getFirstHighest());
                pojo.setFirstHighest(i);
            } else if(pojo.getSecondHighest() == null || pojo.getSecondHighest() < i) {
                pojo.setSecondHighest(i);
            }
        }
        return pojo;
    }
    
    public static void main(String[] args) {
        LargestNumScenario1 instance = new LargestNumScenario1();
        
        Integer[] nums = new Integer[]{5,100,10,125,15,150,20,175,25,0};
        ResultPojo pojo = instance.findLargestNumbers(nums);
        System.out.println("First Highest: "+pojo.getFirstHighest()+" ; Second Highest: "+pojo.getSecondHighest());
        
        Integer[] nums2 = new Integer[]{25,93,97,18,71,114,52,48};
        pojo = instance.findLargestNumbers(nums2);
        System.out.println("First highest: "+pojo.getFirstHighest()+" ; second highest: "+pojo.getSecondHighest());
    }
    
    
}
