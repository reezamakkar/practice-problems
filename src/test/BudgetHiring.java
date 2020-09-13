package test;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class BudgetHiring {

    public static void main(String args[] ) throws Exception {

//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt(),n,m,b,u,v,p,i,j,k,q;
//        LinkedList<Integer> adj[];
//        for(p=0;p<t;p++)
//        {
//            n=in.nextInt();
//            m=in.nextInt();
//            b=in.nextInt();
//            adj=new LinkedList[n+1];
//            int l[][]=new int[n+1][n+1],c[][]=new int[n+1][n+1];
//            for(i=0;i<=n;i++) adj[i]=new LinkedList<>();
//            for(i=0;i<m;i++)
//            {
//                u=in.nextInt();v=in.nextInt();
//                adj[v].add(u);
//                c[u][v]=in.nextInt();
//                l[u][v]=in.nextInt();
//            }
//            long dp[][]=new long[n+1][b+1];
//            for(i=0;i<=n;i++) Arrays.fill(dp[i],Integer.MAX_VALUE);
//            Arrays.fill(dp[1],0);
//            int s;
//            Iterator<Integer> itr;
//            for(i=2;i<=n;i++)
//            {
//                for(j=0;j<=b;j++)
//                {
//                    itr=adj[i].iterator();
//                    while(itr.hasNext())
//                    {
//                        s=itr.next();
//                        if(j>=c[s][i])
//                            dp[i][j]=Math.min(dp[i][j],dp[s][j-c[s][i]]+l[s][i]);
//                    }
//                }
//            }
//            q=in.nextInt();
//            for(i=0;i<q;i++)
//            {
//                s=in.nextInt();
//                j=in.nextInt();
//                if(dp[s][j]==Integer.MAX_VALUE)
//                    System.out.println("-1");
//                else
//                    System.out.println(dp[s][j]);
//            }
//        }
    }
}
