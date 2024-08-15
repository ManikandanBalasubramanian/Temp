package com.leetcode.easy;

public class LemonadeChange {
    
    public boolean lemonadeChange(int[] bills) {
        int sum5=0;
        int sum10=0;
        for(int x:bills)
        {
            if(x==5)
            sum5+=x;
            else if(x==10)
            sum10+=x;
            int change = x-5;
            if(change==5&&sum5<5)
                return false;
            if(change==5&&sum5>=5)
                sum5-=5;
            if(change==15)
            {
                if(sum5<15&&((sum10<10)||(sum5<5)))
                    return false;
                if(sum10>=10&&sum5>=5)
                {
                    sum10-=10;
                    sum5-=5;
                }
                else if(sum5>=15)
                    sum5-=15;
            }
        }
        return true;
    }
}
