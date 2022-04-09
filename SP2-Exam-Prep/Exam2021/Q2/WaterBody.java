package Exam2021.Q2;

public class WaterBody extends River {

    private String name;

    /* CONSTRUCTORS*/

    public WaterBody(String riverName, StillWater waterBody, String name) {
        super(riverName, waterBody);
        this.name = name;
    }

    /* GETTERS */
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return super.toString() + ", which flows into " + this.getName();
    }
}
