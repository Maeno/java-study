import config.AppConfig;
import dao.EmpDao;
import dao.EmpDaoImpl;
import dao.InitDao;
import dao.InitDaoImpl;
import entity.EmpEntity;
import org.seasar.doma.jdbc.tx.TransactionManager;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Main {


    private static final InitDao initDao = (InitDao) new InitDaoImpl();
    private static final EmpDao empDao = (EmpDao) new EmpDaoImpl();

    public static void main(String[] args) {
        TransactionManager tm = AppConfig.singleton().getTransactionManager();
        tm.required(() -> {
            initDao.create();
            EmpEntity emp = new EmpEntity();
            emp.ename = "TESTEMP1";
            emp.empno = 10;
            emp.deptno = 10;
            emp.dname = "TESTDEPT1";
            empDao.insert(emp);
            System.out.println(empDao.selectAll().size());

            List<EmpEntity> empList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                EmpEntity temp = new EmpEntity();
                temp.ename = "TESTEMP1";
                temp.empno = 10;
                temp.deptno = 10;
                temp.dname = "TESTDEPT1";
                empList.add(temp);
            }
            empDao.batchInsert(empList);
            System.out.println(empDao.selectAll().size());
        });

    }
}
