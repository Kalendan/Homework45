import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {


Parcel parcel1 = new Parcel("Moscow","Berlin",34, LocalDateTime.of(2024,2,1,10,0));
Parcel parcel2= new Parcel("Frankfurt","London",40, LocalDateTime.of(2024,3,4,12,0));
Parcel parcel3 = new Parcel("Kanada","Berlin",50, LocalDateTime.of(2024,5,8,15,0));
List<Parcel> parcels = new ArrayList<>();
parcels.add(parcel1);
        parcels.add(parcel2);
        parcels.add(parcel3);
    Parcel newParcelToBerlin =    parcels.stream()
                .max(Comparator.comparing(Parcel::getParselCreationDateTime))
                .orElseThrow(() -> new RuntimeException("Parcels do not exist"));
        System.out.println("The newest parcel to Berlin:" + newParcelToBerlin);




    }
}
