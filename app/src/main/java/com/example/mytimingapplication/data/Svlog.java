package com.example.mytimingapplication.data;

import java.util.List;

public class Svlog {
    private long id;//汤视频id
    private Author author;//作者信息
    private String content;//标题内容
    private int type;
    private long postTime;
    private int likeCount;//喜欢人数
    private int replyCount;//分享次数
    private boolean isLike;//是否喜欢
    private Video video;
    private List<String> imageList;
    private Feed.Topic topic;//话题
    private Feed.Label label;//标签
    private String album;
    private String payLive;

    public static class Video {

        private String id;//视频ID
        private String url;//视频地址
        private String originalUrl;
        private String androidUrl;//安卓地址
        private String iosUrl;
        private String gifUrl;
        private boolean hasGif;
        private Cover cover;//封面信息
        private long timeLen;//播放时长
        private long fileSize;//文件长度
        private String fileName;
        private String download;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setOriginalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
        }

        public String getOriginalUrl() {
            return originalUrl;
        }

        public void setAndroidUrl(String androidUrl) {
            this.androidUrl = androidUrl;
        }

        public String getAndroidUrl() {
            return androidUrl;
        }

        public void setIosUrl(String iosUrl) {
            this.iosUrl = iosUrl;
        }

        public String getIosUrl() {
            return iosUrl;
        }

        public void setGifUrl(String gifUrl) {
            this.gifUrl = gifUrl;
        }

        public String getGifUrl() {
            return gifUrl;
        }

        public void setHasGif(boolean hasGif) {
            this.hasGif = hasGif;
        }

        public boolean getHasGif() {
            return hasGif;
        }

        public void setCover(Cover cover) {
            this.cover = cover;
        }

        public Cover getCover() {
            return cover;
        }

        public void setTimeLen(long timeLen) {
            this.timeLen = timeLen;
        }

        public long getTimeLen() {
            return timeLen;
        }

        public void setFileSize(long fileSize) {
            this.fileSize = fileSize;
        }

        public long getFileSize() {
            return fileSize;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileName() {
            return fileName;
        }

        public void setDownload(String download) {
            this.download = download;
        }

        public String getDownload() {
            return download;
        }

    }

    public static class Cover {

        private long id;
        private int width;//封面长度
        private String fileName;//封面文件名
        private int height;//封面高度
        private boolean isGif;
        private String url;//封面地址
        private String shareImgUrl;//背景图片地址

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

    public static class Author {

        private long id;
        private String nickname;
        private String gender;
        private String avatar;
        private String department;
        private String categoryAlias;
        private String type;
        private boolean isOfficial;
        private int accountType;
        private boolean isFollow;
        private StatusInfo statusInfo;
        private boolean isVerify;
        private String authenticationInfo;

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

        public void setAuthenticationInfo(String authenticationInfo) {
            this.authenticationInfo = authenticationInfo;
        }

        public String getAuthenticationInfo() {
            return authenticationInfo;
        }

    }

    public static class StatusInfo {

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

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setPostTime(long postTime) {
        this.postTime = postTime;
    }

    public long getPostTime() {
        return postTime;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setIsLike(boolean isLike) {
        this.isLike = isLike;
    }

    public boolean getIsLike() {
        return isLike;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setTopic(Feed.Topic topic) {
        this.topic = topic;
    }

    public Feed.Topic getTopic() {
        return topic;
    }

    public void setLabel(Feed.Label label) {
        this.label = label;
    }

    public Feed.Label getLabel() {
        return label;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setPayLive(String payLive) {
        this.payLive = payLive;
    }

    public String getPayLive() {
        return payLive;
    }

}
