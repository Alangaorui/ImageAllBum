package com.alan.falbum.enitity;

import java.util.List;

/**
 * Created by alan on 17-8-28.
 */
public class AlbumEnitity {

    // 相册第一张照片路径
    private ImageEnitity topImageEnitity;
    // 相册名称
    private String albumName;
    // 相册的图片数
    private int imageCounts;
    // 该相册的图片对象
    private List<ImageEnitity> imageEnitities;

    public AlbumEnitity() {
    }

    public ImageEnitity getTopImageEnitity() {
        return topImageEnitity;
    }

    public void setTopImageEnitity(ImageEnitity topImageEnitity) {
        this.topImageEnitity = topImageEnitity;
    }

    public String getAlbumName() {
        return (albumName != null) ? albumName : "";
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getImageCounts() {
        return imageCounts;
    }

    public void setImageCounts(int imageCounts) {
        this.imageCounts = imageCounts;
    }

    public List<ImageEnitity> getImageEnitities() {
        return imageEnitities;
    }

    public void setImageEnitities(List<ImageEnitity> imageEnitities) {
        this.imageEnitities = imageEnitities;
    }
}
