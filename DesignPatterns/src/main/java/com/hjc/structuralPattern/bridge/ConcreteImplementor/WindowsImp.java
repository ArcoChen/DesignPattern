package com.hjc.structuralPattern.bridge.ConcreteImplementor;

import com.hjc.structuralPattern.bridge.Matrix;
import com.hjc.structuralPattern.bridge.implementor.ImageImp;

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix x) {
        System.out.println("在Windows操作系统显示图像");
    }
}
