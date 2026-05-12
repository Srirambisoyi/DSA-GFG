package Arrays;

import java.util.ArrayList;

public class LargestAndSmallestEleMent {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};
        System.out.println(getMinMax(arr));
    }
     public static ArrayList<Integer> getMinMax(int[] arr) {
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        ArrayList<Integer> al=new ArrayList<>();
        for(Integer i:arr)
        {
            if(i<small)
            {
                small=i;
            }
            if(i>large)
            {
                large=i;
            }
        }
        al.add(small);
        al.add(large);
        return al;
     }

    
}
