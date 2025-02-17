import java.util.HashSet;

public class DuplicateStrings {
    public static void main(String[] args) {
        String[]words={"apple", "banana", "cherry", "apple", "date", "banana", "fig", "grape"};
        System.out.println("Duplicate elements in the array:");
        findDuplicates(words);
    }
    public static void findDuplicates(String[] array){
        HashSet<String> seen = new HashSet<>();
        HashSet <String> duplicates = new HashSet<>();
        for(String word:array){
            if (!seen.add(word)){
                duplicates.add(word);
            }
        }
        if (duplicates.isEmpty()){
            System.out.println("No duplicates found. ");
        }else{
            for(String duplicate : duplicates){
                System.out.println(duplicate);
            }
        }
    }
}
