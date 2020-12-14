import java.text.SimpleDateFormat;
import java.util.Date;

public class stop_watch {
    public static void main(String[] args) {
        long sum = 0;
        long timeStart = System.currentTimeMillis();
        ShowTime start = new ShowTime(timeStart);

        System.out.println(start.displayTime());

        for(long i = 0; i < 10; i++){
            sum += i;
        }
        long timeStop = System.currentTimeMillis();
        ShowTime stop = new ShowTime(timeStop);
        System.out.println(stop.displayTime());
        System.out.println(timeStop - timeStart);
    }
}
