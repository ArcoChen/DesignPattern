package com.hjc.structuralPattern.composite;

import com.hjc.structuralPattern.composite.component.AbstractFile;
import com.hjc.structuralPattern.composite.composite.Folder;
import com.hjc.structuralPattern.composite.leaf.ImageFile;
import com.hjc.structuralPattern.composite.leaf.VideoFile;

public class Client {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,folder1,folder2,folder3;

        folder1=new Folder("Home");
        folder2=new Folder("图像文件");
        folder3=new Folder("视频文件");

        file1=new ImageFile("路飞.jpg");
        file2=new ImageFile("索隆.png");
        file3=new VideoFile("剧场版1");
        file4=new VideoFile("剧场版2");

        folder1.add(folder2);
        folder1.add(folder3);

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);

        folder1.killVirus();
    }
}
