package dao;

import config.AppConfig;
import entity.EmpEntity;
import org.seasar.doma.BatchInsert;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

import java.util.List;

/**
 */
@Dao(config = AppConfig.class)
public interface EmpDao {

    @Select
    List<EmpEntity> selectAll();

    @Insert
    int insert(EmpEntity empEntity);

    @BatchInsert
    int[] batchInsert(List<EmpEntity> entities);

}
