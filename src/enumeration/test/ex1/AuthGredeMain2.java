package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGredeMain2 {
    public static void main(String[] args) {
        // 입력받는 코드 : "당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : "
        // 문자열을 입력받아서 AuthGrade 열거형으로 변환하기
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String input = scanner.nextLine();
        AuthGrade grade = AuthGrade.valueOf(input);

        // 출력하는 코드 : "당신의 등급은 ㅁㅁㅁ입니다."
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");

        // 출력 : ==메뉴 목록==
        // 출력 : 등급에 따라 출력이 달라짐
        System.out.println("==메뉴 목록==");
        pagePrint(grade);
    }

    static void pagePrint(AuthGrade grade) {
        System.out.println("- 메인 화면");
        if (grade.equals(AuthGrade.LOGIN))
            System.out.println("- 이메일 관리 화면");
        else if (grade.equals(AuthGrade.ADMIN)) {
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }
    }
}
