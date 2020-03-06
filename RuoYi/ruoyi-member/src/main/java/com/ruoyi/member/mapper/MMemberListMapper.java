package com.ruoyi.member.mapper;

import com.ruoyi.member.domain.MMemberList;
import java.util.List;

/**
 * 会员列表Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface MMemberListMapper 
{
    /**
     * 查询会员列表
     * 
     * @param memberId 会员列表ID
     * @return 会员列表
     */
    public MMemberList selectMMemberListById(Long memberId);

    /**
     * 查询会员列表列表
     * 
     * @param mMemberList 会员列表
     * @return 会员列表集合
     */
    public List<MMemberList> selectMMemberListList(MMemberList mMemberList);

    /**
     * 新增会员列表
     * 
     * @param mMemberList 会员列表
     * @return 结果
     */
    public int insertMMemberList(MMemberList mMemberList);

    /**
     * 修改会员列表
     * 
     * @param mMemberList 会员列表
     * @return 结果
     */
    public int updateMMemberList(MMemberList mMemberList);

    /**
     * 删除会员列表
     * 
     * @param memberId 会员列表ID
     * @return 结果
     */
    public int deleteMMemberListById(Long memberId);

    /**
     * 批量删除会员列表
     * 
     * @param memberIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMMemberListByIds(String[] memberIds);
}
