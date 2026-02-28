package com.example.asset_management.repository;

import com.example.asset_management.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AssetRepository extends JpaRepository<Asset,String> {
    // 中身は空でも継承するだけで基本の CRUDメソッドがつかえるようになる
}
