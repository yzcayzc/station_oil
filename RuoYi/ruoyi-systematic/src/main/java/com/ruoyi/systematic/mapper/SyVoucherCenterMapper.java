package com.ruoyi.systematic.mapper;

import com.ruoyi.systematic.domain.SyVoucherCenter;
import java.util.List;

/**
 * 充值中心Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface SyVoucherCenterMapper 
{
    /**
     * 查询充值中心
     * 
     * @param voucherId 充值中心ID
     * @return 充值中心
     */
    public SyVoucherCenter selectSyVoucherCenterById(Long voucherId);

    /**
     * 查询充值中心列表
     * 
     * @param syVoucherCenter 充值中心
     * @return 充值中心集合
     */
    public List<SyVoucherCenter> selectSyVoucherCenterList(SyVoucherCenter syVoucherCenter);

    /**
     * 新增充值中心
     * 
     * @param syVoucherCenter 充值中心
     * @return 结果
     */
    public int insertSyVoucherCenter(SyVoucherCenter syVoucherCenter);

    /**
     * 修改充值中心
     * 
     * @param syVoucherCenter 充值中心
     * @return 结果
     */
    public int updateSyVoucherCenter(SyVoucherCenter syVoucherCenter);

    /**
     * 删除充值中心
     * 
     * @param voucherId 充值中心ID
     * @return 结果
     */
    public int deleteSyVoucherCenterById(Long voucherId);

    /**
     * 批量删除充值中心
     * 
     * @param voucherIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSyVoucherCenterByIds(String[] voucherIds);
}
