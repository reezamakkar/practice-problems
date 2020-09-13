package as;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

public class timeDiff {

    public static String[] solve (String[] p, String r) throws ParseException {

        String[] arr = new String[p.length];

        for (int i=0;  i < p.length; i++) {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Date date1 = format.parse(p[i]);
            Date date2 = format.parse(r);
            long diff = Math.abs(date2.getTime() - date1.getTime());
            long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
            long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
            long hours = TimeUnit.MILLISECONDS.toHours(diff);
            String diffSeconds = "" + seconds + " seconds ago";
            String diffMinutes = "" + minutes + " minutes ago";
            String diffHours = "" + hours + " hours ago";
            if (seconds == 0 ) {
                arr[i] = "now";
            }
            else if ( seconds < 60) {
                arr[i] = diffSeconds;
            }
            else if (seconds>=60 && minutes < 60 ) {
                arr[i] = diffMinutes;
            }
            else {
                arr[i] = diffHours;
            }

        }
        return arr;
    }

    public static void main(String[] args) throws ParseException {
        String[] o = solve(new String[]{"23:05:38", "23:05:02", "23:04:59", "23:04:31", "12:36:07", "08:59:01", "00:00:00"}, "23:05:38");
        for (int i=0; i <o.length; i++) {
            System.out.println(o[i]);
        }
    }

}


