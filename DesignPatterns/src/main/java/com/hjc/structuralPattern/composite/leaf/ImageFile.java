package com.hjc.structuralPattern.composite.leaf;

import com.hjc.structuralPattern.composite.component.AbstractFile;

public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name){
        this.name=name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        System.out.println("不支持该方法");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        System.out.println("不支持该方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对图像文件"+name+"进行杀毒");
    }
}
