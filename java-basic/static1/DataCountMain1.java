package static1;

import memory.Data;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.name);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.name);

        Data1 data3 = new Data1("A");
        System.out.println("C count=" + data3.name);
    }
}
