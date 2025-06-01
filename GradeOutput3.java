/*
 * (교재 34~35쪽)
 * 제2장 Java 기본 문법
 * 
 * [소스 2-3] Java 언어로 작성한 성적 처리 프로그램 2
 * [소스 2-2] 프로그램을 하나의 클래스로 구현
 */
public class GradeOutput3
{
    int e;                                          // 영어 성적을 위한 변수
    int m;                                          // 수학 성적을 위한 변수

    void input_grade(int a, int b) {                // 성적을 입력하기 위한 메소드
        e = a;
        m = b;
    }
    void input_grade() {                            // 성적의 합을 구하는 메소드
        System.out.println(e+m);
    }

    public static void main(String args[])
    {
        GradeOutput g1, g2;                         // 2명의 성적을 표현하기 위한 객체
        g1 = new GradeOutput();                     // 객체 생성
        g2 = new GradeOutput();

        g1.input_grade(90, 85);                     // 점수 입력
        g2.input_grade(80, 80);

        g1.output_grade();                          // 점수 출력
        g2.output_grade();
    }
}