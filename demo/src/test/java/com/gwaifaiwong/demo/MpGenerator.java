package com.gwaifaiwong.demo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author wangguihui
 * @date 2021/1/8
 */

public class MpGenerator {

    public static void main(String[] args) {

        //step1:代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        //step2:配置全局信息，包括输出路径、包名、作者等信息
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/demo/src/main/java");
        globalConfig.setAuthor("gwaifaiwong");
        globalConfig.setOpen(false);
        autoGenerator.setGlobalConfig(globalConfig);

        //step3:
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://192.168.21.133:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf8&&serverTimezone=GMT");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        autoGenerator.setDataSource(dataSourceConfig);

        //step4:
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.gwaifaiwong");
        packageConfig.setModuleName("demo");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        autoGenerator.setPackageInfo(packageConfig);

        //step5:
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("sys_user");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setControllerMappingHyphenStyle(true);
        strategyConfig.setTablePrefix(packageConfig.getModuleName() + "_");
        autoGenerator.setStrategy(strategyConfig);

        //step6:
        autoGenerator.execute();
    }
}
