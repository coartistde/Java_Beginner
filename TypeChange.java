/*
 * (교재 42쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-9] 자료형에 따른 오류
 * 자료형의 변환(형변환)
 * Java에서는 소스 파일이 컴파일될 때 변수나 상수의 자료형을 엄격하게 검사함.
 * 변수 or 상수에 대입하는 값이 변수나 상수가 선언될 당시의 자료형과 일치하지 않을 경우 -> 오류 발생 or 형변환(type conversion)
 */

public class TypeChange {
    public static void main(String args[]) {
        int a = 3;
        String s = a;           // 자료형의 종류가 아주 다름(변수 a = 정수형int, 변수 s = 문자열형String)
        float f;
        a = f;                  // 자료의 손실이 발생할 수 있음(변수 a = 정수형int, 변수 f = 실수형float)
    }
}
