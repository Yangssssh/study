package nuc_studnet_action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc_student_entity.Manager;
import nuc_studnet_service.ManagerService;
import nuc_studnet_serviceImp.ManagerServiceImp;

import javax.jnlp.ServiceManager;

public class ManagerAction extends ActionSupport implements ModelDriven<Manager>{
    private Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    @Override
    public Manager getModel() {
        return manager;
    }
    ManagerService ms=new ManagerServiceImp();

    @Override
    public String execute() throws Exception {
        try {
            Manager mg=ms.find(manager);
            if( mg==null){
               return input();
            }
            ActionContext.getContext().getSession().put("mg",mg);
            return SUCCESS;
        } catch (Exception e) {
            return "error";
        }
    }

}

