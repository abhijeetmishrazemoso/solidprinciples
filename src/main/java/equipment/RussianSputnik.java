package equipment;

public class RussianSputnik extends Vaccine {
    @Override
    public float inject() {
        setEmpty();
        return 10f;
    }

    public RussianSputnik(float quantity) {
        super("RUSSIAN_SPUTNIK",quantity, "chemicalFormula",
                true,true,true);

    }


}
