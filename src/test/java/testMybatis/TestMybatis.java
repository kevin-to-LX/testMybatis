package testMybatis;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sy.model.TrafficEconomyAmapSpeedRawHz;
import sy.service.OtherServiceI;

import com.alibaba.fastjson.JSON;





@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestMybatis {
	
	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	@Autowired
	private OtherServiceI service;

	@Test
	public void test() {
			TrafficEconomyAmapSpeedRawHz entity=service.getOterList("5904802050213937270");
	       logger.info(JSON.toJSONString(entity));
	}
	
	@Test
	public void test2() {
			List<TrafficEconomyAmapSpeedRawHz> entity=service.getAll();
	       logger.info(entity);
	}
	
}
