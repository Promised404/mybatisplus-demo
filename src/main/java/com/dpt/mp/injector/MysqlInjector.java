package com.dpt.mp.injector;

import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.mapper.AutoSqlInjector;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;

/**
 * @author 邓鹏涛
 * @date 2019/5/19 17:59
 */
public class MysqlInjector extends AutoSqlInjector {

    /**
     * 扩展inject 方法，完成自定义全局操作
     * @param configuration
     * @param builderAssistant
     * @param mapperClass
     * @param modelClass
     * @param table
     */
    @Override
    public void inject(Configuration configuration, MapperBuilderAssistant builderAssistant, Class<?> mapperClass, Class<?> modelClass, TableInfo table) {
        // 注入的SQL语句
        String sql = "delete from " + table.getTableName();
        // 注入的方法名  一定要与EmployeeMapper接口中的方法名对应
        String method = "deleteAll";
        // 构造SqlSource
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
        // 构造一个删除的MapperStatement
        this.addDeleteMappedStatement(modelClass, method, sqlSource);
    }
}
