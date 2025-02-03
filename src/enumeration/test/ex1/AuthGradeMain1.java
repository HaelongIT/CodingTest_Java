package enumeration.test.ex1;

public class AuthGradeMain1 {
        public static void main(String[] args) {
                System.out.println("grade = " + AuthGrade.GUEST + ", level = " + AuthGrade.GUEST.getLevel()
                                + ", 설명 = " + AuthGrade.GUEST.getDescription());
                System.out.println("grade = " + AuthGrade.LOGIN + ", level = " + AuthGrade.LOGIN.getLevel()
                                + ", 설명 = " + AuthGrade.LOGIN.getDescription());
                System.out.println("grade = " + AuthGrade.ADMIN + ", level = " + AuthGrade.ADMIN.getLevel()
                                + ", 설명 = " + AuthGrade.ADMIN.getDescription());
        }
}
