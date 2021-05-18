package equipment;

public abstract class Vaccine {
    private String name;
    private float quantity;
    private String chemicalFormula;
    private boolean usedBeforeInfection;
    private boolean usedAfterInfection,useOnFever;
    private boolean empty=false;

    public abstract float inject();

    public boolean isUseOnFever() {
        return useOnFever;
    }

    public float getQuantity() {
        return quantity;
    }

    protected void setEmpty(){
        empty=true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isUsedBeforeInfection() {
        return usedBeforeInfection;
    }

    public boolean isUsedAfterInfection() {
        return usedAfterInfection;
    }

    public String getName() {
        return name;
    }

    public Vaccine(String name,float quantity, String chemicalFormula,
                   boolean usedBeforeInfection,boolean usedAfterInfection,boolean useOnFever) {
        this.quantity = quantity;
        this.chemicalFormula = chemicalFormula;
        this.usedBeforeInfection = usedBeforeInfection;
        this.usedAfterInfection = usedAfterInfection;
        this.useOnFever = useOnFever;
    }
}
