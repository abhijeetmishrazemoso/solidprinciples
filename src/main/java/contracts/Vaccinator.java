package contracts;

import equipment.Vaccine;
import high.*;
//violating open/Closed Principle. extensions cannot modify this code.
public interface Vaccinator extends Available {
    boolean isVaccinationSuccessful(Vaccine vaccine, Patient patient);
    //
}
