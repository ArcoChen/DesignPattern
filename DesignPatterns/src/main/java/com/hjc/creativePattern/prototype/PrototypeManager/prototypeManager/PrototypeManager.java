package com.hjc.creativePattern.prototype.PrototypeManager.prototypeManager;

import com.hjc.creativePattern.prototype.PrototypeManager.OfficialDocument;
import com.hjc.creativePattern.prototype.PrototypeManager.concretePrototype.FAR;
import com.hjc.creativePattern.prototype.PrototypeManager.concretePrototype.SRS;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器（单例模式）
 */
public class PrototypeManager {
    //用于存储原型对象
    private Map<String, OfficialDocument> map=new HashMap<>();
    private static PrototypeManager pm=new PrototypeManager();

    //增加公文对象
    private PrototypeManager(){
        map.put("far",new FAR());
        map.put("srs",new SRS());
    }

    //增加新的公文对象
    public void addOfficialDocument(String key,OfficialDocument officialDocument){
        map.put(key,officialDocument);
    }

    //删除公文对象
    public void removeOfficialDocument(String key){
        map.remove(key);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key){
        return (OfficialDocument)map.get(key).clone();
    }

    public static PrototypeManager getInstance(){
        return pm;
    }
}
