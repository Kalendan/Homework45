import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        Meeting meeting1 = new Meeting("Nadja", "Vera", LocalDateTime.of(2024, 6, 12, 15, 30));
        Meeting meeting2 = new Meeting("Vera", "Andrej", LocalDateTime.of(2024, 12, 3, 15, 0));
        List<Meeting> meetings = new ArrayList<>();



    public static LocalTime calc(List<Meeting>){
        meetings.stream()
                .reduce();
    }
}
