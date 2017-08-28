package com.alan.falbum.enitity;

import java.io.Serializable;

/**
 * Created by alan on 17-8-28.
 */
public class ImageEnitity implements Serializable{

    // 图片ID
    private int imageId;
    // 图片的名称
    private String name;
    // 图片路径
    private String path;
    // 是否被选择
    private boolean isSelected;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return (name != null) ? name : "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return (path != null) ? path : "";
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
