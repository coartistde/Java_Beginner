/*
 * (교재 49~50쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-14] 명령행 매개변수의 사용
 * 명령행 매개변수 = 프로그램을 실행시킬 때 프로그램 이름 뒤에 나열하여 프로그램에 전달하는 매개변수
 * 간단한 데이터를 실행 프로그램에 전달할 때 사용됨.
 * 명령행 매개변수로 넘겨준 데이터는 문자열 배열인 args에 저장되어 main 메소드에 전달됨.
 */

public class Main {
    public static void main(String args[]) {
        System.out.println(args[0] + "," + args[1]);
    }
}