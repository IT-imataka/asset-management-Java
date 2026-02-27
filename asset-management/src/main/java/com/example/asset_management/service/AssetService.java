package com.example.asset_management.service;

import com.example.asset_management.entity.Asset;
import com.example.asset_management.enums.Category;
import com.example.asset_management.enums.Status;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//　アノテーションのすぐ下に実行したいメソッドを書くのはControllerのみ
@Service
public class AssetService {

    // これがフィールド
    private final List<Asset> assetList = new ArrayList<>();

    // 初回起動時にだけ実行するコンストラクタ
    public AssetService(){
        // １件目
        Asset mac = new Asset();
        mac.setId("A0001");
        mac.setName("MacBook Air");
        mac.setCategory(Category.PC);
        mac.setStatus(Status.ASSIGNED);
        mac.setUserName("我");
        assetList.add(mac);

        // モニター
        Asset monitor = new Asset();
        monitor.setId("A0002");
        monitor.setName("外部モニター");
        monitor.setCategory(Category.MONITOR);
        monitor.setStatus(Status.ASSIGNED);
        monitor.setUserName(null);
        assetList.add(monitor);
    }
    public List<Asset> getAssets(){
        return assetList;
    }
    public void addAsset(Asset asset){
        assetList.add(asset);
    }
}

