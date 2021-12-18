package Classes.StringMethods;

/**
 * Determines whether there is a protein in a strand of DNA.
 *
 * A protein has the following qualities:
 *
 * - It begins with a “start codon”: ATG.
 * - It ends with a “stop codon”: TGA.
 * - In between, each additional codon is a sequence of three nucleotides.
 *
 * Examples:
 * ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA,
 * and the length is divisible by 3.
 *
 * ATGCGATAGA is not a protein because the sequence length is not divisible by 3,
 * so the third condition is not satisfied.
 *
 * For Reference:
 * length()         returns the length
 * concat()	        concatenates two strings
 * equals()	        checks for equality between two strings
 * indexOf()	    returns the index of a substring
 * charAt()	        returns a character
 * substring()	    returns a substring
 * toUpperCase()    returns the upper case version
 * toLowerCase()    returns the lower case version
 */
public class DNA {

    public static void main(String[] args) {
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        DNA(dna1);
        String dna2 = "ATGCGATACGTGA";
        DNA(dna2);
        String dna3 = "ATTAATATGTACTGA";
        DNA(dna3);

    }

    public static void DNA(String dna) {

        System.out.println("Length: " + dna.length());

        int startCodonIndex = dna.indexOf("ATG");
        System.out.println("Start: " + startCodonIndex);
        int stopCodonIndex = dna.indexOf("TGA");
        System.out.println("Stop: " + stopCodonIndex);

        if ((startCodonIndex != -1 && stopCodonIndex != -1) && (startCodonIndex - stopCodonIndex) % 3 == 0) {
            System.out.println("Condition 1 and 2 and 3 are satisfied.");

            String protein = dna.substring(startCodonIndex,stopCodonIndex+3);
            System.out.println("Protein: " + protein);
        }
        else {
            System.out.println("No Protein");
        }
    }





}
