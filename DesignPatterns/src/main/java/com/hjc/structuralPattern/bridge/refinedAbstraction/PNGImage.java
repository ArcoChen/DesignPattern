package com.hjc.structuralPattern.bridge.refinedAbstraction;

import com.hjc.structuralPattern.bridge.Matrix;
import com.hjc.structuralPattern.bridge.abstraction.Image;

public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix x=new Matrix();
        imp.doPaint(x);
        System.out.println(fileName+"，格式为PNG");
    }
}
