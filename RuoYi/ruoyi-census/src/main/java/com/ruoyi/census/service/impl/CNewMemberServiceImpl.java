package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CNewMemberMapper;
import com.ruoyi.census.domain.CNewMember;
import com.ruoyi.census.service.ICNewMemberService;
import com.ruoyi.common.core.text.Convert;

/**
 * 新会员成长率Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CNewMemberServiceImpl implements ICNewMemberService 
{
    @Autowired
    private CNewMemberMapper cNewMemberMapper;

    /**
     * 查询新会员成长率
     * 
     * @param memberId 新会员成长率ID
     * @return 新会员成长率
     */
    @Override
    public CNewMember selectCNewMemberById(Long memberId)
    {
        return cNewMemberMapper.selectCNewMemberById(memberId);
    }

    /**
     * 查询新会员成长率列表
     * 
     * @param cNewMember 新会员成长率
     * @return 新会员成长率
     */
    @Override
    public List<CNewMember> selectCNewMemberList(CNewMember cNewMember)
    {
        return cNewMemberMapper.selectCNewMemberList(cNewMember);
    }

    /**
     * 新增新会员成长率
     * 
     * @param cNewMember 新会员成长率
     * @return 结果
     */
    @Override
    public int insertCNewMember(CNewMember cNewMember)
    {
        return cNewMemberMapper.insertCNewMember(cNewMember);
    }

    /**
     * 修改新会员成长率
     * 
     * @param cNewMember 新会员成长率
     * @return 结果
     */
    @Override
    public int updateCNewMember(CNewMember cNewMember)
    {
        return cNewMemberMapper.updateCNewMember(cNewMember);
    }

    /**
     * 删除新会员成长率对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCNewMemberByIds(String ids)
    {
        return cNewMemberMapper.deleteCNewMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新会员成长率信息
     * 
     * @param memberId 新会员成长率ID
     * @return 结果
     */
    @Override
    public int deleteCNewMemberById(Long memberId)
    {
        return cNewMemberMapper.deleteCNewMemberById(memberId);
    }
}
