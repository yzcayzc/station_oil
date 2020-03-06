package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MMemberListMapper;
import com.ruoyi.member.domain.MMemberList;
import com.ruoyi.member.service.IMMemberListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 会员列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class MMemberListServiceImpl implements IMMemberListService 
{
    @Autowired
    private MMemberListMapper mMemberListMapper;

    /**
     * 查询会员列表
     * 
     * @param memberId 会员列表ID
     * @return 会员列表
     */
    @Override
    public MMemberList selectMMemberListById(Long memberId)
    {
        return mMemberListMapper.selectMMemberListById(memberId);
    }

    /**
     * 查询会员列表列表
     * 
     * @param mMemberList 会员列表
     * @return 会员列表
     */
    @Override
    public List<MMemberList> selectMMemberListList(MMemberList mMemberList)
    {
        return mMemberListMapper.selectMMemberListList(mMemberList);
    }

    /**
     * 新增会员列表
     * 
     * @param mMemberList 会员列表
     * @return 结果
     */
    @Override
    public int insertMMemberList(MMemberList mMemberList)
    {
        return mMemberListMapper.insertMMemberList(mMemberList);
    }

    /**
     * 修改会员列表
     * 
     * @param mMemberList 会员列表
     * @return 结果
     */
    @Override
    public int updateMMemberList(MMemberList mMemberList)
    {
        return mMemberListMapper.updateMMemberList(mMemberList);
    }

    /**
     * 删除会员列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMMemberListByIds(String ids)
    {
        return mMemberListMapper.deleteMMemberListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除会员列表信息
     * 
     * @param memberId 会员列表ID
     * @return 结果
     */
    @Override
    public int deleteMMemberListById(Long memberId)
    {
        return mMemberListMapper.deleteMMemberListById(memberId);
    }
}
