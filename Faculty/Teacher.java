package Faculty;

class Teacher extends Human{
    Teacher(){
        System.out.println("\t -----------------------------");
        System.out.println("\t ***** WelCome To Teacher Portal *****");
        System.out.println("\t -----------------------------");
    }
    String Name= "Sadiq";
    int Age=40;
    String Work="To Tech The Student";
    String Attendance= "Director Allowed us to Take The Attendance of the Student";

    @Override
    void Eat() {
        System.out.println("I can Eat");
    }
}
