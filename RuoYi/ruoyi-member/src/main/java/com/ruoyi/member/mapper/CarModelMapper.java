package com.ruoyi.member.mapper;

import com.ruoyi.member.domain.CarModel;
import java.util.List;

/**
 * 型号表Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface CarModelMapper 
{
    /**
     * 查询型号表
     * 
     * @param modelId 型号表ID
     * @return 型号表
     */
    public CarModel selectCarModelById(Long modelId);

    /**
     * 查询型号表列表
     * 
     * @param carModel 型号表
     * @return 型号表集合
     */
    public List<CarModel> selectCarModelList(CarModel carModel);

    /**
     * 新增型号表
     * 
     * @param carModel 型号表
     * @return 结果
     */
    public int insertCarModel(CarModel carModel);

    /**
     * 修改型号表
     * 
     * @param carModel 型号表
     * @return 结果
     */
    public int updateCarModel(CarModel carModel);

    /**
     * 删除型号表
     * 
     * @param modelId 型号表ID
     * @return 结果
     */
    public int deleteCarModelById(Long modelId);

    /**
     * 批量删除型号表
     * 
     * @param modelIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCarModelByIds(String[] modelIds);
}
