//

 class Student {
    String name;
    String className;
    int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public Student (String name , String className , int rollNo) {
        this.name = name;
        this.className = className;
        this.rollNo = rollNo;
    }
}

class Record
{
    public void StudentInfo(Student student){
        System.out.println("Name : "+student.getName());
        System.out.println("Class Name : "+student.getClassName());
        System.out.println("RollNo : "+student.getRollNo());
    }

    static void SchoolInfo(){
        System.out.println("School Name : J.P Public School");
        System.out.println("School Location : Kasganj");
    }

}

public class MainClass{
    public static void main(String[] args) {
        Record record = new Record();
        // To get the information of student must create an object
        record.StudentInfo(new Student("Vishad Raj Vashishtha","12",45));

        // To get the information of student not need to create an object
        Record.SchoolInfo();
    }

}
