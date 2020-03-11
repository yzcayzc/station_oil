package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.CarVehicleSystemMapper;
import com.ruoyi.member.domain.CarVehicleSystem;
import com.ruoyi.member.service.ICarVehicleSystemService;
import com.ruoyi.common.core.text.Convert;

/**
 * 车系表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class CarVehicleSystemServiceImpl implements ICarVehicleSystemService 
{
    @Autowired
    private CarVehicleSystemMapper carVehicleSystemMapper;

    /**
     * 查询车系表
     * 
     * @param vehicleSystemId 车系表ID
     * @return 车系表
     */
    @Override
    public CarVehicleSystem selectCarVehicleSystemById(Long vehicleSystemId)
    {
        return carVehicleSystemMapper.selectCarVehicleSystemById(vehicleSystemId);
    }

    /**
     * 查询车系表列表
     * 
     * @param carVehicleSystem 车系表
     * @return 车系表
     */
    @Override
    public List<CarVehicleSystem> selectCarVehicleSystemList(CarVehicleSystem carVehicleSystem)
    {
        return carVehicleSystemMapper.selectCarVehicleSystemList(carVehicleSystem);
    }

    /**
     * 新增车系表
     * 
     * @param carVehicleSystem 车系表
     * @return 结果
     */
    @Override
    public int insertCarVehicleSystem(CarVehicleSystem carVehicleSystem)
    {
        return carVehicleSystemMapper.insertCarVehicleSystem(carVehicleSystem);
    }

    /**
     * 修改车系表
     * 
     * @param carVehicleSystem 车系表
     * @return 结果
     */
    @Override
    public int updateCarVehicleSystem(CarVehicleSystem carVehicleSystem)
    {
        return carVehicleSystemMapper.updateCarVehicleSystem(carVehicleSystem);
    }

    /**
     * 删除车系表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCarVehicleSystemByIds(String ids)
    {
        return carVehicleSystemMapper.deleteCarVehicleSystemByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除车系表信息
     * 
     * @param vehicleSystemId 车系表ID
     * @return 结果
     */
    @Override
    public int deleteCarVehicleSystemById(Long vehicleSystemId)
    {
        return carVehicleSystemMapper.deleteCarVehicleSystemById(vehicleSystemId);
    }
}
