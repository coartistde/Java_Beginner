/*
 * (교재 41~42쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-7] boolean 형의 사용
 * 논리형(boolean) 1byte 길이
 * 참과 거짓 표현하는 자료형
 * 참 = true, 거짓 = false
 * Java에서는 오직 boolean형만이 참과 거짓을 표현 가능
 */

public class BooleanTest {
    public static void main(String args[]) {
        boolean bFlag1, bFlag2;
        bFlag1 = true;
        bFlag1 = false;
        bFlag2 = 45 < 29;
        bFlag2 = bFlag1;
    }
}
