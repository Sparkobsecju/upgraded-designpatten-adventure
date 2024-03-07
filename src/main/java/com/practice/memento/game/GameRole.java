package com.practice.memento.game;

public class GameRole {

    private int vit;
    private int def;



    // 建構子


    // 創建 Memento，即根據當前的狀態得到 Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    // 從備忘錄物件，恢復 GameRole 的狀態
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    // 顯示當前遊戲角色的狀態
    public void display() {
        System.out.println("遊戲角色當前的攻擊力：" + this.vit + " 防禦力 " + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
