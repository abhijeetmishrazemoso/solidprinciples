package actors;


import contracts.Vaccinator;

public abstract class Doctor implements Vaccinator {
    private String fullName;
    private boolean available;

    public String getFullName() {
        return fullName;
    }

    public Doctor(String fullName) {
        this.fullName = fullName;
        available = true;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
