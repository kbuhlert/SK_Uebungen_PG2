package Stack;

public class Stack<T> {

    private T[] elements;
    private int counter;

    public Stack(T[] array) {
        this.elements = array;
        counter = -1;
    }

    public void push(T value){      //value = das Zeug, was ich in den Array stapeln möchte
        if(counter<elements.length){
        counter++;
        elements[counter] = value;}

    }

    public T pop(){
        if(counter>=0){
        T value = elements[counter];
        counter--;
        return value;}
        else
            System.out.println("Array ist leer. Es kann kein Element entfernt");
            return null;
    }
}
