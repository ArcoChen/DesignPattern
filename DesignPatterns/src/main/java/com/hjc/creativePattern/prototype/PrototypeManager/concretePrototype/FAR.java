package com.hjc.creativePattern.prototype.PrototypeManager.concretePrototype;

import com.hjc.creativePattern.prototype.PrototypeManager.OfficialDocument;

/**
 * 可行性分析报告类（Feasibility Analysis Report）
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far=null;
        try {
            far=(OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
