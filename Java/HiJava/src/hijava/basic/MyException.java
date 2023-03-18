package hijava.basic;

/**
 * Custom Exception
 * - 사용자가 정의한 Exception
 * - 생성자에 String 값을 받아서 super 처리
 * - 내가 원하는 시점에 new 생성해서, catch에서 예외처리
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        // Custom Exception 호출 예시
        try {
            // ....
            // if (...)
            throw new MyException("사용자가 만든 Exception 입니다!");
        } catch (MyException e) {
            // 원하는 예외 처리..
        }
    }
}
