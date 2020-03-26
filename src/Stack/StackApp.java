package Stack;

public class StackApp {
    public static void main(String[] args) {

        Integer[] test = new Integer[8];

        Stack<Integer> intStack = new Stack<Integer>(test);

        intStack.push(5);
        intStack.push(7);
        intStack.push(1);
        intStack.push(58);

        System.out.println(intStack.pop() + " ist der oberste Wert");
        intStack.push(98);
        System.out.println(intStack.pop() + " ist der oberste Wert");
        System.out.println(intStack.pop() + " ist der oberste Wert");

        String[] arrayString = new String[5];
        Stack<String> stringStack = new Stack<String>(arrayString);
        stringStack.push("Hallo");
        stringStack.push("Welt");
        stringStack.push("Funktioniert");

        System.out.println(stringStack.pop() + " --> das ist das oberste Wort");
        System.out.println(stringStack.pop() + " --> das ist das oberste Wort");
        System.out.println(stringStack.pop() + " --> das ist das oberste Wort");

    }
}
