package codeT;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.service.UserServices;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class) // = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-mvc.xml", "classpath:spring-mybatis.xml" })
@ActiveProfiles(value="dev")
public class TestMybatis  extends AbstractJUnit4SpringContextTests {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	@Autowired
	private  UserServices userServices;

	@Test
	public void test0() {
        logger.info(JSON.toJSONStringWithDateFormat("TestFinish", "yyyy-MM-dd HH:mm:ss"));
    }
	
	@Test
	public void test1() {
		TUser tuser = new TUser();
		PageQuery pageQuery = new PageQuery();
		List<TUser> list = userServices.getUserInfo(tuser, pageQuery);
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
	
	//@Test
	public void test2() {
	
		TUser tuser = new TUser();
		tuser.setId("0000");
		tuser.setLoginName("test");
		tuser.setPassword("password");
		int i = userServices.insert(tuser);
		logger.info(JSON.toJSONStringWithDateFormat("add "+i, "yyyy-MM-dd HH:mm:ss"));
	}
	
}
