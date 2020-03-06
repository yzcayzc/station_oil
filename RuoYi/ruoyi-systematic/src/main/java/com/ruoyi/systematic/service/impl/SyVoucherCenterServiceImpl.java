package com.ruoyi.systematic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.systematic.mapper.SyVoucherCenterMapper;
import com.ruoyi.systematic.domain.SyVoucherCenter;
import com.ruoyi.systematic.service.ISyVoucherCenterService;
import com.ruoyi.common.core.text.Convert;

/**
 * 充值中心Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SyVoucherCenterServiceImpl implements ISyVoucherCenterService 
{
    @Autowired
    private SyVoucherCenterMapper syVoucherCenterMapper;

    /**
     * 查询充值中心
     * 
     * @param voucherId 充值中心ID
     * @return 充值中心
     */
    @Override
    public SyVoucherCenter selectSyVoucherCenterById(Long voucherId)
    {
        return syVoucherCenterMapper.selectSyVoucherCenterById(voucherId);
    }

    /**
     * 查询充值中心列表
     * 
     * @param syVoucherCenter 充值中心
     * @return 充值中心
     */
    @Override
    public List<SyVoucherCenter> selectSyVoucherCenterList(SyVoucherCenter syVoucherCenter)
    {
        return syVoucherCenterMapper.selectSyVoucherCenterList(syVoucherCenter);
    }

    /**
     * 新增充值中心
     * 
     * @param syVoucherCenter 充值中心
     * @return 结果
     */
    @Override
    public int insertSyVoucherCenter(SyVoucherCenter syVoucherCenter)
    {
        return syVoucherCenterMapper.insertSyVoucherCenter(syVoucherCenter);
    }

    /**
     * 修改充值中心
     * 
     * @param syVoucherCenter 充值中心
     * @return 结果
     */
    @Override
    public int updateSyVoucherCenter(SyVoucherCenter syVoucherCenter)
    {
        return syVoucherCenterMapper.updateSyVoucherCenter(syVoucherCenter);
    }

    /**
     * 删除充值中心对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSyVoucherCenterByIds(String ids)
    {
        return syVoucherCenterMapper.deleteSyVoucherCenterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除充值中心信息
     * 
     * @param voucherId 充值中心ID
     * @return 结果
     */
    @Override
    public int deleteSyVoucherCenterById(Long voucherId)
    {
        return syVoucherCenterMapper.deleteSyVoucherCenterById(voucherId);
    }
}
