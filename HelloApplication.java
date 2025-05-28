/*
 * (교재 13쪽)
 * 제1장. Java와 객체지향 프로그래밍
 * 
 * [소스1-2] Java 프로그램 기본 구조
 * Java는 클래스 단위로 실행되고 소스코드 역시 클래스 단위로 작성됨 
 * main() 메소드가 포함된 클래스명과 .java 파일명(소스 코드 파일명)이 동일해야함.
 * Java 프로그램은 main() 메소드부터 실행됨.
 */
public class HelloApplication {
    public static void main(String arg[]) {
        System.out.println("Hello, Java Application!");
    }
}
