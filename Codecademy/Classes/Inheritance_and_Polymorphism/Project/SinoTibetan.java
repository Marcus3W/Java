package Classes.Inheritance_and_Polymorphism.Project;

public class SinoTibetan extends Language {

    public SinoTibetan(String name, int numSpeakers) {
        super(name, numSpeakers, "Asia", "subject-object-verb");

        if (name.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }

    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
    }



}
