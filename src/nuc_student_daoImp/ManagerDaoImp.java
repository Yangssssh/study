package nuc_student_daoImp;

import nuc_student_dao.ManagerDao;
import nuc_student_entity.Manager;
import nuc_studnet_Utils.JdbcUtil;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class ManagerDaoImp implements ManagerDao{

    @Override
    public Manager find(Manager manager) {
        try {
            String sql = "SELECT * FROM manager WHERE id=?AND pwd=?";
            return JdbcUtil.getQueryRunner().query(sql, new BeanHandler<Manager>(Manager.class), manager.getId(), manager.getPwd());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

