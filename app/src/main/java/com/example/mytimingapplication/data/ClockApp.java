package com.example.mytimingapplication.data;

import java.util.List;

//打卡应用
public class ClockApp {
    private long id;//打卡应用Id
    private String title;//打卡应用标题
    private long createTime;//创建时间
    private GroupInfo groupInfo;//打卡群的信息

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public GroupInfo getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(GroupInfo groupInfo) {
        this.groupInfo = groupInfo;
    }


    public static class GroupInfo {
        private long id;//打卡群id
        private String steamID;//打卡群号
        private BuilderInfo builderInfo;//打卡群主信息
        private String name;//打卡群名字

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getSteamID() {
            return steamID;
        }

        public void setSteamID(String steamID) {
            this.steamID = steamID;
        }

        public BuilderInfo getBuilderInfo() {
            return builderInfo;
        }

        public void setBuilderInfo(BuilderInfo builderInfo) {
            this.builderInfo = builderInfo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    public static class BuilderInfo {
        private long id;//群主id
        private String nickname;//群主昵称
        private String gender;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getCategoryAlias() {
            return categoryAlias;
        }

        public void setCategoryAlias(String categoryAlias) {
            this.categoryAlias = categoryAlias;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isOfficial() {
            return isOfficial;
        }

        public void setOfficial(boolean official) {
            isOfficial = official;
        }

        public int getAccountType() {
            return accountType;
        }

        public void setAccountType(int accountType) {
            this.accountType = accountType;
        }

        public boolean isFollow() {
            return isFollow;
        }

        public void setFollow(boolean follow) {
            isFollow = follow;
        }

        public StatusInfo getStatusInfo() {
            return statusInfo;
        }

        public void setStatusInfo(StatusInfo statusInfo) {
            this.statusInfo = statusInfo;
        }

        public boolean isVerify() {
            return isVerify;
        }

        public void setVerify(boolean verify) {
            isVerify = verify;
        }

        public AuthenticationInfo getAuthenticationInfo() {
            return authenticationInfo;
        }

        public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            this.authenticationInfo = authenticationInfo;
        }

        private String avatar;//群主头像
        private String department;//群主简介
        private String categoryAlias;//群主认证
        private String type;
        private boolean isOfficial;
        private int accountType;
        private boolean isFollow;
        private StatusInfo statusInfo;//状态信息
        private boolean isVerify;//
        private AuthenticationInfo authenticationInfo;//群主认证信息
    }

    public static class StatusInfo {
        private int type;//状态类型
        private long startTime;//开始时间

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public Object getLeaningData() {
            return leaningData;
        }

        public void setLeaningData(String leaningData) {
            this.leaningData = leaningData;
        }

        private Object leaningData;//学习数据
    }

    public static class AuthenticationInfo {
        private int type;//群主认证类型

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<CerList> getCerList() {
            return cerList;
        }

        public void setCerList(List<CerList> cerList) {
            this.cerList = cerList;
        }

        private List<CerList> cerList;
    }

    public static class CerList {
        private int type;
        private String category;//类别

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        private String desc;//认证信息
    }
}
