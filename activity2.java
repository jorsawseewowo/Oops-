public class activity2 {
    int number=10;
    void increment(){
        number=number+1;
    }
    public static void main(String[] args) {
        activity2 obj1=new activity2();
        activity2 obj2 = new activity2();
        activity2 obj3 = new activity2();

        obj1.increment();
        obj2.increment();
        obj3.increment();
    }
}
