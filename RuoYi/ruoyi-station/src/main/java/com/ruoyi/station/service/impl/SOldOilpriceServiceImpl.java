package com.ruoyi.station.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.station.mapper.SOldOilpriceMapper;
import com.ruoyi.station.domain.SOldOilprice;
import com.ruoyi.station.service.ISOldOilpriceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 历史油价Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SOldOilpriceServiceImpl implements ISOldOilpriceService 
{
    @Autowired
    private SOldOilpriceMapper sOldOilpriceMapper;

    /**
     * 查询历史油价
     * 
     * @param oldOilId 历史油价ID
     * @return 历史油价
     */
    @Override
    public SOldOilprice selectSOldOilpriceById(Long oldOilId)
    {
        return sOldOilpriceMapper.selectSOldOilpriceById(oldOilId);
    }

    /**
     * 查询历史油价列表
     * 
     * @param sOldOilprice 历史油价
     * @return 历史油价
     */
    @Override
    public List<SOldOilprice> selectSOldOilpriceList(SOldOilprice sOldOilprice)
    {
        return sOldOilpriceMapper.selectSOldOilpriceList(sOldOilprice);
    }

    /**
     * 新增历史油价
     * 
     * @param sOldOilprice 历史油价
     * @return 结果
     */
    @Override
    public int insertSOldOilprice(SOldOilprice sOldOilprice)
    {

        return sOldOilpriceMapper.insertSOldOilprice(sOldOilprice);
    }

    /**
     * 修改历史油价
     * 
     * @param sOldOilprice 历史油价
     * @return 结果
     */
    @Override
    public int updateSOldOilprice(SOldOilprice sOldOilprice)
    {
        return sOldOilpriceMapper.updateSOldOilprice(sOldOilprice);
    }

    /**
     * 删除历史油价对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSOldOilpriceByIds(String ids)
    {
        return sOldOilpriceMapper.deleteSOldOilpriceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除历史油价信息
     * 
     * @param oldOilId 历史油价ID
     * @return 结果
     */
    @Override
    public int deleteSOldOilpriceById(Long oldOilId)
    {
        return sOldOilpriceMapper.deleteSOldOilpriceById(oldOilId);
    }
}
