import java.time.LocalDate;
import java.util.Objects;

class ProgrammingLanguage extends RuntimeException {
    private String name;
    private String company;
    private LocalDate firstReleaseDate;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public LocalDate getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFirstReleaseDate(LocalDate firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return Objects.equals(name, that.name) && Objects.equals(company, that.company) && Objects.equals(firstReleaseDate, that.firstReleaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, firstReleaseDate);
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", firstReleaseDate=" + firstReleaseDate +
                '}';
    }

    public ProgrammingLanguage(String name, String company, LocalDate firstReleaseDate) {
        this.name = name;
        this.company = company;
        this.firstReleaseDate = firstReleaseDate;
    }
}


//1. Создать класс "Язык программирования"
//Добавьте поля: название языка, автор языка (или компания), дата первой версии языка
//Создайте несколько языков программирования
//Найдите среди них самых старый используя любой подход (стримы привествуются) comparable



