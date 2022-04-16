package Exam2021.Q2;

public class River extends StillWater {

    private String riverName;
    private StillWater waterBody;

    /* CONSTRUCTORS*/
    public River(String riverName, StillWater waterBody) {
        this.riverName = riverName;
        this.waterBody = waterBody;
    }

    /* GETTERS */
    @Override
    public boolean hasFreshWater() {
        return true;
    }
    @Override
    public String toString() {
        return this.riverName + ", which flows into " + waterBody.toString();
    }
}
