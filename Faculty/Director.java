package Faculty;

class Director extends Human {
    Director(){
        System.out.println("\t*******Welcome To Faculty******");
        System.out.println("\t-------------------------");
        System.out.println("\t**** Director Portal ****");
        System.out.println("\t-------------------------");
    }
    String Name= "Johan";
    int Age = 48;
    String Work= "Control The Dept issues";
    String Attendance="i have A Attendance Sheet of Employee";


    @Override
    void Eat() {
    System.out.println("I can Eat");
    }
}
