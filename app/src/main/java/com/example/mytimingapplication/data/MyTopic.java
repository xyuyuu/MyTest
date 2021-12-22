package com.example.mytimingapplication.data;

import java.util.List;

//话题
public class MyTopic {

    private int id;
    private String name;//话题标题
    private List<FeedList> feedList;//话题列表

    public class FeedList {

        private long id;
        private String content;
        private List<ImageList> imageList;

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setImageList(List<ImageList> imageList) {
            this.imageList = imageList;
        }

        public List<ImageList> getImageList() {
            return imageList;
        }

    }

    public class ImageList {

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFeedList(List<FeedList> feedList) {
        this.feedList = feedList;
    }

    public List<FeedList> getFeedList() {
        return feedList;
    }
}
