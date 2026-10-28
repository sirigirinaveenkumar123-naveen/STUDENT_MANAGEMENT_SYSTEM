import java.util.Scanner;
class student{

        static int Id;
        static String name;
        static int age;
        static String course;

        void addstudent(){
            Scanner sc = new Scanner(System.in);
            //int[] student= new int[5];
            student obj=new student();
            //Id = sc.nextInt();
            //System.out.print("Enter Student ID: ");

//         for (int i=0;i<2;i++){
                System.out.print("Enter Student ID: ");
               obj.Id= sc.nextInt();
                System.out.print("Enter student name: ");
                obj.name= sc.next();
                System.out.print("Enter student age: ");
                 obj.age=sc.nextInt();
                System.out.print("Enter student course: ");
                obj.course= sc.next();
                System.out.println("Student added successfully");
//            }
//            for(int i=0;i<5;i++){
//                Id[i] = sc.nextInt();
//            }
//            System.out.print("Enter student name: ");
//            name = sc.next();
//            System.out.print("Enter student age: ");
//            age = sc.nextInt();
//            System.out.print("Enter student course: ");
//            course = sc.next();
//            System.out.println("Student added successfully");
        }
        void viewallstudents(){
//            for(int i=0;i<2;i++){
//
//            }
            for(int i=0;i<2;i++) {
                System.out.println("ID: " + this.Id + "  Student name: " + this.name + "  Age: " + this.age + "  Student course: " + this.course);
            }
        }
        void searchstudentbyId(){
             Scanner scc=new Scanner(System.in);
            System.out.print("Enter student Id to search:");
            int Ids=scc.nextInt();
            if(Id==Ids){
                System.out.println("Student Found!");
                System.out.println("ID: " + Id + "  Student name: " + name + "  Age: " + age + "  Student course: " + course);
            }
        }
         void updatestudentdetails(){
             Scanner upd=new Scanner(System.in);
            System.out.print("Updated Student name: ");
            name=upd.next();
            System.out.print("Updated Student Id: ");
            Id=upd.nextInt();
            System.out.print("Updated Student Age: ");
           age=upd.nextInt();
            System.out.print("Updated Student Course: ");
            course=upd.next();
            System.out.println("Updated Successfully");
        }

        void deletestudent(){
            System.out.println("Enter Student Id to delete Student Details: ");
            Scanner dels=new Scanner(System.in);
            Id=dels.nextInt();
           // for(int i=0;i<)
        }
         void Exit(){
            System.out.println("Thank you for using Student management System");
        }

        int  menu(){
            Scanner in = new Scanner(System.in);
            System.out.println("1.Add student");
            System.out.println("2.view all students");
            System.out.println("3.search student by Id");
            System.out.println("4.Update Student details ");
            System.out.println("5.Delete Student by Id ");
            System.out.println("6.Exit ");
            System.out.print("Enter your choice: ");
            int n=in.nextInt();
           return n;
        }
}

public class Studentmanagementsystem {
    public static void main(String[] args) {
        System.out.println("STUDENT MANAGEMENT SYSTEM ");

        student obj = new student();
        int n;

        do {
            switch (n = obj.menu()) {

                case 1:
                    obj.addstudent();
                    break;
                case 2:
                    obj.viewallstudents();
                    break;
                case 3:
                    obj.searchstudentbyId();
                    break;
                case 4:
                    obj.updatestudentdetails();
                    break;
                case 5:
                    obj.deletestudent();
                    break;
                case 6:
                    obj.Exit();
                    break;

                default:
                    System.out.println("Invalid No");

            }

        } while (n != 6);




    }
}


