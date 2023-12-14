package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // Student 객체 생성
        student1 = new Student(); // new Student()의 결과로 x001 참조값 반환
        student1.name = "학생1"; // x001.name = "학생" > x001 접근 > 2. name 접근 3. name 변수에 대입.
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade =80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student2.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
