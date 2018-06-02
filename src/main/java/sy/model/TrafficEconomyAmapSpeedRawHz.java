package sy.model;

public class TrafficEconomyAmapSpeedRawHz {
    private String linkId;

    private String updateTime;

    private Integer travelTime;

    private Integer speed;

    private Integer reliabilitycode;

    private Integer linkLen;

    private Integer adcode;

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getReliabilitycode() {
        return reliabilitycode;
    }

    public void setReliabilitycode(Integer reliabilitycode) {
        this.reliabilitycode = reliabilitycode;
    }

    public Integer getLinkLen() {
        return linkLen;
    }

    public void setLinkLen(Integer linkLen) {
        this.linkLen = linkLen;
    }

    public Integer getAdcode() {
        return adcode;
    }

    public void setAdcode(Integer adcode) {
        this.adcode = adcode;
    }
}