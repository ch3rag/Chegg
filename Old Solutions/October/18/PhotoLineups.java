import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

    public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        if (nameList.isEmpty()) {
            for (int i = 0; i < permList.size(); i++) {
                System.out.print(permList.get(i));
				
				if (i < permList.size() - 1) System.out.print(", ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < nameList.size(); ++i) {
                ArrayList<String> newPerm = new ArrayList<String>(permList);
                newPerm.add(nameList.get(i));
                ArrayList<String> newNameList = new ArrayList<String>(nameList);
                newNameList.remove(i);
                allPermutations(newPerm, newNameList);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> permList = new ArrayList<String>();
        String name;
        while (true) {
            name = scnr.next();
            if (name.equals("-1")) break;
            nameList.add(name);
        }
        allPermutations(permList, nameList);
    }
}