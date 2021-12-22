package com.example.mytimingapplication.data;

import java.util.List;

//日记
public class Feed {
    private long id;//日记的ID
    private Author author;//日记作者信息
    private String content;//日记内容
    private int type;//日记类型
    private long postTime;//发布时间
    private int likeCount;//喜欢人数
    private int replyCount;//分享人数
    private boolean isLike;//是否喜欢
    private Object video;//视频
    private List<ImageList> imageList;
    private Topic topic;
    private Label label;
    private Object album;
    private Object payLive;

    public static class Topic {
        private int id;//话题ID
        private String name;//话题名字

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Label {
        private boolean onTop;//是否置顶
        private String learnTag;//Learn标签
        private boolean cityTag;//城市标签
        private int statusTag;//状态tag

        public boolean isOnTop() {
            return onTop;
        }

        public void setOnTop(boolean onTop) {
            this.onTop = onTop;
        }

        public String getLearnTag() {
            return learnTag;
        }

        public void setLearnTag(String learnTag) {
            this.learnTag = learnTag;
        }

        public boolean isCityTag() {
            return cityTag;
        }

        public void setCityTag(boolean cityTag) {
            this.cityTag = cityTag;
        }

        public int getStatusTag() {
            return statusTag;
        }

        public void setStatusTag(int statusTag) {
            this.statusTag = statusTag;
        }
    }

    public static class Author {
        private long id;//日记作者ID
        private String nickname;//作者昵称
        private String gender;//性别
        private String avatar;//作者头像
        private String department;//简介
        private String categoryAlias;//认证标签
        private String type;
        private boolean isOfficial;
        private int accountType;
        private boolean isFollow;
        private StatusInfo statusInfo;//状态信息
        private boolean isVerify;//
        private Object authenticationInfo;//认证信息

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

        public Object getAuthenticationInfo() {
            return authenticationInfo;
        }

        public void setAuthenticationInfo(Object authenticationInfo) {
            this.authenticationInfo = authenticationInfo;
        }
    }

    public static class StatusInfo {
        private int type;//状态类型
        private long startTime;//开始时间
        private LearningData learningData;

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

        public LearningData getLearningData() {
            return learningData;
        }

        public void setLearningData(LearningData learningData) {
            this.learningData = learningData;
        }
    }

    public static class LearningData {
        private int type;
        private int roomID;
        private int server;//服务ID
        private String source;//来源
        private Object learningRoomInfo;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getRoomID() {
            return roomID;
        }

        public void setRoomID(int roomID) {
            this.roomID = roomID;
        }

        public int getServer() {
            return server;
        }

        public void setServer(int server) {
            this.server = server;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public Object getLearningRoomInfo() {
            return learningRoomInfo;
        }

        public void setLearningRoomInfo(Object learningRoomInfo) {
            this.learningRoomInfo = learningRoomInfo;
        }
    }

    public static class ImageList {
        private long id;//图片id
        private int width;//图片长度
        private int height;//图片高度
        private boolean idGif;//是否为gif
        private String url;//图片路径
        private String shareImgUrl;//封面图片路径

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }


        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public boolean isIdGif() {
            return idGif;
        }

        public void setIdGif(boolean idGif) {
            this.idGif = idGif;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getShareImgUrl() {
            return shareImgUrl;
        }

        public void setShareImgUrl(String shareImgUrl) {
            this.shareImgUrl = shareImgUrl;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getPostTime() {
        return postTime;
    }

    public void setPostTime(long postTime) {
        this.postTime = postTime;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }

    public Object getVideo() {
        return video;
    }

    public void setVideo(Object video) {
        this.video = video;
    }

    public List<ImageList> getImageList() {
        return imageList;
    }

    public void setImageList(List<ImageList> imageList) {
        this.imageList = imageList;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Object getAlbum() {
        return album;
    }

    public void setAlbum(Object album) {
        this.album = album;
    }

    public Object getPayLive() {
        return payLive;
    }

    public void setPayLive(Object payLive) {
        this.payLive = payLive;
    }
}
