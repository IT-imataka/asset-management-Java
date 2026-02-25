package com.example.asset_management;
import com.example.asset_management.entity.Asset;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://localhost:5173")
public class AssetController {
//    @GetMapping("/asset")
//    public List<Asset> getAssets(){
//        Asset asset = new Asset();
//        asset.setId(1L);
//        asset.setName("Macbook");
//
//        Asset asset1 = new Asset();
//        asset1.setId(2L);
//        asset1.setName("クリームたい焼き");
//
//        Asset asset2 = new Asset();
//        asset2.setId(3L);
//        asset2.setName("カスタードたい焼き");
//
//        return List.of(asset,asset1,asset2);
//    }
}