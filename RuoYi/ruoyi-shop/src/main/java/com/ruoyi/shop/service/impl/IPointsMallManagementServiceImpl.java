package com.ruoyi.shop.service.impl;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.IPointsMallManagementMapper;
import com.ruoyi.shop.domain.IPointsMallManagement;
import com.ruoyi.shop.service.IIPointsMallManagementService;
import com.ruoyi.common.core.text.Convert;

/**
 * 积分商城管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class IPointsMallManagementServiceImpl implements IIPointsMallManagementService 
{
    @Autowired
    private IPointsMallManagementMapper iPointsMallManagementMapper;

    /**
     * 查询积分商城管理
     * 
     * @param goodsId 积分商城管理ID
     * @return 积分商城管理
     */
    @Override
    public IPointsMallManagement selectIPointsMallManagementById(Long goodsId)
    {
        return iPointsMallManagementMapper.selectIPointsMallManagementById(goodsId);
    }

    /**
     * 查询积分商城管理列表
     * 
     * @param iPointsMallManagement 积分商城管理
     * @return 积分商城管理
     */
    @Override
    public List<IPointsMallManagement> selectIPointsMallManagementList(IPointsMallManagement iPointsMallManagement)
    {
        List<IPointsMallManagement> iPointsMallManagements = iPointsMallManagementMapper.selectIPointsMallManagementList(iPointsMallManagement);
        for (IPointsMallManagement pointsMallManagement : iPointsMallManagements) {
            String goodsImage = pointsMallManagement.getGoodsImage();
            pointsMallManagement.setGoodsImage("["+goodsImage+"]");
           /* String[] split = goodsImage.split(",");
            StringBuffer sb = new StringBuffer();
            sb.append("[");
            for(int i = 0; i < split.length; i++){
                //遍历出来的数据，用逗号隔开
                sb. append(split[i]+",");
            }
            sb.deleteCharAt(sb.length() - 1); //去除最后一个逗号
            sb.append("]");
            String str = sb.toString();
            pointsMallManagement.setGoodsImage(str);*/
        }
        return iPointsMallManagements;
    }

    /**
     * 新增积分商城管理
     * 
     * @param iPointsMallManagement 积分商城管理
     * @return 结果
     */
    @Override
    public int insertIPointsMallManagement(IPointsMallManagement iPointsMallManagement)
    {
        return iPointsMallManagementMapper.insertIPointsMallManagement(iPointsMallManagement);
    }

    /**
     * 修改积分商城管理
     * 
     * @param iPointsMallManagement 积分商城管理
     * @return 结果
     */
    @Override
    public int updateIPointsMallManagement(IPointsMallManagement iPointsMallManagement)
    {
        return iPointsMallManagementMapper.updateIPointsMallManagement(iPointsMallManagement);
    }

    /**
     * 删除积分商城管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIPointsMallManagementByIds(String ids)
    {
        return iPointsMallManagementMapper.deleteIPointsMallManagementByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除积分商城管理信息
     * 
     * @param goodsId 积分商城管理ID
     * @return 结果
     */
    @Override
    public int deleteIPointsMallManagementById(Long goodsId)
    {
        return iPointsMallManagementMapper.deleteIPointsMallManagementById(goodsId);
    }
}
