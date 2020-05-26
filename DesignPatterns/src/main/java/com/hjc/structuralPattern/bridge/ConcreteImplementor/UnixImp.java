package com.hjc.structuralPattern.bridge.ConcreteImplementor;

import com.hjc.structuralPattern.bridge.Matrix;
import com.hjc.structuralPattern.bridge.implementor.ImageImp;

public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix x) {

        System.out.println("在Unix操作系统显示图像");
    }
}
