package hijava.basic;

import java.util.*;

/**
 * Collection 연습
 */
public class Coll {

    public static void main(String[] args) {
        //        lists();
        //        sets();
        //        treeSets();
        maps();
    }

    private static void maps() {
        Map<Integer, Student> map = new HashMap<>();
        Student s1 = new Student(100, "hong1");
        Student s2 = new Student(200, "hong2");
        Student s3 = new Student(300, "hong3");

        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);

        System.out.println(map);

        int searchId = 301;
        if (map.containsKey(searchId)) {
            Student s500 = map.get(searchId);
            System.out.println(s500.getName());
        } else {
            System.out.println(searchId + " 학생이 없습니다!!");
        }
    }

    private static void treeSets() {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(100, "Hong"));
        set.add(new Student(50, "Lee"));
        set.add(new Student(200, "Kim"));
        set.add(new Student(100, "Hong"));
        System.out.println(set);
    }

    private static void sets() {
        Set<Student> set = new HashSet<>();
        set.add(new Student(100, "Hong"));
        set.add(new Student(50, "Lee"));
        set.add(new Student(200, "Kim"));
        set.add(new Student(100, "Hong"));
        System.out.println(set);
    }

    private static void lists() {
        /*
         * ArrayList : 중간에 삽입이 일어나지 않는 경우 사용하면 좋음
         * LinkedList : 중간에 삽입이 잦은 경우 사용하면 좋음
         * */

        List<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("111");
        list1.add("222");
        list1.add(1, "100");

        list2.add("aaa");
        System.out.println(list2);

        list1.add("333");
        list1.add("444");
        System.out.println(list1);

        boolean isPop = list1.remove("100");
        System.out.println("isPop = " + isPop);
        System.out.println(list1);
        String pop = list1.remove(1);
        System.out.println("pop = " + pop);
        System.out.println(list1);
        boolean isPop2 = list1.remove("100");
        System.out.println("isPop2 = " + isPop2);

        int size = list1.size();
        System.out.println("size = " + size);

        for (int i = 0; i < size; i++) {
            System.out.println(i + "번째 = " + list1.get(i));
        }
    }
}
