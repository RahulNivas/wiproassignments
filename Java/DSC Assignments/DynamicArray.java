import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.size = 0;
        this.capacity = initialCapacity;
    }

    public void add(int element) {
        if (size == capacity) {
            expandCapacity();
        }
        array[size] = element;
        size++;
    }

    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }

        if (size == capacity) {
            expandCapacity();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }

       
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    public void update(int index, int newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }

        array[index] = newValue;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }

        return array[index];
    }

    public int size() {
        return size;
    }

    private void expandCapacity() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public void print() {
        System.out.print("DynamicArray: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.print(); 

        dynamicArray.insert(1, 15);
        dynamicArray.print(); 

        dynamicArray.removeAt(2);
        dynamicArray.print();  

        dynamicArray.update(0, 5);
        dynamicArray.print();  
        System.out.println("Element at index 1: " + dynamicArray.get(1));  
    }
}