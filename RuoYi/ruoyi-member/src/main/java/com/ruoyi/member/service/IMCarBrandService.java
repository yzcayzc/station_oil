package com.ruoyi.member.service;

import com.ruoyi.member.domain.MCarBrand;
import java.util.List;

/**
 * 车品牌表Service接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface IMCarBrandService 
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
     * 批量删除车品牌表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMCarBrandByIds(String ids);

    /**
     * 删除车品牌表信息
     * 
     * @param carBrandId 车品牌表ID
     * @return 结果
     */
    public int deleteMCarBrandById(Long carBrandId);
}
