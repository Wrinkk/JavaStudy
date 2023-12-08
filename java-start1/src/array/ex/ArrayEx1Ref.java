package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = new int[] {90,80,70,60,50};
        int total = 0;


        for (int student : students) {
            System.out.println(student);

            total += student;
        }
        double average = (double) total / 5;
        System.out.println("점수의 총합 " + total);
        System.out.println("평균 값 " + average);
    }
}
