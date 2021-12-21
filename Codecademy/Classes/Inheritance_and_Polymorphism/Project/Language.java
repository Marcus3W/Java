package Classes.Inheritance_and_Polymorphism.Project;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(
        this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + "." +
                "\n" +"The language follows the word order: " + this.wordOrder + "."
        );
    }

    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000 , "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();

        Language mayan = new Mayan("Ki'che'", 2330000);
        mayan.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();

    }
}
