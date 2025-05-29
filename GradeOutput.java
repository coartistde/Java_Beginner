/*
 * (교재 26~27쪽)
 * 제1장. Java와 객체지향 프로그래밍
 * 
 * [소스 1-5] Java 언어로 작성한 성적 처리 프로그램
 * 소스 1-4에서 구현한 성적 클래스 Grade를 이용해 두 명의 성적을 입력하고 총점을 출력하는 프로그램 작성
 * 클래스 유형으로 정의되는 변수를 '객체'라고 함.
 * 클래스는 프로그램에서 다루어야 할 현실 세계의 대상을 추상화하는 도구로 사용됨.
 * 객체는 독립적으로 존재하는 개별 대상, 클래스에 의해 정의되는 변수.
 */
public class GradeOutput 
{
    public static void main(String args[])
    {
        Grade g1, g2;               // 2명의 성적을 표현하기 위한 객체
        g1 = new Grade();
        g2 = new Grade();
        g1.e = 90; g1.m = 85;       // 점수 입력
        g2.e = 80; g2.m = 80;

        g1.output_grade();
        g2.output_grade();
    }
}