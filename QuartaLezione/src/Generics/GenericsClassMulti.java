package Generics;

public class GenericsClassMulti<T, N> {
    private T value;
    private N ele;

    public GenericsClassMulti(T value, N ele) {
        this.value = value;
        this.ele = ele;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public N getEle() {
        return ele;
    }

    public void setEle(N ele) {
        this.ele = ele;
    }
}
