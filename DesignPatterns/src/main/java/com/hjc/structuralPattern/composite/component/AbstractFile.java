package com.hjc.structuralPattern.composite.component;

/**
 * 抽象文件类：抽象构件
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile abstractFile);
    public abstract void remove(AbstractFile abstractFile);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
