import java.time.LocalDateTime;
import java.util.Objects;

public class Meeting {
    private String name1;
    private String name2;

    private LocalDateTime meetingTime;

    public Meeting(String name1, String name2, LocalDateTime meetingTime) {
        this.name1 = name1;
        this.name2 = name2;
        this.meetingTime = meetingTime;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public LocalDateTime getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(LocalDateTime meetingTime) {
        this.meetingTime = meetingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return Objects.equals(name1, meeting.name1) && Objects.equals(name2, meeting.name2) && Objects.equals(meetingTime, meeting.meetingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name1, name2, meetingTime);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", meetingTime=" + meetingTime +
                '}';
    }
}








//3. Создать класс Meeting (встреча), в класс добавьте поля: кто встречается, с кем встречается и дату-время встречи
//Создайте несколько встреч
//Найдите среднее время всех встреч.
//Например, две встречи - одна встреча начинается 14-00, другая встреча начинается 16-00. Тогда среднее время начала встречи - 15-00