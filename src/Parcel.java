import java.time.LocalDateTime;
import java.util.Objects;

class Parcel extends RuntimeException{


    private String departureCity;
    private String destinationCity;
    private double weigth;
    private LocalDateTime parselCreationDateTime;

    public Parcel(String departureCity, String destinationCity, double weigth, LocalDateTime parselCreationDateTime) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.weigth = weigth;
        this.parselCreationDateTime = parselCreationDateTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public LocalDateTime getParselCreationDateTime() {
        return parselCreationDateTime;
    }

    public void setParselCreationDateTime(LocalDateTime parselCreationDateTime) {
        this.parselCreationDateTime = parselCreationDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return Double.compare(weigth, parcel.weigth) == 0 && Objects.equals(departureCity, parcel.departureCity) && Objects.equals(destinationCity, parcel.destinationCity) && Objects.equals(parselCreationDateTime, parcel.parselCreationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, destinationCity, weigth, parselCreationDateTime);
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "departureCity='" + departureCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", weigth=" + weigth +
                ", parselCreationDateTime=" + parselCreationDateTime +
                '}';
    }



    //2. Создайте класс "посылка". Добавьте поля: город отправления и город получения, вес посылки, дата-время создания посылки
// (посылки могут создаваться по всему миру,
//очень много часовых поясов, нам важна не конкретная дата, а лишь какая посылка была создана ранее, чем другая)
//Создать несколько посылок
//Найти самую новую посылку среди тех, кто отправляется в Берлин





}
