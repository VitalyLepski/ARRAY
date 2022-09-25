import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{54, 12, 8, 32, 9, 1, 56, 32, 8, 53, 0, 14, 43, 89, 36, 44, 73, 67, 18};

        LepskVA mas = new LepskVA(25);
        Stack stack = new Stack(25);

        for (int i = 0; i < array.length; i++) {
            mas.add(array[i]);
            stack.push(array[i]);
        }

        int action, variable, stackOrMas;
        System.out.println("Select a structure:\n1) Array\n2) Stack");
        stackOrMas = Integer.parseInt(scanner.nextLine());

        if (stackOrMas == 2) {
            System.out.println("Select an action:\n1) Add element\n2) Delete element\n3) Output elements\n4) Exit\n");
            while (true) {
                System.out.println("\nNext action: ");
                action = Integer.parseInt(scanner.nextLine());
                if (action == 1) {
                    System.out.println("Enter the element: ");
                    variable = Integer.parseInt(scanner.nextLine());
                    stack.push(variable);
                }
                if (action == 2) {
                    stack.pop();
                }
                if (action == 3) {
                    stack.outputStack();
                }
                if (action == 4) {
                    break;
                }
            }
        }

        if (stackOrMas == 1) {
            System.out.println("Select an action:\n1) Add element\n2) Find element\n3) Delete element\n4) Output elements\n5) Exit");
            while (true) {
                System.out.println("\nNext action: ");
                action = Integer.parseInt(scanner.nextLine());
                if (action == 1) {
                    System.out.println("Enter the element: ");
                    variable = Integer.parseInt(scanner.nextLine());
                    mas.add(variable);
                }
                if (action == 2) {
                    System.out.println("Enter the index: ");
                    variable = Integer.parseInt(scanner.nextLine());
                    mas.find(variable);
                }
                if (action == 3) {
                    System.out.println("Enter the index: ");
                    variable = Integer.parseInt(scanner.nextLine());
                    mas.delete(variable);
                }
                if (action == 4) {
                    mas.output();
                }
                if (action == 5) {
                    break;
                }
            }
        }
    }
}