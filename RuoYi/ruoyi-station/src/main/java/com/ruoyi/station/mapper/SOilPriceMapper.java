package com.ruoyi.station.mapper;

import com.ruoyi.station.domain.SOilPrice;
import java.util.List;

/**
 * 油价信息设置Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface SOilPriceMapper 
{
    /**
     * 查询油价信息设置
     * 
     * @param oilId 油价信息设置ID
     * @return 油价信息设置
     */
    public SOilPrice selectSOilPriceById(Long oilId);

    /**
     * 查询油价信息设置列表
     * 
     * @param sOilPrice 油价信息设置
     * @return 油价信息设置集合
     */
    public List<SOilPrice> selectSOilPriceList(SOilPrice sOilPrice);

    /**
     * 新增油价信息设置
     * 
     * @param sOilPrice 油价信息设置
     * @return 结果
     */
    public int insertSOilPrice(SOilPrice sOilPrice);

    /**
     * 修改油价信息设置
     * 
     * @param sOilPrice 油价信息设置
     * @return 结果
     */
    public int updateSOilPrice(SOilPrice sOilPrice);

    /**
     * 删除油价信息设置
     * 
     * @param oilId 油价信息设置ID
     * @return 结果
     */
    public int deleteSOilPriceById(Long oilId);

    /**
     * 批量删除油价信息设置
     * 
     * @param oilIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSOilPriceByIds(String[] oilIds);
}
