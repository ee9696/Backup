package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import user.dao.UserDAOImpl;

@Configuration
@PropertySource("classpath:spring/db.properties")
public class SpringConfiguration {
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	

	/*
	@Bean
	public BasicDataSource basicDataSource(){
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		basicDataSource.setUsername("c##java");
		basicDataSource.setPassword("bit");
		basicDataSource.setMaxTotal(20);
		basicDataSource.setMaxIdle(3);
		
		return basicDataSource;
	}
	*/
	
	@Bean
	public BasicDataSource basicDataSource(){
	
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(driver);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		
		
//		basicDataSource.setDriverClassName("${jdbc.driver}");
//		basicDataSource.setUrl("${jdbc.url}");
//		basicDataSource.setUsername("${jdbc.username}");
//		basicDataSource.setPassword("${jdbc.password}");
//		basicDataSource.setMaxTotal(20);
//		basicDataSource.setMaxIdle(3);
		
		return basicDataSource;
	}
	@Bean
	public UserDAOImpl userDAOImpl(){
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		userDAOImpl.setDS(basicDataSource());
		return userDAOImpl;
	}
}
