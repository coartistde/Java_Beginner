/*
 * (교재 3쪽) 
 * 제1장. Java와 객체지향 프로그래밍
 * 
 * [소스1-1] C 프로그램 예제 -> Java 프로그램 예제로 똑같이 구현
 * C 언어와 Java 언어의 문법적 골격의 동일성
 */

public class CvsJava {
    public static void main(String args[]) {
        int i = 1, sum = 0;
        for(i = 1; i <=10; i++) {
            sum += i;
        }
    }
}