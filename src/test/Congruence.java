package test;
import java.util.*;
import java.lang.*;

public class Congruence {
        static void findX(int num[], int rem[], int k)
        {
            int x = 1;
            List<Integer> res = new ArrayList<Integer>();

            while (res.size() <10)
            {
                int j;
                for (j=0; j<k; j++ )
                    if (x%num[j] != rem[j])
                        break;
                if (j == k)
                    res.add(x);

                x++;
            }
            for(int it : res){
                System.out.println(it);
            }
        }

        // Driver method
        public static void main(String args[])
        {

//            int num[] = {7, 5, 3};
//            int rem[] = {3, 2, 2};
            int num[] = {23, 19, 2, 29, 13};
            int rem[] = {19, 12, 1, 27, 4};
//            int k = num.length;
            int k = 5;
//            19, 23
//            12, 19
//            1, 2
//            27, 29
//            4, 13

            findX(num, rem, k);
        }
    }

