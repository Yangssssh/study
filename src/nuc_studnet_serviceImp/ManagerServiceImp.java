package nuc_studnet_serviceImp;

import nuc_student_dao.ManagerDao;
import nuc_student_daoImp.ManagerDaoImp;
import nuc_student_entity.Manager;
import nuc_studnet_service.ManagerService;

public class ManagerServiceImp implements ManagerService{
    private ManagerDao managerDao=new ManagerDaoImp();
    @Override
    public Manager find(Manager manager) {
        try {
            return managerDao.find(manager);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
