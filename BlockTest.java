/*
 * (교재 49쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-13] 블록의 예
 * 블록 = 하나 이상의 명령문(연산문, 제어문)이나 변수 선언문, 클래스 정의문, 메소드 정의문 등을 중괄호({}, brace)로 묶는 것.
 * 중첩 가능, 중첩 깊이에 제한 X
 */

public class BlockTest {                            // 클래스 정의 블록
    public static void main(String args[]) {        // 메소드 정의 블록
        int a = 0, b = 0, c;
        {                                           // 명령문 블록
            int d = 0, e, f;
            a = a + b;
            {                                       // 중첩된 명령문 블록
                d++;
            }
        }
    }
}