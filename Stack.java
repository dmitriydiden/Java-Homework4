// Задача №1. Взять за основу реализацию стека, написанную в конце семенара.
//  Добавить проверку граничных условий и выводить сообщения об ошибках, 
//  если мы пытаемся извлечь элемент из пустого стека, добавить элемент 
//  в полностью заполненный стек и тд


public class Stack<T> {
    private T[] array;
    private int index;
    
    public Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }
    
    public int size() {
        return this.array.length;
    }
    public void empty() {
        if (this.array[0] == null) {
            System.out.println("Stack - пуст!!!");
        } else {
            System.out.printf("В Stack - имеются элементы!!!");
        }
    }

    public void push(T value) {
        if (index < this.size()) {
            this.array[index] = value;
            index+=1;
        } else {
            System.out.println("Stack переполнен");
        }

    }
    public T peek() {
        return this.array[index - 1];
    }
    public void pop(){
        
        if (index>0){
            index-=1;
            System.out.println(this.array[index]);
        } else {
            System.out.println("Stack пуст");
        }
        
    }
    public void print() {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.printf("Элемент [ %d ] - %s\n", i, this.array[i]);
        }
    }

    
    public static void main(String[] args) {
    Stack<String> stack = new Stack<>(5);
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        stack.push("String 4");        
        stack.push("String 5");
        stack.push("String 6");
        stack.pop();
        stack.pop();
        stack.pop();

        stack.print();
        System.out.printf("Длина Stack = %d\n", stack.size());
        stack.empty();
        
        
       
    }
    }