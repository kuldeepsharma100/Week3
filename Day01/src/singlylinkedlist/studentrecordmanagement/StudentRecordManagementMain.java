package singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagementMain {
    public static void main(String[] args) {
        StudentRecordManagement st = new StudentRecordManagement();

        // Example usage
        st.addAtBeginning(1, "ram", 20, "A");
        st.addAtEnd(2, "rohit", 22, "B");
        st.addAtPosition(2, 3, "om", 21, "C");

        st.displayAllStudents();

        st.updateGrade(2, "A+");
        st.searchByRollNumber(2);

        st.deleteByRollNumber(1);
        st.displayAllStudents();
    }
}
