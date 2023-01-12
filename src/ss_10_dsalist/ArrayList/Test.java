package ss_10_dsalist.ArrayList;

import java.util.Arrays;

public class Test {
    public static  void main(String[] args) {
        MyList<String> listInteger = new MyList<String>(10);
        listInteger.add(0,"lanh");
        listInteger.add(1,"chinh");
        listInteger.add(2,"minh");
        listInteger.add(3,"hai");
        listInteger.add(4,"anh");
        System.out.println(Arrays.toString(listInteger.getElements()));
        listInteger.remove(1);
        System.out.println(Arrays.toString(listInteger.getElements()));
    }
}
