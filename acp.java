public class acp {
    public static void main(String[] args) {
        String studentName = "John";
        String semester = "Semester 1";

        int math = 85;
        int science = 90;
        int english = 88;
        int computer = 95;

        int total = math + science + english + computer;
        double average = total / 4.0;

        System.out.println("===== REPORT CARD =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Semester: " + semester);
        System.out.println();

        System.out.println("Math: " + math);
        System.out.println("Science: " + science);
        System.out.println("English: " + english);
        System.out.println("Computer: " + computer);

        System.out.println();
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}