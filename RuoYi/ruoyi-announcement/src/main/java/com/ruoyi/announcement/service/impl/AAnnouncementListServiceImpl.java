package com.ruoyi.announcement.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.announcement.mapper.AAnnouncementListMapper;
import com.ruoyi.announcement.domain.AAnnouncementList;
import com.ruoyi.announcement.service.IAAnnouncementListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公告列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class AAnnouncementListServiceImpl implements IAAnnouncementListService 
{
    @Autowired
    private AAnnouncementListMapper aAnnouncementListMapper;

    /**
     * 查询公告列表
     * 
     * @param announcementId 公告列表ID
     * @return 公告列表
     */
    @Override
    public AAnnouncementList selectAAnnouncementListById(Long announcementId)
    {
        return aAnnouncementListMapper.selectAAnnouncementListById(announcementId);
    }

    /**
     * 查询公告列表列表
     * 
     * @param aAnnouncementList 公告列表
     * @return 公告列表
     */
    @Override
    public List<AAnnouncementList> selectAAnnouncementListList(AAnnouncementList aAnnouncementList)
    {
        return aAnnouncementListMapper.selectAAnnouncementListList(aAnnouncementList);
    }

    /**
     * 新增公告列表
     * 
     * @param aAnnouncementList 公告列表
     * @return 结果
     */
    @Override
    public int insertAAnnouncementList(AAnnouncementList aAnnouncementList)
    {
        return aAnnouncementListMapper.insertAAnnouncementList(aAnnouncementList);
    }

    /**
     * 修改公告列表
     * 
     * @param aAnnouncementList 公告列表
     * @return 结果
     */
    @Override
    public int updateAAnnouncementList(AAnnouncementList aAnnouncementList)
    {
        return aAnnouncementListMapper.updateAAnnouncementList(aAnnouncementList);
    }

    /**
     * 删除公告列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAAnnouncementListByIds(String ids)
    {
        return aAnnouncementListMapper.deleteAAnnouncementListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公告列表信息
     * 
     * @param announcementId 公告列表ID
     * @return 结果
     */
    @Override
    public int deleteAAnnouncementListById(Long announcementId)
    {
        return aAnnouncementListMapper.deleteAAnnouncementListById(announcementId);
    }
}
