package dao;

import config.AppConfig;
import org.seasar.doma.Dao;
import org.seasar.doma.Script;

/**
 */
@Dao(config = AppConfig.class)
public interface InitDao {

    @Script
    public void create();

    @Script
    public void drop();
}
