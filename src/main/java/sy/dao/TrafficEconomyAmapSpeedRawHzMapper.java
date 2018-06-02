package sy.dao;

import java.util.List;

import sy.model.TrafficEconomyAmapSpeedRawHz;

public interface TrafficEconomyAmapSpeedRawHzMapper {
    int deleteByPrimaryKey(String linkId);

    int insert(TrafficEconomyAmapSpeedRawHz record);

    int insertSelective(TrafficEconomyAmapSpeedRawHz record);

    TrafficEconomyAmapSpeedRawHz selectByPrimaryKey(String linkId);

    int updateByPrimaryKeySelective(TrafficEconomyAmapSpeedRawHz record);

    int updateByPrimaryKey(TrafficEconomyAmapSpeedRawHz record);
    
    List<TrafficEconomyAmapSpeedRawHz> getAll();
}