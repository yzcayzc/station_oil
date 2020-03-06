package com.ruoyi.station.mapper;

import com.ruoyi.station.domain.SOldOilprice;
import java.util.List;

/**
 * 历史油价Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface SOldOilpriceMapper 
{
    /**
     * 查询历史油价
     * 
     * @param oldOilId 历史油价ID
     * @return 历史油价
     */
    public SOldOilprice selectSOldOilpriceById(Long oldOilId);

    /**
     * 查询历史油价列表
     * 
     * @param sOldOilprice 历史油价
     * @return 历史油价集合
     */
    public List<SOldOilprice> selectSOldOilpriceList(SOldOilprice sOldOilprice);

    /**
     * 新增历史油价
     * 
     * @param sOldOilprice 历史油价
     * @return 结果
     */
    public int insertSOldOilprice(SOldOilprice sOldOilprice);

    /**
     * 修改历史油价
     * 
     * @param sOldOilprice 历史油价
     * @return 结果
     */
    public int updateSOldOilprice(SOldOilprice sOldOilprice);

    /**
     * 删除历史油价
     * 
     * @param oldOilId 历史油价ID
     * @return 结果
     */
    public int deleteSOldOilpriceById(Long oldOilId);

    /**
     * 批量删除历史油价
     * 
     * @param oldOilIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSOldOilpriceByIds(String[] oldOilIds);
}
