package hijava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Stack/Queue 구현 연습
 */
public class StackQueue {
    final static String[] strings = new String[]{"aaa", "bbb", "ccc"};

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        pushStackAndEnQueue(list);
        System.out.println(list);

        // pop(list, 2);
        deQueue(list, 2);
        System.out.println("==========");
        System.out.println(list);
    }

    private static void deQueue(List<String> list, int cnt) {
        for (int i = 0; i < cnt; i++) {
            String deQueueVal = list.remove(0); // 첫번째 값 제거
            System.out.println(i + " - deQueueVal : " + deQueueVal);
        }
    }

    private static void pop(List<String> list, int cnt) {
        for (int i = 0; i < cnt; i++) {
            String popVal = list.remove(list.size() - 1); // 마지막 값 제거
            System.out.println(i + " - popVal : " + popVal);
        }
    }

    private static void pushStackAndEnQueue(List<String> list) {
        list.addAll(Arrays.asList(strings));
    }
}
