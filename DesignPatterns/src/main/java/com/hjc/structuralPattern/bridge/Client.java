package com.hjc.structuralPattern.bridge;

import com.hjc.structuralPattern.bridge.ConcreteImplementor.WindowsImp;
import com.hjc.structuralPattern.bridge.abstraction.Image;
import com.hjc.structuralPattern.bridge.implementor.ImageImp;
import com.hjc.structuralPattern.bridge.refinedAbstraction.JPGImage;

public class Client {
    public static void main(String[] args) {
        Image image=new JPGImage();
        ImageImp imp=new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("路飞");
    }
}
