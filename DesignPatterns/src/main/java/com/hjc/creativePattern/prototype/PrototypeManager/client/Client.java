package com.hjc.creativePattern.prototype.PrototypeManager.client;

import com.hjc.creativePattern.prototype.PrototypeManager.OfficialDocument;
import com.hjc.creativePattern.prototype.PrototypeManager.prototypeManager.PrototypeManager;

public class Client {
    public static void main(String[] args) {
        PrototypeManager pm=PrototypeManager.getInstance();

        OfficialDocument doc1,doc2,doc3,doc4;

        doc1=pm.getOfficialDocument("far");
        doc1.display();

        doc2=pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1==doc2);

        doc3=pm.getOfficialDocument("srs");
        doc3.display();
        doc4=pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3==doc4);
    }
}
