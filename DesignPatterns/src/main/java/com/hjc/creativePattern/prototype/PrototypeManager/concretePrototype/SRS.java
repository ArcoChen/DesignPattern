package com.hjc.creativePattern.prototype.PrototypeManager.concretePrototype;

import com.hjc.creativePattern.prototype.PrototypeManager.OfficialDocument;

/**
 * 软件需求规格说明书类（Software Requirements Specification）
 */
public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs=null;
        try {
            srs=(OfficialDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
