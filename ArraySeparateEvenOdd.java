//This program prints a Separate array consisting of first even then odd numbers in Java 
//This array is a modified version of the given array

public class ArraySeparateEvenOdd {
    public static void main(String args[])
    {
        int arr[] = {54, 43, 2, 5, 14, 17, 18, 19};
        int even = 0;
        int odd = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        int result[] = new int[even + odd];
        int evenindex = 0;
        int oddindex = even;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                result[evenindex++] = arr[i];
            }
            else
            {
                result[oddindex++] = arr[i];
            }
        }

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}
