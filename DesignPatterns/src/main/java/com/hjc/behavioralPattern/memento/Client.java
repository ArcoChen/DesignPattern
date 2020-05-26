package com.hjc.behavioralPattern.memento;

import com.hjc.behavioralPattern.memento.caretaker.MementoCaretaker;
import com.hjc.behavioralPattern.memento.caretaker.MementoCaretakerList;
import com.hjc.behavioralPattern.memento.originator.Chessman;

public class Client {
    //定义一个索引来记录当前状态所在位置
    private static int index = -1;

    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("车", 1, -1);
        display(chessman);
        //保存状态
        mementoCaretaker.setMemento(chessman.save());

        chessman.setY(4);
        display(chessman);
        mementoCaretaker.setMemento(chessman.save());
        display(chessman);

        chessman.setX(5);
        display(chessman);

        System.out.println("----------悔棋-------------");
        chessman.restore(mementoCaretaker.getMemento());
        display(chessman);

        System.out.println("----------撤销多步-----------");

        MementoCaretakerList mementoCaretakerList = new MementoCaretakerList();
        Chessman chess = new Chessman("车", 1, -1);
        play(mementoCaretakerList, chess);

        chess.setY(4);
        play(mementoCaretakerList, chess);

        chess.setX(5);
        play(mementoCaretakerList, chess);

        System.out.println("----------悔棋-------------");
        undo(mementoCaretakerList, chess, index);
        undo(mementoCaretakerList, chess, index);


        System.out.println("----------撤销悔棋-------------");
        redo(mementoCaretakerList, chess, index);


    }

    public static void display(Chessman chessman) {
        System.out.println("棋子：" + chessman.getLabel() + "，当前位置：" + chessman.getX() + "，" + chessman.getY());
    }

    //下棋
    public static void play(MementoCaretakerList mementoCaretakerList, Chessman chessman) {
        mementoCaretakerList.setMementoList(chessman.save());
        index++;
        display(chessman);
    }

    //悔棋
    public static void undo(MementoCaretakerList mementoCaretakerList, Chessman chessman, int i) {
        index--;
        chessman.restore(mementoCaretakerList.getMementoList(i - 1));
        display(chessman);
    }

    //撤销悔棋
    public static void redo(MementoCaretakerList mementoCaretakerList, Chessman chessman, int i) {
        index++;
        chessman.restore(mementoCaretakerList.getMementoList(i + 1));
        display(chessman);
    }
}
