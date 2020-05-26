package com.hjc.structuralPattern.composite.composite;

import com.hjc.structuralPattern.composite.component.AbstractFile;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    private  String name;

    public Folder(String name){
        this.name=name;
    }

    private List<AbstractFile> fileList=new ArrayList<>();
    @Override
    public void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("给"+name+"发送邮件");
        System.out.println("对文件夹"+name+"进行杀毒");
        for(AbstractFile file:fileList){
            file.killVirus();
        }
    }
}
