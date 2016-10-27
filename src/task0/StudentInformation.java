package task0;

import java.util.Objects;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        System.out.println("Print faculty to chose students 'KML'/'KL'");
        faculty();
        students();
    }
    private static void students(){
        Students student = new Students(1,"Ivan","Ivanov","Sergeevich","21.01.1997",
                "Kharkiv city prperemogy 12-student Hostel", "380",69859899,"KML",3,34);
        Students student1 = new Students(2,"Den","Balan","Ivanovich","21.10.1994",
                "Kharkiv city prperemogy 12-student Hostel", "380", 995686548,"KML",2,35);
        Students student2 = new Students(3,"Marta","Mi","Petrovna","01.01.1995",
                "Kharkiv city prperemogy 12-student Hostel", "380",  989094058,"KL",3,34);
        Students student3 = new Students(4,"Irina","Ivanova","Mihailovna","11.11.1997",
                "Kharkiv city prperemogy 12-student Hostel", "380", 909585844,"KML",1,36);
        Students student4 = new Students(11,"Serhey","Sidorov","Valentinovich","20.05.1994",
                "Kharkiv city prperemogy 12-student Hostel", "380",  999004564,"KL",3,34);
        Students student5 = new Students(5,"Oleg","Gurov","Stepanovihc","15.12.1996",
                "Kharkiv city prperemogy 12-student Hostel", "380", 689598685,"KML",3,34);
        Students student6 = new Students(6,"Galina","Ivanova","Vitalivna","14.12.1997",
                "Kharkiv city pr/peremogy 12-student Hostel", "380", 965417812,"KL",3,34);
        Students student7 = new Students(7,"Olexandr","Puschin","Sergeevich","20.11.1994",
                "Kharkiv city prperemogy 12-student Hostel", "380", 963695986,"KL",2,35);
        Students student8 = new Students(8,"Dmitriy","Logko","Anatoleevich","17.05.1997",
                "Kharkiv city prperemogy 12-student Hostel", "380", 559565652,"KL",2,35);
        Students student9 = new Students(9,"Ivanna","Golovina","Ivanovna","20.01.1997",
                "Kharkiv city prperemogy 12-student Hostel", "380", 936965566,"KML",1,36);
        Students student10 = new Students(10,"Ivan","Ivanov","Petrovich","21.01.1997",
                "Kharkiv city prperemogy 12-student Hostel", "380", 965456655,"KML",1,36);

         /*systemPrint(student,student1,student2,student3,student4,student5,student6,student7
                ,student8,student9,student10);*/

    }
    static void faculty(){
        Scanner scanner = new Scanner(System.in);
        String facult = scanner.nextLine();
        if (Objects.equals(facult, "KML")){
            Students studentInformation = new Students();
            String name;
            name = studentInformation.getName();
            System.out.println(name);


        }
    }
}
