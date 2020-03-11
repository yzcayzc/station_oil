package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MCarTypeMapper;
import com.ruoyi.member.domain.MCarType;
import com.ruoyi.member.service.IMCarTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 车类型表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class MCarTypeServiceImpl implements IMCarTypeService 
{
    @Autowired
    private MCarTypeMapper mCarTypeMapper;

    /**
     * 查询车类型表
     * 
     * @param carTypeId 车类型表ID
     * @return 车类型表
     */
    @Override
    public MCarType selectMCarTypeById(Long carTypeId)
    {
        return mCarTypeMapper.selectMCarTypeById(carTypeId);
    }

    /**
     * 查询车类型表列表
     * 
     * @param mCarType 车类型表
     * @return 车类型表
     */
    @Override
    public List<MCarType> selectMCarTypeList(MCarType mCarType)
    {
        return mCarTypeMapper.selectMCarTypeList(mCarType);
    }

    /**
     * 新增车类型表
     * 
     * @param mCarType 车类型表
     * @return 结果
     */
    @Override
    public int insertMCarType(MCarType mCarType)
    {
        return mCarTypeMapper.insertMCarType(mCarType);
    }

    /**
     * 修改车类型表
     * 
     * @param mCarType 车类型表
     * @return 结果
     */
    @Override
    public int updateMCarType(MCarType mCarType)
    {
        return mCarTypeMapper.updateMCarType(mCarType);
    }

    /**
     * 删除车类型表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMCarTypeByIds(String ids)
    {
        return mCarTypeMapper.deleteMCarTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除车类型表信息
     * 
     * @param carTypeId 车类型表ID
     * @return 结果
     */
    @Override
    public int deleteMCarTypeById(Long carTypeId)
    {
        return mCarTypeMapper.deleteMCarTypeById(carTypeId);
    }
}
