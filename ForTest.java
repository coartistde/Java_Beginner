/*
 * (교재 53~54쪾)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-17] for문의 예
 * 반복문은 주어진 조건이 true일 경우 블록으로 묶인 명령어들을 반복해서 실행시켜줌.
 * 반복문의 종류 : for문, while문, do-while문
 * 
 * for문의 형식
 * for(초기화식; 반복조건; 반복식) { 명령문 }
 * for문 실행 절차
 * 시작 -> 초기화식 -> 반복조건 -> true -> 반복식 -> 명령문 -> 반복조건 -> false -> 종료
 * 반복조건이 생략 or 계속 true일 경우 -> 반복식과 명령문이 무한히 반복됨 = 무한 루프
 */

public class ForTest {
    public static void main(String args[]) {
        int nSum = 0;
        for(int i = 1; i <= 10; i++) {
            nSum += i;
        }
    }
}
