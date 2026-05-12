package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,10,10};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(Integer i:arr)
        {
            if(i>largest)
            {
                secondLargest=largest;
                largest=i;
            }
           else if(i>secondLargest && i!=largest)
            {
                secondLargest=i;
            }
        }
        return secondLargest==Integer.MIN_VALUE?-1:secondLargest;
    }
}
