package high;

import equipment.Vaccine;
import actors.ENTDoctor;
import actors.Nurse;
import contracts.Vaccinator;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    static List<Patient> patients = new ArrayList<>(10);
    static List<Vaccine> vaccines = new ArrayList<>(10);
    static List<Vaccinator> vaccinators = new ArrayList<>(20);

    public static void main(String[] args) {
        addSomeVaccinators(vaccinators);
        addSomeVaccines(vaccines);
        addSomePatients(patients);
        System.out.println("Before Vaccination!");
        patients.stream().forEach(item-> System.out.println(item));
        for (Vaccine v :vaccines) {
            Vaccinator vaccinator = getAvailableVaccinator(vaccinators);
            Patient infectedPatient = getInfectedPatient(patients);
            if(v.isUsedAfterInfection() && infectedPatient!=null && !infectedPatient.isVaccinated()){
                vaccinator.vaccinate(v, infectedPatient);
                continue;
            }
            Patient nonInfectedPatient = getNonInfectedPatient(patients);
            if (v.isUsedBeforeInfection() && nonInfectedPatient!=null && !nonInfectedPatient.isVaccinated()) {
                vaccinator.vaccinate(v, nonInfectedPatient);
            }
        }
        System.out.println("Finally after all vaccinations");
        patients.stream().forEach(item-> System.out.println(item));
    }
    private static Patient getInfectedPatient(List<Patient> patients){
        for (Patient p:patients) {
            if(!p.isVaccinated() && p.isInfected())return p;
        }
        return null;
    }

    private static Patient getNonInfectedPatient(List<Patient> patients){
        for (Patient p:patients) {
            if(!p.isVaccinated() && !p.isInfected())return p;
        }
        return null;
    }
    private static Vaccinator getAvailableVaccinator(List<Vaccinator> vaccinators){
        for (Vaccinator v:vaccinators) {
            if(v.isAvailable()){
                return v;
            }
        }
        return null;
    }
    private static void addSomePatients(List<Patient> patients) {
        patients.add(new Patient(getRandomName(10), "aadhar", true));
        patients.add(new Patient(getRandomName(10), "aadhar1", false));
        patients.add(new Patient(getRandomName(10), "aadhar2", true));
        patients.add(new Patient(getRandomName(10), "aadhar3", false));
        patients.add(new Patient(getRandomName(10), "aadhar4", false));
        patients.add(new Patient(getRandomName(10), "aadhar5", true));
    }

    private static void addSomeVaccinators(List<Vaccinator> vaccinators) {
        vaccinators.add(new Nurse(getRandomName(8)));
        vaccinators.add(new Nurse(getRandomName(8)));
        vaccinators.add(new Nurse(getRandomName(8)));
        vaccinators.add(new Nurse(getRandomName(8)));
        vaccinators.add(new ENTDoctor(getRandomName(10)));
        vaccinators.add(new ENTDoctor(getRandomName(11)));
        vaccinators.add(new ENTDoctor(getRandomName(13)));
    }

    private static void addSomeVaccines(List<Vaccine> vaccines) {
        vaccines.addAll(VaccineFactory.getVaccines(VaccineType.RUSSIANSPUTNIK, 5));
        vaccines.addAll(VaccineFactory.getVaccines(VaccineType.COVISHIELD, 5));
        vaccines.addAll(VaccineFactory.getVaccines(VaccineType.WHOVACCINE, 5));

    }

    public static String getRandomName(int size) {
        String rand = "abcdefghijklmnopqrstuvwzyz";
        StringBuilder str = new StringBuilder();
        char[] chars = rand.toCharArray();
        for (int i = 0; i < size; i++) {
            int val = (int) (Math.random() * 100) % (rand.length());
            str.append(chars[val]);
        }
        return str.toString();
    }
}
