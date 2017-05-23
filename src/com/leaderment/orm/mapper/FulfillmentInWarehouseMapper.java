package com.leaderment.orm.mapper;

import com.leaderment.orm.pojo.FulfillmentInWarehouse;
import java.util.List;

public interface FulfillmentInWarehouseMapper {
    int deleteByPrimaryKey(Integer inWarehouseId);

    int insert(FulfillmentInWarehouse record);

    FulfillmentInWarehouse selectByPrimaryKey(Integer inWarehouseId);

    List<FulfillmentInWarehouse> selectAll();

    int updateByPrimaryKey(FulfillmentInWarehouse record);
}