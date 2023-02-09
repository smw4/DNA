//The program takes a string called "sequence" and scans it for various criteria to determine whether or not it is in fact a valid protein.

public class DNA {

  String dna1 = "ATGCGATACGCTTGA";
  // String dna2 = "ATGCGATACGTGA";
  // String dna3 = "ATTAATATGTACTGA";

  // input sequence here
  String sequence = dna1;

  // checkSequence
  public boolean checkSequence(String sequence) {

    String first = sequence.substring(0, 3);
    String last = sequence.substring(sequence.length() - 3);

    // Conditions:
    // It begins with a “start codon”: ATG.
    // It ends with a “stop codon”: TGA.
    // Must be divisible by three
    if (first.equalsIgnoreCase("ATG") && last.equalsIgnoreCase("TGA") && sequence.length() % 3 == 0) {
      // if (/*characters are either a,t,c, or g
      for (int i = 0; i < sequence.length(); i++) {
        char c = sequence.charAt(i);
        if (c != 'A' && c != 'a' && c != 'G' && c != 'g' && c != 'C' && c != 'c' && c != 'T' && c != 't') {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  // MAIN
  public static void main(String[] args) {

    DNA test = new DNA();
    // checkSequence() on "sequence"
    System.out.println(test.checkSequence(test.sequence));

    // contains substring (ATG)
    // contains substring (TGA)
    // sequence is divisible by three
    // if (sequence.length() % 3 == 0) {
    // System.out.println("sequence divisible by three");
    // }

  }
}
