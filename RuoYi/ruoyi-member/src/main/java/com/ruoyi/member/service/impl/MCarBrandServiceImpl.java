package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MCarBrandMapper;
import com.ruoyi.member.domain.MCarBrand;
import com.ruoyi.member.service.IMCarBrandService;
import com.ruoyi.common.core.text.Convert;

/**
 * 车品牌表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class MCarBrandServiceImpl implements IMCarBrandService 
{
    @Autowired
    private MCarBrandMapper mCarBrandMapper;

    /**
     * 查询车品牌表
     * 
     * @param carBrandId 车品牌表ID
     * @return 车品牌表
     */
    @Override
    public MCarBrand selectMCarBrandById(Long carBrandId)
    {
        return mCarBrandMapper.selectMCarBrandById(carBrandId);
    }

    /**
     * 查询车品牌表列表
     * 
     * @param mCarBrand 车品牌表
     * @return 车品牌表
     */
    @Override
    public List<MCarBrand> selectMCarBrandList(MCarBrand mCarBrand)
    {
        return mCarBrandMapper.selectMCarBrandList(mCarBrand);
    }

    /**
     * 新增车品牌表
     * 
     * @param mCarBrand 车品牌表
     * @return 结果
     */
    @Override
    public int insertMCarBrand(MCarBrand mCarBrand)
    {
        return mCarBrandMapper.insertMCarBrand(mCarBrand);
    }

    /**
     * 修改车品牌表
     * 
     * @param mCarBrand 车品牌表
     * @return 结果
     */
    @Override
    public int updateMCarBrand(MCarBrand mCarBrand)
    {
        return mCarBrandMapper.updateMCarBrand(mCarBrand);
    }

    /**
     * 删除车品牌表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMCarBrandByIds(String ids)
    {
        return mCarBrandMapper.deleteMCarBrandByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除车品牌表信息
     * 
     * @param carBrandId 车品牌表ID
     * @return 结果
     */
    @Override
    public int deleteMCarBrandById(Long carBrandId)
    {
        return mCarBrandMapper.deleteMCarBrandById(carBrandId);
    }
}
