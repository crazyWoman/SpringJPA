package com.learning.jpa.h2;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "studentEntityManagerFactory")
public class JpaConfiguration {
	
	@Value("${app.test.jpa.show-sql}")
	private String showSql;
	
	@Value("${app.test.jpa.database-platform}")
	private String dialectPlatform;
	
	@Bean(name = "studentDataSource")
	@ConfigurationProperties(prefix = "app.test.datasource")
	DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "studentEntityManagerFactory")
	
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		localContainerEntityManagerFactoryBean.setDataSource(dataSource());
		localContainerEntityManagerFactoryBean.setPackagesToScan("com.learning.jpa.h2");
		
		HibernateJpaVendorAdapter hibernateJpaVenderAdapter = new HibernateJpaVendorAdapter();
		
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(hibernateJpaVenderAdapter);
		
		Map<String, Object> stringProperties = new HashMap<>();
		stringProperties.put("hibernate.show-sql", showSql);
		stringProperties.put("hibernate.dialect", dialectPlatform);
		
		localContainerEntityManagerFactoryBean.setJpaPropertyMap(stringProperties);
		
		return localContainerEntityManagerFactoryBean;
	}
	
}
