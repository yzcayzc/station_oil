package com.ruoyi.station.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ruoyi.station.domain.SOldOilprice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.station.mapper.SOilPriceMapper;
import com.ruoyi.station.domain.SOilPrice;
import com.ruoyi.station.service.ISOilPriceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 油价信息设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SOilPriceServiceImpl implements ISOilPriceService 
{
    @Autowired
    private SOilPriceMapper sOilPriceMapper;

    @Autowired
    private SOldOilpriceServiceImpl sOldOilpriceService;

    /**
     * 查询油价信息设置
     * 
     * @param oilId 油价信息设置ID
     * @return 油价信息设置
     */
    @Override
    public SOilPrice selectSOilPriceById(Long oilId)
    {
        return sOilPriceMapper.selectSOilPriceById(oilId);
    }

    /**
     * 查询油价信息设置列表
     * 
     * @param sOilPrice 油价信息设置
     * @return 油价信息设置
     */
    @Override
    public List<SOilPrice> selectSOilPriceList(SOilPrice sOilPrice)
    {
        return sOilPriceMapper.selectSOilPriceList(sOilPrice);
    }

    /**
     * 新增油价信息设置
     * 
     * @param sOilPrice 油价信息设置
     * @return 结果
     */
    @Override
    public int insertSOilPrice(SOilPrice sOilPrice)
    {
        return sOilPriceMapper.insertSOilPrice(sOilPrice);
    }

    /**
     * 修改油价信息设置
     * 
     * @param sOilPrice 油价信息设置
     * @return 结果
     */
    @Override
    public int updateSOilPrice(SOilPrice sOilPrice)
    {
        SOldOilprice sOldOilprice = new SOldOilprice();
        Date oilStartTime = sOilPrice.getOilStartTime();
        Date oilEndTime = sOilPrice.getOilEndTime();
        long daysBetween=(oilEndTime.getTime()-oilStartTime.getTime())/(60*60*24*1000);
        int h = 86400000;
        for (int i = 0;i<=daysBetween;i++){
            sOldOilprice.setPrice(sOilPrice.getPrice());
            sOldOilprice.setOils(sOilPrice.getOils());
            sOldOilprice.setOilNumber(sOilPrice.getOilNumber());
            sOldOilprice.setName(sOilPrice.getName());
            long l = oilStartTime.getTime() + h;
            oilStartTime.setTime(l);
            sOldOilprice.setQueryTime(oilStartTime);
            sOldOilpriceService.insertSOldOilprice(sOldOilprice);
        }
        return sOilPriceMapper.updateSOilPrice(sOilPrice);
    }

    /**
     * 删除油价信息设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSOilPriceByIds(String ids)
    {
        return sOilPriceMapper.deleteSOilPriceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除油价信息设置信息
     * 
     * @param oilId 油价信息设置ID
     * @return 结果
     */
    @Override
    public int deleteSOilPriceById(Long oilId)
    {
        return sOilPriceMapper.deleteSOilPriceById(oilId);
    }
}
