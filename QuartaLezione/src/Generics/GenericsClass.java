package Generics;

public class GenericsClass<T> {
    private T value;

    public GenericsClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
