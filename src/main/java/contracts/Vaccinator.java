package contracts;

import equipment.Vaccine;
import high.*;
//violating open/Closed Principle. extensions cannot modify this code.
public interface Vaccinator extends Available {
    boolean vaccinate(Vaccine vaccine, Patient patient);
    //
}
