package high;

import java.util.Objects;

public class Patient {
    private String name;
    private String aadhar;
    private boolean isVaccinated=false;
    private boolean isInfected=false;
    private boolean hasFever=false;

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public boolean isInfected() {
        return isInfected;
    }

    public Patient(String name, String aadhar, boolean isInfected) {
        this.name = name;
        this.aadhar = aadhar;
        this.isInfected = isInfected;
    }

    public void recieveVaccine(float amount){
        isVaccinated = true;
    }

    public void setHasFever(boolean hasFever) {
        this.hasFever = hasFever;
    }

    public boolean isHasFever() {
        return hasFever;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return aadhar.equals(patient.aadhar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aadhar);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", aadhar='" + aadhar + '\'' +
                ", isVaccinated=" + isVaccinated +
                ", isInfected=" + isInfected +
                '}';
    }
}
