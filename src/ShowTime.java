import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowTime {
    long time;

    public ShowTime(long _time){
        this.time = _time;
    }
    public String displayTime(){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Date result = new Date(this.time);
        return f.format(result);
    }
}
