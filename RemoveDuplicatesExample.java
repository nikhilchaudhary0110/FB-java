import java.util.ArrayList;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List: " + numbers);
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueList.size(); j++) {
                if (current == uniqueList.get(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(current);
            }
        }

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}

