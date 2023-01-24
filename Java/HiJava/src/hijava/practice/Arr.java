package hijava.practice;

/**
 * 배열
 *
 * @author : Heum
 */
public class Arr {

    public static void main(String[] args) {
        //ex1(); // 1 ~ 100 까지 배열에 넣기
        //ex2(); // str1 ~ str100 까지 배열 넣기
        //ex3();
        //ex4(); // 배열 복사
        ex5(); // 2차원 배열 사용해서 알파벳 출력하기
    }

    private static void ex1() {
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        printArray(nums);
    }

    private static void ex2() {
        String[] strs = new String[100];

        int len = strs.length;

        for (int i = 0; i < len; i++) {
            strs[i] = "str" + (i + 1);
        }

        printArray(strs);
    }

    private static void ex3() {
        Man[] people = new Man[9];
        int len = people.length;

        for (int i = 0; i < len; i++) {
            people[i] = new Man("김" + (i + 1) + "수");
        }

        for (Man man : people) {
            System.out.println(man);
        }
    }

    private static void ex4() {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.arraycopy(arr1, 0, arr2, 2, 3);

        // 얕은(shallow) 복사 : 항상 주소가 복사됨 -> 원본 수정 시 복사본도 수정됨
        // 깊은(deep)    복사 : clone 즉 값이 복사됨 -> 원본 수정 시 복사본 수정 되지 않음
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    private static void ex5() {
        int upperStart = 65; // 'A'
        int lowerStart = 97; // 'a'

        int[] starts = {upperStart, lowerStart};
        char[][] arr = new char[2][26];

        for (int start = 0; start < starts.length; start++) {
            for (int i = 0; i < 26; i++) {
                int x = i + starts[start];

                //System.out.println(x + "=" + (char) x); // char 형 변환 시 아스키코드 문자로 변환
                arr[start][i] = (char) x;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void printArray(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }
}
