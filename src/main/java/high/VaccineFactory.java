package high;

import equipment.Covishield;
import equipment.RussianSputnik;
import equipment.Vaccine;
import equipment.WhoVaccine;

import java.util.ArrayList;
import java.util.List;

public class VaccineFactory {

    public static Vaccine getVaccine(VaccineType type){
        if(type ==VaccineType.COVISHIELD){
            return new Covishield(10f);
        }if(type ==VaccineType.RUSSIANSPUTNIK){
            return new RussianSputnik(10f);
        }else if(type ==VaccineType.WHOVACCINE){
            return new WhoVaccine(10f);
        }
        return null;
    }

    public static List<Vaccine> getVaccines(VaccineType type,int count) {
        List<Vaccine> vaccines = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            vaccines.add(getVaccine(type));
        }
        return vaccines;
    }
}