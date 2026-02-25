package com.example.asset_management.enums;

public enum Category {
    // 定数
    PC("01","ノートPC"),
    MONITOR("02","モニター"),
    KEYBOARD("03","キーボード");

    // フィールド
    private final String code;
    private final String name;

    // コンストラクタ
    private Category(String code,String name){
        this.code = code;
        this.name = name;
    }
    // Getter
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
}