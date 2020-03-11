package com.ruoyi.member.service;

import com.ruoyi.member.domain.MCarType;
import java.util.List;

/**
 * 车类型表Service接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface IMCarTypeService 
{
    /**
     * 查询车类型表
     * 
     * @param carTypeId 车类型表ID
     * @return 车类型表
     */
    public MCarType selectMCarTypeById(Long carTypeId);

    /**
     * 查询车类型表列表
     * 
     * @param mCarType 车类型表
     * @return 车类型表集合
     */
    public List<MCarType> selectMCarTypeList(MCarType mCarType);

    /**
     * 新增车类型表
     * 
     * @param mCarType 车类型表
     * @return 结果
     */
    public int insertMCarType(MCarType mCarType);

    /**
     * 修改车类型表
     * 
     * @param mCarType 车类型表
     * @return 结果
     */
    public int updateMCarType(MCarType mCarType);

    /**
     * 批量删除车类型表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMCarTypeByIds(String ids);

    /**
     * 删除车类型表信息
     * 
     * @param carTypeId 车类型表ID
     * @return 结果
     */
    public int deleteMCarTypeById(Long carTypeId);
}
