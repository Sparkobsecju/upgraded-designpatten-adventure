package com.practice.memento.theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState(" 狀態#1 攻擊力 100 ");

        // 保存了當前的狀態
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 狀態#2 攻擊力 80 ");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 狀態#3 攻擊力 50 ");
        caretaker.add(originator.saveStateMemento());

        System.out.println("當前的狀態是 = " + originator.getState());

        // 希望恢復到狀態 1，將 originator 恢復到狀態 1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢復到狀態1, 當前的狀態是");
        System.out.println("當前的狀態是 = " + originator.getState());

    }
}


/**
 * 備忘錄模式的角色及職責
 * 1. originator：物件 (需要保存狀態的物件)
 * 2. Memento：備忘錄物件，負責保存好紀錄，即 Originator 內部狀態
 * 3. Caretaker：守護者物件，負責保存多個備忘錄物件，使用即和管理提高效率
 * 4. 說明：如果希望保存多個 originator 物件的不同時間的狀態，只需要 HashMap<String, 集合>
 */





