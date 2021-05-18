package equipment;

import exceptions.InsufficientQuantityException;

public class WhoVaccine extends Vaccine{

    public WhoVaccine(float quantity) {

        super("WhoVaccine", quantity, "WhochemicalFormula",
                true, false,true);

    }

//    @Override
//    public float inject() throws InsufficientQuantityException {
//        if (Double.compare(getQuantity(), 10) < 0) {
//            throw new InsufficientQuantityException("Dosage not sufficient");
//        }
//
//    }

    @Override
    public float inject() {
        return 10f;
    }
}
