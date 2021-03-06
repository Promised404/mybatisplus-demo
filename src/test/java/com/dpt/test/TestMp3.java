package com.dpt.test;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * @author 邓鹏涛
 * @date 2019/5/13 23:15
 */
public class TestMp3 {

    @Test
    public void testGenerator() {
        // 1全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true) // 是否支持AR模式
                .setAuthor("dpt") //作者
                .setOutputDir("D:\\ideaProject2\\mybatisplus\\src\\main\\java") // 生成路径
                .setFileOverride(true) //文件覆盖
                .setIdType(IdType.AUTO) //主键策略
                .setServiceName("%sService") //生成的service接口名的首字母是否为I
                .setBaseResultMap(true)
                .setBaseColumnList(true);
        // 2数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/mp")
                .setUsername("root")
                .setPassword("123456");
        // 3策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //全局大写名
                .setDbColumnUnderline(true) // 指定表名字段名是否使用下划线
                .setNaming(NamingStrategy.underline_to_camel)  // 下划线转驼峰命名的策略
                .setTablePrefix("tbl_")
                .setInclude("tbl_employee"); // 生成的表
        // 4包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.dpt.mp")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("beans")
                .setXml("mapper");
        // 5整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
        // 6执行
        ag.execute();
    }

}
