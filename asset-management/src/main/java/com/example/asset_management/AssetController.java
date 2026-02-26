package com.example.asset_management;
import com.example.asset_management.entity.Asset;
import com.example.asset_management.enums.Category;
import com.example.asset_management.enums.Status;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:5173")
public class AssetController {
    // 使い捨てのコントローラーから保存できるようにする
    // これがフィールド
    private final List<Asset> assetList = new ArrayList<>();

    // 初回起動時にだけ実行するコンストラクタ
    public AssetController(){
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

    @GetMapping("/asset")
    public List<Asset> getAssets(){
        return assetList;
    }
    @PostMapping("/asset")
    public void postAssets(@RequestBody Asset asset){
        assetList.add(asset);
        System.out.println("登録しました:" + asset.getName());
    }
}