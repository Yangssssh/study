package nuc_studnet_Utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
        import org.apache.commons.dbutils.QueryRunner;

        import javax.sql.DataSource;

public class JdbcUtil {
    private static DataSource dataSource;
    static{
        dataSource=new ComboPooledDataSource();
    }
    public static QueryRunner getQueryRunner(){
        return new QueryRunner(dataSource);
    }
}
