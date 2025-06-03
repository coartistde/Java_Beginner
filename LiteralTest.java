/*
 * (교재 41쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스2-6] 실수형 리터럴의 사용
 * 실수형 리터럴 직접 사용 시, 주의할 것.
 * Java는 double형 리터럴로 간주하므로 float형으로 명시할 경우 리터럴 뒤에 'f'를 붙여야함.
 */

public class LiteralTest {
    public static void main(String arg[]) {
        float f1 = 5.0;     // 컴파일 오류
        float f2 = 5.0f;
        double d = 5.0;
    }
}
