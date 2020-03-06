package com.ruoyi.shop.mapper;

import com.ruoyi.shop.domain.IPointsMallManagement;
import java.util.List;

/**
 * 积分商城管理Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IPointsMallManagementMapper 
{
    /**
     * 查询积分商城管理
     * 
     * @param goodsId 积分商城管理ID
     * @return 积分商城管理
     */
    public IPointsMallManagement selectIPointsMallManagementById(Long goodsId);

    /**
     * 查询积分商城管理列表
     * 
     * @param iPointsMallManagement 积分商城管理
     * @return 积分商城管理集合
     */
    public List<IPointsMallManagement> selectIPointsMallManagementList(IPointsMallManagement iPointsMallManagement);

    /**
     * 新增积分商城管理
     * 
     * @param iPointsMallManagement 积分商城管理
     * @return 结果
     */
    public int insertIPointsMallManagement(IPointsMallManagement iPointsMallManagement);

    /**
     * 修改积分商城管理
     * 
     * @param iPointsMallManagement 积分商城管理
     * @return 结果
     */
    public int updateIPointsMallManagement(IPointsMallManagement iPointsMallManagement);

    /**
     * 删除积分商城管理
     * 
     * @param goodsId 积分商城管理ID
     * @return 结果
     */
    public int deleteIPointsMallManagementById(Long goodsId);

    /**
     * 批量删除积分商城管理
     * 
     * @param goodsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteIPointsMallManagementByIds(String[] goodsIds);
}
