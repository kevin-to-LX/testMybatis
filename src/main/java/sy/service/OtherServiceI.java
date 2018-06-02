package sy.service;

import sy.model.TrafficEconomyAmapSpeedRawHz;

import java.util.List;

public interface OtherServiceI {
	TrafficEconomyAmapSpeedRawHz getOterList(String id);
	List<TrafficEconomyAmapSpeedRawHz> getAll();
	int addTrafficDate(TrafficEconomyAmapSpeedRawHz trafficEconomyAmapSpeedRawHz);
	int deleteTrafficDateById(String id);
	int editTrafficDate(TrafficEconomyAmapSpeedRawHz trafficEconomyAmapSpeedRawHz);
}
