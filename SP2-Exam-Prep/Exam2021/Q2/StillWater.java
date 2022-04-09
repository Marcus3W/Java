package Exam2021.Q2;

public class StillWater {

    private String name;
    private boolean freshWater;

    /* CONSTRUCTORS*/
    public StillWater(String name, boolean freshWater) {
        this.name = name;
        this.freshWater = freshWater;
    }
    public StillWater(boolean freshWater) {
        this.freshWater = freshWater;
    }
    public StillWater() {
    }

    /* GETTERS */
    public String getName() {
        return name;
    }
    public boolean hasFreshWater(){
        return this.freshWater;
    }
    @Override
    public String toString() {

        if (freshWater) {
            return this.name + ", with fresh water";
        }
        else {
            return this.name + ", with non-fresh water";
        }
    }
}
