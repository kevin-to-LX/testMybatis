package sy.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.TrafficEconomyAmapSpeedRawHzMapper;
import sy.model.TrafficEconomyAmapSpeedRawHz;

@Service
public class OtherServiceImpl implements OtherServiceI {

	
	@Autowired
	private TrafficEconomyAmapSpeedRawHzMapper trafficEconomyAmapSpeedRawHzMapper;
	

	public TrafficEconomyAmapSpeedRawHz getOterList(String id) {
		return trafficEconomyAmapSpeedRawHzMapper.selectByPrimaryKey(id);
	}


	public List<TrafficEconomyAmapSpeedRawHz> getAll() {
		return trafficEconomyAmapSpeedRawHzMapper.getAll();
	}

	public int addTrafficDate(TrafficEconomyAmapSpeedRawHz trafficEconomyAmapSpeedRawHz) {
		return trafficEconomyAmapSpeedRawHzMapper.insertSelective(trafficEconomyAmapSpeedRawHz);
	}

	public int deleteTrafficDateById(String key) {
		return trafficEconomyAmapSpeedRawHzMapper.deleteByPrimaryKey(key);
	}

	public int editTrafficDate(TrafficEconomyAmapSpeedRawHz trafficEconomyAmapSpeedRawHz) {
		return trafficEconomyAmapSpeedRawHzMapper.updateByPrimaryKeySelective(trafficEconomyAmapSpeedRawHz);
	}
}
