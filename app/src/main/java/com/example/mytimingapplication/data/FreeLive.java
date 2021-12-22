package com.example.mytimingapplication.data;

import java.util.List;

//免费live
public class FreeLive {

    private int id;
    private String title;//live标题
    private Cover cover;//live封面
    private SpUserInfo spUserInfo;//主播信息


    public class SpUserInfo {

        private long id;//主播ID
        private String nickname;//主播昵称
        private String gender;//主播性别
        private String avatar;//主播头像
        private String department;//简介
        private String categoryAlias;//tag
        private String type;
        private boolean isOfficial;
        private int accountType;
        private boolean isFollow;
        private StatusInfo statusInfo;
        private boolean isVerify;
        private AuthenticationInfo authenticationInfo;//认证信息

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

        public void setIsFollow(boolean isFollow) {
            this.isFollow = isFollow;
        }

        public boolean getIsFollow() {
            return isFollow;
        }

        public void setStatusInfo(StatusInfo statusInfo) {
            this.statusInfo = statusInfo;
        }

        public StatusInfo getStatusInfo() {
            return statusInfo;
        }

        public void setIsVerify(boolean isVerify) {
            this.isVerify = isVerify;
        }

        public boolean getIsVerify() {
            return isVerify;
        }

        public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            this.authenticationInfo = authenticationInfo;
        }

        public AuthenticationInfo getAuthenticationInfo() {
            return authenticationInfo;
        }

    }

    public class StatusInfo {

        private int type;
        private long startTime;
        private String learningData;

        public void setType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setLearningData(String learningData) {
            this.learningData = learningData;
        }

        public String getLearningData() {
            return learningData;
        }

    }

    public static class CertList {

        private int type;
        private String category;
        private String desc;

        public void setType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }

    }

    public static class AuthenticationInfo {

        private int type;
        private List<CertList> certList;

        public void setType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }

        public void setCertList(List<CertList> certList) {
            this.certList = certList;
        }

        public List<CertList> getCertList() {
            return certList;
        }

    }

    public static class Cover {

        private long id;
        private int width;
        private String fileName;
        private int height;
        private boolean isGif;
        private String url;
        private String shareImgUrl;

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getWidth() {
            return width;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileName() {
            return fileName;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        public void setIsGif(boolean isGif) {
            this.isGif = isGif;
        }

        public boolean getIsGif() {
            return isGif;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setShareImgUrl(String shareImgUrl) {
            this.shareImgUrl = shareImgUrl;
        }

        public String getShareImgUrl() {
            return shareImgUrl;
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

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Cover getCover() {
        return cover;
    }

    public void setSpUserInfo(SpUserInfo spUserInfo) {
        this.spUserInfo = spUserInfo;
    }

    public SpUserInfo getSpUserInfo() {
        return spUserInfo;
    }

}
