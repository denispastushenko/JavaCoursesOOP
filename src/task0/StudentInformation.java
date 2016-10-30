package task0;


import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StudentInformation {

    private static Students student = new Students(1, "Ivan", "Ivanov", "Sergeevich", "21.01.1997",
            "Kharkiv city prperemogy 12-student Hostel", "380", 69859899, "KML", 3, 34);
    private static Students student1 = new Students(2, "Den", "Balan", "Ivanovich", "21.10.1994",
            "Kharkiv city prperemogy 12-student Hostel", "380", 995686548, "KML", 2, 35);
    private static Students student2 = new Students(3, "Marta", "Mi", "Petrovna", "01.01.1995",
            "Kharkiv city prperemogy 12-student Hostel", "380", 989094058, "EGP", 3, 34);
    private static Students student3 = new Students(4, "Irina", "Ivanova", "Mihailovna", "11.11.1997",
            "Kharkiv city prperemogy 12-student Hostel", "380", 909585844, "KML", 1, 36);
    private static Students student4 = new Students(11, "Serhey", "Sidorov", "Valentinovich", "20.05.1994",
            "Kharkiv city prperemogy 12-student Hostel", "380", 999004564, "EGP", 3, 34);
    private static Students student5 = new Students(5, "Oleg", "Gurov", "Stepanovihc", "15.12.1996",
            "Kharkiv city prperemogy 12-student Hostel", "380", 689598685, "KML", 3, 34);
    private static Students student6 = new Students(6, "Galina", "Ivanova", "Vitalivna", "14.12.1997",
            "Kharkiv city pr/peremogy 12-student Hostel", "380", 965417812, "EGP", 3, 34);
    private static Students student7 = new Students(7, "Olexandr", "Puschin", "Sergeevich", "20.11.1994",
            "Kharkiv city prperemogy 12-student Hostel", "380", 963695986, "EGP", 2, 35);
    private static Students student8 = new Students(8, "Dmitriy", "Logko", "Anatoleevich", "17.05.1997",
            "Kharkiv city prperemogy 12-student Hostel", "380", 559565652, "EGP", 2, 35);
    private static Students student9 = new Students(9, "Ivanna", "Golovina", "Ivanovna", "20.01.1997",
            "Kharkiv city prperemogy 12-student Hostel", "380", 936965566, "KML", 1, 36);
    private static Students student10 = new Students(10, "Ivan", "Ivanov", "Petrovich", "21.01.1997",
            "Kharkiv city prperemogy 12-student Hostel", "380", 965456655, "KML", 1, 36);

    private static List<Students> studentInformations = new ArrayList<Students>() {{
        add(student);
        add(student1);
        add(student2);
        add(student3);
        add(student4);
        add(student5);
        add(student6);
        add(student7);
        add(student8);
        add(student9);
        add(student10);
    }};


    public static void main(String[] args) {

        System.out.println("Select the selection parameters for the list of students: \n" +
                "a) Choose students faculty; \n" +
                "\n" +
                "b) Students list for each faculty and course ;\n" +
                "\n" +
                "c) List of students born after a specified year;\n" +
                "\n" +
                "d) Study group list;");
        final String parametres = new Scanner(System.in).nextLine();
        if (Objects.equals(parametres, "a")) {
            System.out.println("Print faculty to chose students 'KML'/'EGP' : ");
            faculty();
        } else if (Objects.equals(parametres, "b")) {
            System.out.println("All information about student course and faculty :\n");
            facultyAndCourse();
        } else if (Objects.equals(parametres, "c")) {
            System.out.println("List of students born after a specified year print year : current students years of birth 1994-1997:\n");
            yearSpecified();
        } else if (Objects.equals(parametres, "d")) {
            System.out.println("Chose students group '34'/'35'/'36' : ");
            groupList();

        } else System.out.println("Choose correct parameters");
    }

    private static void faculty() {
        final String faculty = new Scanner(System.in).nextLine().toUpperCase();
        if (studentInformations.stream().filter(student -> Objects.equals(student.getFaculty(), faculty)).findFirst().isPresent()) {
            studentInformations.stream()
                    .filter(student -> Objects.equals(student.getFaculty(), faculty))
                    .forEach(student ->
                            System.out.println(String.format("%s %s %s", student.getLastName(), student.getName(),
                                    student.getFullName()))
                    );
        } else System.out.println("Chose faculty from list, faculty what have you printed does not exist");
    }

    private static void facultyAndCourse() {
        studentInformations.stream().forEach(students -> System.out.println(String.format("%s %s %s %s %d", students.getLastName(),
                students.getName(), students.getFullName(), students.getFaculty(), students.getCourse())));
    }

    private static void yearSpecified() {
        final int year = new Scanner(System.in).nextInt();
        Splitter on = Splitter.on(".");
        if (year == 1997) {
            System.out.println("No matches");
        } else if (studentInformations.stream().filter(student ->
                Integer.parseInt(Iterables.getLast(on.split(student.getDateOfBirth()))) == year).findFirst().isPresent()) {
            studentInformations.stream()
                    .filter(student -> year < Integer.parseInt(Iterables.getLast(on.split(student.getDateOfBirth()))))
                    .forEach(student ->
                            System.out.println(String.format("%s %s %s", student.getName(), student.getLastName(), student.getDateOfBirth())));
        } else System.out.println("No matches, try print correct year!");
    }


    private static void groupList() {
        final int group = Integer.parseInt(new Scanner(System.in).nextLine());
        if (studentInformations.stream().filter(student -> student.getGroup() == group).findFirst().isPresent()) {
            studentInformations.stream()
                    .filter(students -> students.getGroup() == group).forEach(System.out::println);
        } else System.out.println("No matches, now group is empty");
    }
}