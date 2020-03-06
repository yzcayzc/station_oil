package com.ruoyi.announcement.service;

import com.ruoyi.announcement.domain.AAnnouncementList;
import java.util.List;

/**
 * 公告列表Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IAAnnouncementListService 
{
    /**
     * 查询公告列表
     * 
     * @param announcementId 公告列表ID
     * @return 公告列表
     */
    public AAnnouncementList selectAAnnouncementListById(Long announcementId);

    /**
     * 查询公告列表列表
     * 
     * @param aAnnouncementList 公告列表
     * @return 公告列表集合
     */
    public List<AAnnouncementList> selectAAnnouncementListList(AAnnouncementList aAnnouncementList);

    /**
     * 新增公告列表
     * 
     * @param aAnnouncementList 公告列表
     * @return 结果
     */
    public int insertAAnnouncementList(AAnnouncementList aAnnouncementList);

    /**
     * 修改公告列表
     * 
     * @param aAnnouncementList 公告列表
     * @return 结果
     */
    public int updateAAnnouncementList(AAnnouncementList aAnnouncementList);

    /**
     * 批量删除公告列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAAnnouncementListByIds(String ids);

    /**
     * 删除公告列表信息
     * 
     * @param announcementId 公告列表ID
     * @return 结果
     */
    public int deleteAAnnouncementListById(Long announcementId);
}
