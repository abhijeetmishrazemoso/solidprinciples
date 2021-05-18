package actors;

import contracts.RegularDuties;
import contracts.Vaccinator;
import equipment.Vaccine;
import high.Medicine;
import high.Patient;

public class Nurse implements Vaccinator, RegularDuties {
    private String fullName;
    private boolean isAvailable=true;
    public Nurse(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void administerMedicine(Medicine medicine, Patient patient) {
        //functionalities
    }

    @Override
    public String checkTemperature() {
        return null;
    }

    @Override
    public String checkHeartBeat() {
        return null;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "fullName='" + fullName + '\'' +
                '}';
    }

    @Override
    public boolean vaccinate(Vaccine vaccine, Patient patient) {
        if (!vaccine.isUseOnFever() && patient.isHasFever())
            return false;
        if (patient == null || vaccine == null) throw new IllegalArgumentException("Patient or vaccine null!");
        if (patient.isInfected() && vaccine.isUsedAfterInfection()) {
            patient.recieveVaccine(vaccine.inject());
            return true;
        } else if (patient.isInfected() && !vaccine.isUsedAfterInfection()) {
            return false;
        } else if (!patient.isInfected() && vaccine.isUsedBeforeInfection()) {
            patient.recieveVaccine(vaccine.inject());
            return true;
        } else {
            return false;
        }

    }
}
