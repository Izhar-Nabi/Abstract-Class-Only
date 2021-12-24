package Faculty;

public abstract class Human {
    String Name;
    int Age;
    String Work;
    String Attendance;
    abstract void Eat();
    public static void main(String args[]){
    Director Data = new Director();
    System.out.println("My Name is "+Data.Name);
    System.out.println("My Age is "+Data.Age);
    System.out.println("My Attendance is "+Data.Attendance);
    System.out.println("My Work is "+Data.Work);
    Data.Eat();
    Teacher TData = new Teacher();
    System.out.println("My Name is "+TData.Name);
    System.out.println("My Age is "+TData.Age);
    System.out.println("My Attendance is "+TData.Attendance);
    System.out.println("My Work is "+TData.Work);
    TData.Eat();
    Student SData = new Student();
    System.out.println("My Name is "+SData.Name);
    System.out.println("My Age is "+SData.Age);
    System.out.println("My Attendance is "+SData.Attendance);
    System.out.println("My Work is "+SData.Work);
    SData.Eat();
    }
}
