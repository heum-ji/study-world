package hijava.basic;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 스트림 Main 클래스
 */
public class StreamMain {
    private static final String FILE = "test.txt";
    private static final String CHARSET = "UTF-8"; // 한글 처리용

    public static void main(String[] args) {
        //         test1();
        //         test2();
        //         tryThis();
        //         test3();
        //        test4();
        //        try {
        //            test5();
        //        } catch (IOException e) {
        //            e.printStackTrace();
        //        }
        //        test6();
        writeFile("세종대왕 한글 123");
        readFile();
    }

    // readFile0 개선 : BufferedReader 사용
    private static void readFile() {
        try (FileInputStream fis = new FileInputStream(FILE)) {
            InputStreamReader isr = new InputStreamReader(fis, CHARSET);
            BufferedReader br = new BufferedReader(isr);
            String data = null;

            while ((data = br.readLine()) != null) { // 파일 종료 까지 읽기
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // writeFile0 개선 : BufferedWriter 사용
    private static void writeFile(String content) {
        File file = new File(FILE);

        try (FileOutputStream fos = new FileOutputStream(file)) { // 1Byte씩 Stream
            OutputStreamWriter osw = new OutputStreamWriter(fos, CHARSET); // Byte -> UTF-8 charset 설정
            BufferedWriter bw = new BufferedWriter(osw); // 1Byte 전송 -> Buffer(default : 8192 Byte)로 한번에 전송
            bw.write(content);
            bw.flush(); // 버퍼 크기 만큼 채워지지 않아도 전송
            bw.close();

            System.out.println("Write OK : " + file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile0() {
        try (FileInputStream fis = new FileInputStream(FILE)) {
            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile0(String content) {
        File file = new File(FILE);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(content.getBytes());

            System.out.println("Write OK : " + file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // test4 보다 더 좋은 코드 : try with resource - auto close 처리 해줌
    private static void test6() {
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            System.out.println("00000000000000");
        } catch (FileNotFoundException e) {
            System.out.println("test.txt 파일이 없습니다!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // throws 하면 호출한 곳에서 exception 처리 해야 함
    private static void test5() throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        fis.close();
    }

    // test3 개선버전
    private static void test4() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("test.txt 파일이 없습니다!!" + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void test3() {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("test.txt 파일이 없습니다!!" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * try this
     */
    private static void tryThis() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(90, "홍길동"));
        students.add(new Student(80, "김일수"));
        students.add(new Student(75, "김이수"));
        students.add(new Student(95, "김삼수"));

        // 1. 학생들의 이름을 출력하시오
        students.forEach(s -> System.out.println("1=" + s.getName()));

        // 2. 학번의 총점과 평균을 구하시오. (sum, average)
        // list -> 배열로 변환
        Student[] stuArr = new Student[students.size()];
        students.toArray(stuArr);

        // IntStream ids = Arrays.stream(stuArr).mapToInt(s -> s.getId()); // stream은 1회성 이므로, 재사용 불가

        // 총점 계산
        int sum = Arrays.stream(stuArr).mapToInt(s -> s.getId()).sum();
        // 평균 계산
        double avg = Arrays.stream(stuArr).mapToInt(s -> s.getId()).average().getAsDouble();

        System.out.println("2(sum)=" + sum);
        System.out.println("2(avg)=" + avg);

        // 3. 학생중 성적이 90번 이상인 학생의 이름을 정렬하여 출력하시오.
        Arrays.stream(stuArr).filter(s -> s.getId() >= 90).sorted().forEach(s -> System.out.println("3=" + s.toString()));
    }

    private static void test2() {
        int[] arr = new int[]{2, 3, 1, 5, 3, 2};
        double avg = Arrays.stream(arr).average().getAsDouble(); // Arrays.stream(arr).average() :OptionalDouble
        System.out.println("avg = " + avg);

        Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort=" + n)); // 정렬된 데이터를 1개씩 forEach
        Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct=" + n)); // 중복 제거

        Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sortDist=" + n)); // 정렬 + 중복제거

        Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println(n)); // 필터 기능 조건에 해당할때만 다음 진행
        System.out.println("==========");
        // 0, 2, 5, 6, 11, 14, 16 순으로 처리 됨
        System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n));  // reduce 2개씩 비교 0 : 시작지점, p : prev 이전값, n은 현재값
    }

    private static void test1() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100, "Hong100"));
        students.add(new Student(20, "Lim20"));
        students.add(new Student(5, "Lee5"));

        students.stream().map(s -> s.getName()).forEach(n -> System.out.println("s=" + n));

        students.stream().mapToInt(s -> s.getId()).sum(); // int형으로 해야 sum 사용가능

        System.out.println(students);
        System.out.println("==========");
        Collections.sort(students, new Sorting());
        System.out.println(students);
    }

}
