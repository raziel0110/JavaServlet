import java.util.Calendar;
import java.util.Date;

public class BirthDay {

   public long getDays() {
       Calendar calendar = Calendar.getInstance();

       Date today = calendar.getTime();

       calendar.set(1985,Calendar.FEBRUARY,27);

       Date birtday = calendar.getTime();

       long date = today.getTime() - birtday.getTime();
       long time = 1000 * 60 *60*24;
       return date/time;
   }
}
