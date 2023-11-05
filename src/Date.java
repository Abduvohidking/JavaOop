import java.time.LocalDate;

public class Date {
    LocalDate date =LocalDate.now() ;

    void setDate(){
        String year = String.valueOf(date.getYear());
        String month = String.valueOf(date.getMonthValue());
        String day = String.valueOf(date.getDayOfMonth());
        System.out.println(day+"."+month+"."+year);
    }
}
