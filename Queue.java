// Задача №2. Написать реализацию очереди на основе массива; 
//Реализовать методы size(), empty(), offer(), poll(), peek()

public class Queue<T> {
    private T[] array;
    private int index;
    
    public Queue(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }
    
    public int size() {
        return this.array.length;
    }
    public void empty() {
        if (this.array[0] == null) {
            System.out.println("Очередь - пуста!!!");
        } else {
            System.out.printf("В Очереди, имеются элементы!!!");
        }
    }

    public void offer(T value) {
        if (index < this.size()) {
            this.array[index] = value;
            index+=1;
        } else {
            System.out.println("Очередь переполнена");
        }

    }
    public T peek() {
        return this.array[0];
    }
    public void poll(){
        
        if (this.index>0){
            System.out.println(this.array[0]);
            for (int i = 0; i < array.length-1; i++) {
                this.array[i] = this.array[i+1];
            }
            this.array[array.length-1] = null;
            index-=1;
            
        } else {
            System.out.println("Очередь пуста");
        }
        
    }
    public void print() {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.printf("Элемент [ %d ] - %s\n", i, this.array[i]);
        }
    }
   
    public static void main(String[] args) {
    Queue<String> queue = new Queue<>(5);
        queue.offer("String 1");
        queue.offer("String 2");
        queue.offer("String 3");
        queue.offer("String 4");        
        queue.offer("String 5");
        queue.offer("String 6");
        queue.poll();
        queue.poll();
        queue.poll();
        queue.print();
        System.out.println();
        queue.offer("String 7");
        queue.print();
        System.out.println();       
        queue.poll();
        // queue.poll();
        // queue.poll();
        queue.print();
        System.out.printf("Длина Очереди = %d\n", queue.size());
        queue.empty();
    }
    }

