/*
 * (교재 51~52쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-15] if-else 문의 예
 * if-else문 = 주어진 조건에 따라 명령문의 실행을 분기시키는 역할.
 * if 뒤에 주어지는 조건이 true -> if 블록 / false -> else 블록
 */

public class IfTest {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        if(n > 10) {
            System.out.println("10보다 크다");
        } else if(n < 3) {
            System.out.println("3보다 작다");
        } else {
            System.out.println("3보다 크거나 같고 10보다 작거나 같다.");
        }
    }
}