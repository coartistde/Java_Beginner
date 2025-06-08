/*
 * (교재 52쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-16] switch문의 예
 * switch문 = if-else문처럼 명령문의 실행을 분기시키는 역할
 * if-else문과의 차이점 : if-else문 = 분기의 조건이 true값 or false값을 갖는 조건식, switch문 = long형을 제외한 정수값을 갖는 수식.
 */

public class SwitchTest {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        switch(n) {
            case 10:
            System.out.println("10입니다.");
            break;
            case 20:
            case 30:
            System.out.println("20이거나 30입니다.");
            break;
            default:
            System.out.println("모르겠습니다.");
            break;
        }
    }
}