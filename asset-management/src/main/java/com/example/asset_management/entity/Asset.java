package com.example.asset_management.entity;

import com.example.asset_management.enums.Category;
import com.example.asset_management.enums.Status;
import jakarta.persistence.*;

// ここからDBのテーブルという宣言
@Entity
// テーブル名
@Table(name = "asset")
public class Asset {

    // DB上で定義するプライマリキー
    @Id
    private String id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Enumerated(EnumType.STRING)
    private Status status;
    private String userName;

    // GetterとSetter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}