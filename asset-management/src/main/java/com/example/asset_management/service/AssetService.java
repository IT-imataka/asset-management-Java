package com.example.asset_management.service;

import com.example.asset_management.entity.Asset;
import com.example.asset_management.enums.Category;
import com.example.asset_management.enums.Status;
import org.springframework.stereotype.Service;
import com.example.asset_management.repository.AssetRepository;

import java.util.ArrayList;
import java.util.List;

//　アノテーションのすぐ下に実行したいメソッドを書くのはControllerのみ
@Service
public class AssetService {
    // これがフィールド
    private final AssetRepository assetRepository;

    // 初回起動時にだけ実行するコンストラクタ
    public AssetService(AssetRepository assetRepository){
        this.assetRepository = assetRepository;
        // １件目
        Asset mac = new Asset();
        mac.setId("A0001");
        mac.setName("MacBook Air");
        mac.setCategory(Category.PC);
        mac.setStatus(Status.ASSIGNED);
        mac.setUserName("我");
        // assetRepository.add(mac);
        assetRepository.save(mac);

        // モニター
        Asset monitor = new Asset();
        monitor.setId("A0002");
        monitor.setName("外部モニター");
        monitor.setCategory(Category.MONITOR);
        monitor.setStatus(Status.ASSIGNED);
        monitor.setUserName(null);
        // assetRepository.add(monitor);
        assetRepository.save(monitor);
    }
    public List<Asset> getAssets(){
        return assetRepository.findAll();
    }
    public void addAsset(Asset asset){
        // assetList.add(asset);
        assetRepository.save(asset);
    }
}

