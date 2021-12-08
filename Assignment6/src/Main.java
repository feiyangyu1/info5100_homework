import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();

        Student A = new Student(1, "Alex",3.9,
                new GregorianCalendar(1998,Calendar.MAY,15).getTime());
        Student B = new Student(2, "Claire",3.2,
                new GregorianCalendar(1997,Calendar.JANUARY,18).getTime());
        Student C = new Student(3, "Ben",4.0,
                new GregorianCalendar(1990,Calendar.DECEMBER,1).getTime());
        Student D = new Student(4, "Ella",2.8,
                new GregorianCalendar(2002,Calendar.FEBRUARY,9).getTime());
        Student E = new Student(5, "Devin",3.0,
                new GregorianCalendar(1998,Calendar.JANUARY,25).getTime());

        students.add(A);
        students.add(B);
        students.add(C);
        students.add(D);
        students.add(E);

        students.sort(new NameComparator());
        for(Student student: students)
            System.out.print(student.getName() + " ");

        System.out.println();

        students.sort(new GpaComparator());
        for(Student student: students)
            System.out.print(student.getGpa() + " ");

        System.out.println();

        students.sort(new DateOfBirthComparator());
        for(Student student: students)
            System.out.print(student.getDateOfBirth() + " ");

        System.out.println();

    }
}
