package test;
import java.util.*;

public class BuildShelters {
    static int INF = 1000;

    static class Point
    {
        int x;
        int y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    };

    static boolean onSegment(Point p, Point q, Point r)
    {
        if (q.x <= Math.max(p.x, r.x) &&
                q.x >= Math.min(p.x, r.x) &&
                q.y <= Math.max(p.y, r.y) &&
                q.y >= Math.min(p.y, r.y))
        {
            return true;
        }
        return false;
    }
    static int orientation(Point p, Point q, Point r)
    {
        int val = (q.y - p.y) * (r.x - q.x)
                - (q.x - p.x) * (r.y - q.y);

        if (val == 0)
        {
            return 0;
        }
        return (val > 0) ? 1 : 2;
    }

    static boolean doIntersect(Point p1, Point q1,
                               Point p2, Point q2)
    {
        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);
        if (o1 != o2 && o3 != o4)
        {
            return true;
        }
        if (o1 == 0 && onSegment(p1, p2, q1))
        {
            return true;
        }
        if (o2 == 0 && onSegment(p1, q2, q1))
        {
            return true;
        }
        if (o3 == 0 && onSegment(p2, p1, q2))
        {
            return true;
        }
        if (o4 == 0 && onSegment(p2, q1, q2))
        {
            return true;
        }
        return false;
    }
    static boolean isInside(Point polygon[], int n, Point p)
    {
        if (n < 3)
        {
            return false;
        }
        Point extreme = new Point(INF, p.y);
        int count = 0, i = 0;
        do
        {
            int next = (i + 1) % n;
            if (doIntersect(polygon[i], polygon[next], p, extreme))
            {
                if (orientation(polygon[i], p, polygon[next]) == 0)
                {
                    return onSegment(polygon[i], p,
                            polygon[next]);
                }

                count++;
            }
            i = next;
        } while (i != 0);
        return (count % 2 == 1);
    }

    public static int solve(int N, int[] X, int[] Y) {

        ArrayList<Point> points = new ArrayList<>();
        int startX = Integer.MAX_VALUE, startY =Integer.MAX_VALUE, endX =Integer.MIN_VALUE, endY = Integer.MIN_VALUE;
        for (int i=0; i< N; i++) {
            points.add(new Point(X[i], Y[i]));
            startX=Math.min(startX, X[i]);
            endX=Math.max(endX, X[i]);
            startY=Math.min(startY, Y[i]);
            endY=Math.max(endY, Y[i]);
        }
        int count =0;
        Point[] arr = new Point[points.size()];
        arr = points.toArray(arr);
        for(int i=startX;i<=endX;i++) {
            for (int j=startY; j<=endY;j++) {
                if(isInside(arr, N, new Point(i, j))) {
                    count++;
                }
            }
        }
        return (count-N)*25;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] x = {2, 4, 3, 1};

        int[] y= {1, 3, 5, 4};

        System.out.print(solve(n, x, y));
    }
}
