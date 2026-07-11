public class StudentInfo {
    
    private String name;
    private int rollNo;
    private String branch;

    public StudentInfo(String studentName, int studentRollNo, String studentBranch) {
        name = studentName;
        rollNo = studentRollNo;
        branch = studentBranch;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int newRollNo) {
        rollNo = newRollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String newBranch) {
        branch = newBranch;
    }

    public void display() {
        System.out.println("----- Student Info -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("Manya", 45, "CSE");
        s1.display();
        
        System.out.println("\nChanging branch...");
        s1.setBranch("IT");
        s1.display();
    }
}
