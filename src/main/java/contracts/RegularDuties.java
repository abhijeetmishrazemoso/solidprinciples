package contracts;

import high.Medicine;
import high.Patient;

public interface RegularDuties {
    public void administerMedicine(Medicine medicine, Patient patient);
    public String checkTemperature();
    public String checkHeartBeat();
}
