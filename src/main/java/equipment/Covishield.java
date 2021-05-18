package equipment;
public class Covishield extends Vaccine {
    @Override
    public float inject() {
        setEmpty();
        return 10f;
    }

    public Covishield(float quantity) {
        super("COVISHIELD",quantity,
                "chemicalFormula",true,false,true);
    }
}