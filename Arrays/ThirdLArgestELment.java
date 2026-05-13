package Arrays;

public class ThirdLArgestELment {
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 3, 5};
        System.out.println(thirdLargest(arr));
    }
   public static int thirdLargest(int arr[]) {
        // code here
        int large=Integer.MIN_VALUE;
        int secLarge=Integer.MIN_VALUE;
        int thirdLarge=Integer.MIN_VALUE;
        for(Integer i:arr)
        {
            if(i>large)
            {
                thirdLarge=secLarge;
                secLarge=large;
                large=i;
            }
            else if(i>secLarge)
            {
                thirdLarge=secLarge;
                secLarge=i;
            }
            else if(i>thirdLarge)
            {
                thirdLarge=i;
            }
        }

return thirdLarge==Integer.MIN_VALUE?-1:thirdLarge;
    }
}
