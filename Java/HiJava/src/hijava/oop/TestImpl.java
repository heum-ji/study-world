package hijava.oop;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestImpl implements TestInterface {

    /**
     * 조회 쿼리
     * 
     * @param sql 조회를 원하는 쿼리
     * @return 조회 결과
     * @throws SQLException
     */
    @Override
    public ResultSet select(String sql) throws SQLException {
        print(sql);
        return null;
    }
}
