package com.example.mybatis;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class MybatisConfig {

    @Autowired
    private DataSourceProperties dataSourceProperties;


    @Bean(name = "dataSource")
    public DataSource dataSource() {

        DruidDataSource dataSource = new DruidDataSource();
        //dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/school?serverTimezone=UTC");
        //System.out.println(dataSourceProperties.getUrl());
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUsername("root");
        //dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword("123456");
        //dataSource.setPassword(dataSourceProperties.getPassword());

        return dataSource;

    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean.getObject();
    }

}