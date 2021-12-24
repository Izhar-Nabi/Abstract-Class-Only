package Faculty;

class Student extends Human{
    Student(){
        System.out.println("\t -----------------------------");
        System.out.println("\t****** Welcome to Student Portal *****");
        System.out.println("\t -----------------------------");
    }
    String Name= "Mohsin";
    int Age=21;
    String Work="Learn The New things From the Teachers";
    String Attendance="i Give My attendance To My Class Teacher";

    @Override
    void Eat() {
        System.out.println("I can Eat");
    }
}
