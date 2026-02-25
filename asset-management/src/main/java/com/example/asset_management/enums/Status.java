package com.example.asset_management.enums;

public enum Status {
//  定数の列挙が最優先
    // コンストラクタに渡す
    AVAILABLE("10","在庫"),
    ASSIGNED("20","貸出中"),
    BROKEN("90","故障");

    // 定数が持つデータ(フィールド)の定義
    private final String code;
    private final String name;

    // コンストラクタ
    private Status (String code, String name){
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