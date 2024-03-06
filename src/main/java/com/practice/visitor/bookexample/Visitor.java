package com.practice.visitor.bookexample;

// 訪問者模式：
// pros: 1. 報表、UI、攔截器、過濾器等等，適用於資料結構相對穩定的系統
//       2. 符合單一職責原則、讓程式具有優秀的擴展性，靈活性非常高
// cons: 1. 訪問者依賴的是具體Entity，而非抽象Entity，違背DI原則
//       2. 具體Entity透露Visitor類別內部細節，違反迪米特法則，造成具體Entity變更困難，
//          但如果Visitor只是要做簡單的報表，其實就還好，到時候Entity變更的時候再修改另外Visitor具體類別(只要不要有太多Visitor subclass要維護就好...)

// 適用場景：一個系統有比較「穩定的資料結構」，又有經常變化的功能需求，那麼「訪問者模式適合該開發模式」
public interface Visitor {
    public void visit(Engineer engineer);
    public void visit(Manager manager);
}
