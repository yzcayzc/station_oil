package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.CarModelMapper;
import com.ruoyi.member.domain.CarModel;
import com.ruoyi.member.service.ICarModelService;
import com.ruoyi.common.core.text.Convert;

/**
 * 型号表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class CarModelServiceImpl implements ICarModelService 
{
    @Autowired
    private CarModelMapper carModelMapper;

    /**
     * 查询型号表
     * 
     * @param modelId 型号表ID
     * @return 型号表
     */
    @Override
    public CarModel selectCarModelById(Long modelId)
    {
        return carModelMapper.selectCarModelById(modelId);
    }

    /**
     * 查询型号表列表
     * 
     * @param carModel 型号表
     * @return 型号表
     */
    @Override
    public List<CarModel> selectCarModelList(CarModel carModel)
    {
        return carModelMapper.selectCarModelList(carModel);
    }

    /**
     * 新增型号表
     * 
     * @param carModel 型号表
     * @return 结果
     */
    @Override
    public int insertCarModel(CarModel carModel)
    {
        return carModelMapper.insertCarModel(carModel);
    }

    /**
     * 修改型号表
     * 
     * @param carModel 型号表
     * @return 结果
     */
    @Override
    public int updateCarModel(CarModel carModel)
    {
        return carModelMapper.updateCarModel(carModel);
    }

    /**
     * 删除型号表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCarModelByIds(String ids)
    {
        return carModelMapper.deleteCarModelByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除型号表信息
     * 
     * @param modelId 型号表ID
     * @return 结果
     */
    @Override
    public int deleteCarModelById(Long modelId)
    {
        return carModelMapper.deleteCarModelById(modelId);
    }
}
