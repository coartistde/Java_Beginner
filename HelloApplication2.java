/*
 * (교재 38쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스2-5] 식별자의 예
 * 클래스, 변수(또는 필드) 또는 메소드의 이름을 식별자(identifier)라고 함.
 * <식별자 규칙>
 * 1. 대소문자 구분
 * 2. 길이 제한 X, but 너무 긴 식별자는 프로그램의 가독성(readability)을 저하시킴.
 * 3. 사용 가능한 문자 : 영어 대소문자, 한글, 숫자, 언더스코어(_) 문자, 달러($) 문자 등, 숫자 시작 X
 * 4. 변수나 필드 식별자의 경우, 자료형 표시를 위한 접두어를 소문자로 붙이기도 함. (헝가리언 표기법) 단, 클래스와 인터페이스는 대문자로 시작
 * 5.예약어(키워드)는 식별자로 사용 불가능.
 * 6. 여러 개의 단어로 결합된 식별자의 경우, 각 단어의 첫 글자를 대문자로 나머지는 소문자로 함. 단, 메소드는 소문자로만 작성!
 */

public class HelloApplication2 {                            // 클래스 이름
    static String szMsg = "Hello, Java Application!";       // 헝가리언 표기법
    public static void main(String args[]) {                // 메소드 이름
        int nTest = 0;                                      // 변수 이름
        System.out.println(szMsg);
    }
}
