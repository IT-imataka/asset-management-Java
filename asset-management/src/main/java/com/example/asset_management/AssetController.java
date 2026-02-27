package com.example.asset_management;
import com.example.asset_management.entity.Asset;
import com.example.asset_management.service.AssetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:5173")
public class AssetController {

    // フィールド
    private final AssetService assetService;

    // コンストラクタ
    public AssetController(AssetService assetService){
        this.assetService = assetService;
    }
    @GetMapping("/asset")
    public List<Asset> getAssets(){
        return assetService.getAssets();
    }
    @PostMapping("/asset")
    public void postAssets(@RequestBody Asset asset){
        assetService.addAsset(asset);
        System.out.println("登録しました:" + asset.getName());
    }
}