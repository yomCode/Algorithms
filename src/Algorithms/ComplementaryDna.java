package Algorithms;

public class ComplementaryDna {
    public static void main(String[] args) {
        //Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and
        // carries the "instructions" for the development and functioning of living organisms.

        //In DNA strings, symbols "A" and "T" are complements of each other,
        // as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); y
        // ou need to return the other complementary side. DNA strand is never empty or there is no DNA at
        // all (again, except for Haskell).

        //INPUTS----> "TTTT" || "TAACG" || "CATA"

        String dna = "TAACG";

        String[] dnaArr = dna.split("");
        String compDna = "";

        for(int i = 0; i< dnaArr.length; i++){
            if(dnaArr[i].equals("A")){
                compDna += "T";
            }else if(dnaArr[i].equals("T")){
                compDna += "A";
            }else if(dnaArr[i].equals("C")){
                compDna += "G";
            }else{
                compDna += "C";
            }
        }

        System.out.println(compDna);
    }
}
