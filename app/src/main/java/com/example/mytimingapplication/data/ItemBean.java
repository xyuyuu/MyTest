package com.example.mytimingapplication.data;


import java.io.Serializable;
import java.util.List;

public class ItemBean {
    private boolean result;//是否返回数据

    private int errorCode;//返回错误代码

    private String errorMsg;//返回错误消息内容

    private boolean isEnd;//是否结束

    private List<Mylist> list;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public List<Mylist> getList() {
        return list;
    }

    public void setList(List<Mylist> list) {
        this.list = list;
    }

    public static class Mylist implements Serializable {
        private int contentType;//返回数据类型
        private Feed feed;//日记
        private Svlog svlog;//汤视频
        private String group;//学习群
        private ClockApp clockApp;//打卡应用
        private ContractApp contractApp;//契约应用
        private FreeLive freeLive;//免费直播
        private Object personalLive;//
        private QaRoom qaRoom;//答疑
        private Object freeLearningRoom;//免费自习室
        private Object payLearningRoom;//收费自习室
        private MyTopic topic;//话题
        private String activity;

        public int getContentType() {
            return contentType;
        }

        public void setContentType(int contentType) {
            this.contentType = contentType;
        }

        public Feed getFeed() {
            return feed;
        }

        public void setFeed(Feed feed) {
            this.feed = feed;
        }

        public Svlog getSvlog() {
            return svlog;
        }

        public void setSvlog(Svlog svlog) {
            this.svlog = svlog;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public ClockApp getClockApp() {
            return clockApp;
        }

        public void setClockApp(ClockApp clockApp) {
            this.clockApp = clockApp;
        }

        public ContractApp getContractApp() {
            return contractApp;
        }

        public void setContractApp(ContractApp contractApp) {
            this.contractApp = contractApp;
        }

        public FreeLive getFreeLive() {
            return freeLive;
        }

        public void setFreeLive(FreeLive freeLive) {
            this.freeLive = freeLive;
        }

        public Object getPersonalLive() {
            return personalLive;
        }

        public void setPersonalLive(Object personalLive) {
            this.personalLive = personalLive;
        }

        public QaRoom getQaRoom() {
            return qaRoom;
        }

        public void setQaRoom(QaRoom qaRoom) {
            this.qaRoom = qaRoom;
        }

        public Object getFreeLearningRoom() {
            return freeLearningRoom;
        }

        public void setFreeLearningRoom(Object freeLearningRoom) {
            this.freeLearningRoom = freeLearningRoom;
        }

        public Object getPayLearningRoom() {
            return payLearningRoom;
        }

        public void setPayLearningRoom(Object payLearningRoom) {
            this.payLearningRoom = payLearningRoom;
        }

        public MyTopic getTopic() {
            return topic;
        }

        public void setTopic(MyTopic topic) {
            this.topic = topic;
        }

        public String getActivity() {
            return activity;
        }

        public void setActivity(String activity) {
            this.activity = activity;
        }
    }

    public static final int TYPE_MAIN_UNKNOWN = -1;

    public static final int TYPE_MAIN_DIARY = 1;//日记
    public static final int TYPE_MAIN_VIDEO = 2;//汤视频
    public static final int TYPE_MAIN_GROUP = 3;//学习群
    public static final int TYPE_MAIN_DK = 4;//打卡应用
    public static final int TYPE_MAIN_QY = 5;//契约应用
    public static final int TYPE_MAIN_FREE_LIVE = 6;//免费live
    public static final int TYPE_MAIN_USER_LIVE = 7;//个人live
    public static final int TYPE_MAIN_ANSWER_DEPRECATED = 8;//视频答疑废弃Type，后面不能使用
    public static final int TYPE_MAIN_FREE_LEARNING = 9;//免费自习室
    public static final int TYPE_MAIN_PAY_LEARNING = 10;//付费自习室
    public static final int TYPE_MAIN_TOPIC = 11;//话题
    public static final int TYPE_MAIN_ACTIVITY_CARD = 12;//活动
    public static final int TYPE_MAIN_ANSWER = 13;//答疑

}
