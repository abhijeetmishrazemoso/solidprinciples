package equipment;

public class DRDOVaccine extends Vaccine{

    public DRDOVaccine(float quantity) {
        super("NONFeverDRDOVaccine", quantity, "chemicalFormula",
                true, false,false);
    }

    @Override
    public float inject() {
        setEmpty();
        return 20f;
    }
}
