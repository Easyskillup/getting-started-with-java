package demo.generics;

public class GenericsDemo {
    public static void main(String[] args) {
//        genericBox();
        printArray(new String[]{"Hello", "Welcome", "Hi"});
        printArray(new Integer[]{1, 2, 3, 4, 5});

        NumberBox<Long> longBox = new NumberBox<>();
        NumberBox<Integer> intBox = new NumberBox<>();
        // NumberBox<String> strBox = new NumberBox<>(); // Not allowed, since T must extend Number
    }

    /**
     * <T> in a method means this is a generic method. It means that this method can work with any type
     * of data in a type safe manner.
     */
    static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void genericBox() {
        GenericBox<String> strBox = new GenericBox<>();
        GenericBox<Long> longBox = new GenericBox<>();

        strBox.setData("Helo world");
        longBox.setData(10l);

        System.out.println(strBox.getData());
        System.out.println(longBox.getData());
    }

    static void nonGenericBox() {
        Box b1 = new Box();
        Box b2 = new Box();
        Long x = 1l;

        b1.setData(x);
        b2.setData("Welcome");

        if (b1.getData() instanceof Long l) {
            // Long l = (Long) b1.getData(); // not required in latest Java
            System.out.println(l);
        }
        if (b2.getData() instanceof String s) {
            // String s = (String) b1.getData();
            System.out.println(s);
        }
    }
}

/**
 * Bounded type parameter. This type can be any class which is a sub class of Number
 * @param <T> Generic type
 */
class NumberBox<T extends Number> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

// Generic Box
class GenericBox<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

// Box is a Data Transfer Object
class Box {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}