/*
 * (교재 43쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-11] 명시적 형변환
 * 프로그래머가 강제로 형변환하는 법 = '명시적 형변환'
 * '(자료형)'형태의 형변환 연산자를 사용 -> 강제적인 형변환이 일어남. 컴파일러 오류 발생 X
 * 강제적인 형변환이 가능하지만, 자료형의 표현 범위가 큰 쪽에서 작은 쪽으로 형변환할 경우에는 주의해야함(자료의 손실이 일어날 수 있기 때문).
 */

public class TypeChangeManual {
    public static void main(String args[]) {
        int a = 3;
        float f = (float)a;
        double d;
        f = (float)d;           // 오류는 아니지만 자료의 손실이 발생할 수 있음(float형의 표현 범위 < double형의 표현 범위)
    }
}
