class activity1 {
    int empno;
    String name;
    float sal;

    activity1(){
        System.out.println("*****");
        empno = 101;
        name = "Evan";
        sal = 5000f;
    }
    void displayDetails(){
        System.out.println(empno + " | " + name + " | " + sal);
    }
}

class Main {
    public static void main(String[] args) {
        activity1 emp1 = new activity1();
        activity1 emp2 = new  activity1();
        activity1 emp3 = new  activity1();

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}