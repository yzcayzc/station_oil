package com.ruoyi.member.service;

import com.ruoyi.member.domain.CarVehicleSystem;
import java.util.List;

/**
 * 车系表Service接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface ICarVehicleSystemService 
{
    /**
     * 查询车系表
     * 
     * @param vehicleSystemId 车系表ID
     * @return 车系表
     */
    public CarVehicleSystem selectCarVehicleSystemById(Long vehicleSystemId);

    /**
     * 查询车系表列表
     * 
     * @param carVehicleSystem 车系表
     * @return 车系表集合
     */
    public List<CarVehicleSystem> selectCarVehicleSystemList(CarVehicleSystem carVehicleSystem);

    /**
     * 新增车系表
     * 
     * @param carVehicleSystem 车系表
     * @return 结果
     */
    public int insertCarVehicleSystem(CarVehicleSystem carVehicleSystem);

    /**
     * 修改车系表
     * 
     * @param carVehicleSystem 车系表
     * @return 结果
     */
    public int updateCarVehicleSystem(CarVehicleSystem carVehicleSystem);

    /**
     * 批量删除车系表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCarVehicleSystemByIds(String ids);

    /**
     * 删除车系表信息
     * 
     * @param vehicleSystemId 车系表ID
     * @return 结果
     */
    public int deleteCarVehicleSystemById(Long vehicleSystemId);
}
