package com.example.asset_management;
import com.example.asset_management.entity.Asset;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AssetController {
    @GetMapping("/asset")
    public Asset getAsset(){
        Asset asset =  new Asset();
        asset.setId(1L);
        asset.setName("テスト");
        return asset;
    }

}