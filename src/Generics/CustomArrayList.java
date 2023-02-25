package Generics;

import java.util.Arrays;

public class CustomArrayList <T> {
    private Object[] data;
    private int size;
    final private static int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public int size(){ return this.size;}

    public void add(T value){
        if(this.isFull()){
            this.resize();
        }
        this.data[size++] = value;
    }

    public void set(int i,T value){
        data[i] = (T) value;
    }

    public T get(int index){
        return (T) this.data[index];
    }

    public T remove(){
        T removed = (T) this.data[size];
        size --;
        return removed;
    }

    public void resize() {
        Object[] temp = new Object[data.length*2];
        for(int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return this.size == data.length - 1;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
        CustomArrayList<Integer> intCArr = new CustomArrayList<>();
        intCArr.add(1);
        intCArr.add(2);
        intCArr.add(3);
        intCArr.add(4);
//        intCArr.add("Can not be added as it is Integer defined using generics");
        System.out.println(intCArr.size());
        System.out.println(intCArr);

        CustomArrayList<String> strCArr = new CustomArrayList<>();
        strCArr.add("0");
        strCArr.add("2");
        strCArr.add("4");
        strCArr.add("6");
//        intCArr.add(5);   Can not be added as it is String defined using generics
        System.out.println(strCArr.size());
        System.out.println(strCArr);
    }
}
