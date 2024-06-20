package Generics;
public class MyClass<T extends Comparable<?>>{
    private T value;

    public MyClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof MyClass)) {
            throw new IllegalArgumentException("Invalid comparison");
        }
        MyClass<?> other = (MyClass<?>) o;
        // Use the compareTo method of the underlying type
        return this.value.compareTo(other.getValue());
    }

    public static void main(String[] args) {
        MyClass<Integer> obj1 = new MyClass<>(5);
        MyClass<Integer> obj2 = new MyClass<>(10);

        // compareTo usage
        int result = obj1.compareTo(obj2);

        if (result < 0) {
            System.out.println(obj1.getValue() + " is less than " + obj2.getValue());
        } else if (result > 0) {
            System.out.println(obj1.getValue() + " is greater than " + obj2.getValue());
        } else {
            System.out.println(obj1.getValue() + " is equal to " + obj2.getValue());
        }
    }
}
