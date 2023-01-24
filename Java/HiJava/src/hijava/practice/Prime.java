package hijava.practice;

import java.util.ArrayList;

/**
 * 소수 판단 : 배열 -> arrayList로 수정
 *
 * @author : Heum
 */
public class Prime {
    private static ArrayList<Integer> primeList = new ArrayList<>(); // 소수 리스트

    public static void main(String[] args) {
        int total = 0;

        for (int num = 2; num <= 100; num++) {

            if (isPrime(num)) {
                total += num;
            }
        }
        System.out.println("1 ~ 100 까지의 소수의 합 : " + total);
    }

    // refactoring 소수를 판단 해줘!
    private static boolean isPrime(int num) {
        for (Integer prime : primeList) { // size를 호출하지 않아서, index가 필요하지 않은 경우 foreach가 좋음
            if (num % prime == 0) { // 자기보다 작은 소수로 나누기만 해도 소수판단 가능
                return false;
            }
        }
        primeList.add(num); // 소수 리스트 추가
        return true;
    }
}
