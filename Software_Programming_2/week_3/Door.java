package Labs.week3;

public class Door {

    private String name;
    private String state;

    /**
     * Constructor
     * @param name sets the objects name
     * @param state sets the objects state. (Open or Closed)
     */
    public Door(String name, String state) {
        this.name = name;
        this.state = state;
    }

    /**
     * Sets the state of the door to open - checks if door is already open
     * @return update door state to open
     */
    public void open() {

    }

    /**
     * Sets the state of the door to closed - checks if door is already closed
     */
    public void close() {

    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }
}
