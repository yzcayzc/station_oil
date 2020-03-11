package com.ruoyi.member.mapper;

import com.ruoyi.member.domain.MCarBrand;
import java.util.List;

/**
 * 车品牌表Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface MCarBrandMapper 
{
    /**
     * 查询车品牌表
     * 
     * @param carBrandId 车品牌表ID
     * @return 车品牌表
     */
    public MCarBrand selectMCarBrandById(Long carBrandId);

    /**
     * 查询车品牌表列表
     * 
     * @param mCarBrand 车品牌表
     * @return 车品牌表集合
     */
    public List<MCarBrand> selectMCarBrandList(MCarBrand mCarBrand);

    /**
     * 新增车品牌表
     * 
     * @param mCarBrand 车品牌表
     * @return 结果
     */
    public int insertMCarBrand(MCarBrand mCarBrand);

    /**
     * 修改车品牌表
     * 
     * @param mCarBrand 车品牌表
     * @return 结果
     */
    public int updateMCarBrand(MCarBrand mCarBrand);

    /**
     * 删除车品牌表
     * 
     * @param carBrandId 车品牌表ID
     * @return 结果
     */
    public int deleteMCarBrandById(Long carBrandId);

    /**
     * 批量删除车品牌表
     * 
     * @param carBrandIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMCarBrandByIds(String[] carBrandIds);
}
