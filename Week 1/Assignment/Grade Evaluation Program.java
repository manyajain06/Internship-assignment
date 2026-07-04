import java.util.Scanner;

 class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 85 && marks <= 100) {
            System.out.println("Grade: A");
        }
  else if (marks >= 70 && marks < 85) {
            System.out.println("Grade: B");
        }
else if (marks >= 50 && marks < 70) {
            System.out.println("Grade: C");
        }
else if (marks >= 0 && marks < 50) {
            System.out.println("Grade: Fail");
        } 
else {
            System.out.println("Invalid marks entered.");
        }
        
    }
}
