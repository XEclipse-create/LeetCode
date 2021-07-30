import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] ar1, int[] ar2) 
    {
        int i = 0;
 
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        int n = ar1.length;
        int m = ar2.length;

        if ((m + n) % 2 == 1)
        {
            for(count = 0;
                count <= (n + m) / 2;
                count++)
            {
                if (i != n && j != m)
                
                    m1 = (ar1[i] > ar2[j]) ?
                        ar2[j++] : ar1[i++];
                
                else if (i < n)
                
                    m1 = ar1[i++];
                

                else
                
                    m1 = ar2[j++];
                
            }
            double med= m1;
            double median = Math.floor(med * 1e5) / 1e5;
            return median;
        }

        else
        {
            for(count = 0;
                count <= (n + m) / 2;
                count++)
            {
                m2 = m1;
                if (i != n && j != m)
                    m1 = (ar1[i] > ar2[j]) ?
                        ar2[j++] : ar1[i++];
                else if (i < n)
                    m1 = ar1[i++];
                else
                    m1 = ar2[j++];
                
            }
            double med = (m1 + m2) / 2.0;
            double median = Math.floor(med * 1e5) / 1e5;
            return median;

        }
            

            

    }
}