package actors;

import equipment.Vaccine;
import high.Patient;

public class ENTDoctor extends Doctor {
    private boolean available=true;
    public ENTDoctor(String fullName) {
        super(fullName);
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "ENTDoctor{" +
                "fullName=" + getFullName() +
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
