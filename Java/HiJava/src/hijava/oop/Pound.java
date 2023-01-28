package hijava.oop;

/**
 * 파운드
 *
 * @author : Heum
 */
public class Pound extends Weight {

    @Override
    public int getGram(int cnt) {
        return cnt * 453;
    }
}
