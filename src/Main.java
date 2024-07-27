import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ProgrammingLanguage p1 = new ProgrammingLanguage("C++", "Bjarne Stroustrup", LocalDate.of(1985, 10, 1));
        ProgrammingLanguage p2 = new ProgrammingLanguage("Java", "James Gosling", LocalDate.of(1995, 5, 23));
        ProgrammingLanguage p3 = new ProgrammingLanguage("Python", "Guido van Rossum", LocalDate.of(1991, 2, 20));

        List<ProgrammingLanguage> languages = new ArrayList<>();
        languages.add(p1);
        languages.add(p2);
        languages.add(p3);
        ProgrammingLanguage oldestLanguage = languages.stream()
                .min(Comparator.comparing(ProgrammingLanguage::getFirstReleaseDate))
                .orElseThrow(() -> new RuntimeException("No language exist"));
        System.out.println("the oldest language :" + oldestLanguage);

    }
}







