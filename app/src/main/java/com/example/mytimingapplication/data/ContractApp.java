package com.example.mytimingapplication.data;

//契约应用
public class ContractApp {


    private int id;
    private long createTime;//创建时间
    private int totalAmount;//契约钱数
    private String status;//状态
    private long startTime;//开始时间
    private long endTime;//结束时间
    private long surplusSeconds;//剩余秒数
    private ClockApp.GroupInfo groupInfo;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setSurplusSeconds(long surplusSeconds) {
        this.surplusSeconds = surplusSeconds;
    }

    public long getSurplusSeconds() {
        return surplusSeconds;
    }

    public void setGroupInfo(ClockApp.GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }

    public ClockApp.GroupInfo getGroupInfo() {
        return groupInfo;
    }
}
