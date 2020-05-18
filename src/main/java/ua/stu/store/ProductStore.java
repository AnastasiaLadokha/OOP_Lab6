package ua.stu.store;

import ua.stu.model.IWeight;
import ua.stu.test.TestStoreObject;

import java.util.Arrays;

public class ProductStore extends TestStoreObject {
    private IWeight[] arr = new IWeight[3];
    private int count = 0;

    public IWeight[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public void add(IWeight newProduct) {
        if (arr.length == count)
            arr = Arrays.copyOf(arr, count + count / 2);
        arr[count++] = newProduct;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Перелік брусів:\n");
        for (int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb.toString();
    }
}
