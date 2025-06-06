/*
 * (교재 43쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-10] 묵시적 형변환
 * float형과 double형은 모두 실수형+ double형이 float형보다 더 넓은 표현 범위를 가짐 -> 오류 발생 X
 * 변수 f를 double령으로 변환하여 변수 d에 저장함 = 묵시적 형변환
 * 형변환 시, 자료의 손실이 발생하지 않을 경우에만 형변환 일어남.
 * 컴파일러가 알아서 해 주는 묵시적 형변환!
 */

public class TypeChangeAuto {
    public static void main(String args[]) {
        float f = 5.5f;     // float형 변수 f
        double d = f;       // double형 변수 d에 float형 값 5.5를 대입
    }
}
