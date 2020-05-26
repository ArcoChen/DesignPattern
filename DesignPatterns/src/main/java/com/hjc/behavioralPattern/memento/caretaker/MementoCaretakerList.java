package com.hjc.behavioralPattern.memento.caretaker;

import com.hjc.behavioralPattern.memento.memento.ChessmanMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录类：保存集合，可进行多步撤销
 */
public class MementoCaretakerList {
    private List<ChessmanMemento> mementoList=new ArrayList<>();

    public ChessmanMemento getMementoList(int i) {
        return mementoList.get(i);
    }

    public void setMementoList(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}
