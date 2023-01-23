package hijava.practice;

/**
 * School 클래스 공부용 객체
 *
 * @author : Heum
 */
public class Score {
    private String subject;
    private int score;

    // 기본 생성자가 아닌 생성자를 만드는 경우, 기본 생성자 명시해줘야 함
    public Score() {

    }

    public Score(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public Score(String subject) {
        this.setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = "과목 : " + subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
