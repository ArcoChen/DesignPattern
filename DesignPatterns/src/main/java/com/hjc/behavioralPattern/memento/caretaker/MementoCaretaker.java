package com.hjc.behavioralPattern.memento.caretaker;

import com.hjc.behavioralPattern.memento.memento.ChessmanMemento;

/**
 * 想起棋子备忘录类：备忘录（只能撤销一步）
 */
public class MementoCaretaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}
