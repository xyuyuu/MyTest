package com.example.mytimingapplication.data;

import java.util.List;

//答疑
public class QaRoom {
    private int id;
    private String title;//答疑间名称
    private long chat_room_id;
    private String coverUrl;//封面
    private List<QaList> qaList;//问题列表
    private List<QueueUserList> queueUserList;//排队人信息
    private int queueCount;//排队人数
    private UserInfo userInfo;//使用者信息

    public class QueueUserList {

        private long id;//排队人id
        private String nickname;//排队人昵称
        private String gender;//排队人性别
        private String avatar;//排队人头像
        private String department;//排队人简介
        private String categoryAlias;//排队人tag
        private String type;//排队人类型
        private boolean isOfficial;
        private int accountType;

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return nickname;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void setCategoryAlias(String categoryAlias) {
            this.categoryAlias = categoryAlias;
        }

        public String getCategoryAlias() {
            return categoryAlias;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setIsOfficial(boolean isOfficial) {
            this.isOfficial = isOfficial;
        }

        public boolean getIsOfficial() {
            return isOfficial;
        }

        public void setAccountType(int accountType) {
            this.accountType = accountType;
        }

        public int getAccountType() {
            return accountType;
        }

    }

    public static class QaList {

        private int id;
        private String text;//问题内容
        private long user_id;//提问者id
        private UserInfo userInfo;//提问者信息

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public long getUser_id() {
            return user_id;
        }

        public void setUserInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
        }

        public UserInfo getUserInfo() {
            return userInfo;
        }

    }

    public static class UserInfo {

        private long id;
        private String nickname;
        private String gender;
        private String avatar;
        private String department;
        private String categoryAlias;
        private String type;
        private boolean isOfficial;
        private FreeLive.AuthenticationInfo authenticationInfo;
        private boolean isVerify;

        public boolean isVerify() {
            return isVerify;
        }

        public void setVerify(boolean verify) {
            isVerify = verify;
        }

        public boolean isOfficial() {
            return isOfficial;
        }

        public void setOfficial(boolean official) {
            isOfficial = official;
        }

        public FreeLive.AuthenticationInfo getAuthenticationInfo() {
            return authenticationInfo;
        }

        public void setAuthenticationInfo(FreeLive.AuthenticationInfo authenticationInfo) {
            this.authenticationInfo = authenticationInfo;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return nickname;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void setCategoryAlias(String categoryAlias) {
            this.categoryAlias = categoryAlias;
        }

        public String getCategoryAlias() {
            return categoryAlias;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setIsOfficial(boolean isOfficial) {
            this.isOfficial = isOfficial;
        }

        public boolean getIsOfficial() {
            return isOfficial;
        }


    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setChat_room_id(long chat_room_id) {
        this.chat_room_id = chat_room_id;
    }

    public long getChat_room_id() {
        return chat_room_id;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setQaList(List<QaList> qaList) {
        this.qaList = qaList;
    }

    public List<QaList> getQaList() {
        return qaList;
    }

    public void setQueueUserList(List<QueueUserList> queueUserList) {
        this.queueUserList = queueUserList;
    }

    public List<QueueUserList> getQueueUserList() {
        return queueUserList;
    }

    public void setQueueCount(int queueCount) {
        this.queueCount = queueCount;
    }

    public int getQueueCount() {
        return queueCount;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

}
