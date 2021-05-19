package contracts;

import equipment.Vaccine;
import high.*;

public interface Vaccinator extends Available {
    boolean isVaccinationSuccessful(Vaccine vaccine, Patient patient);
}
