package com.ruoyi.census.service;

import com.ruoyi.census.domain.CNewMember;
import java.util.List;

/**
 * 新会员成长率Service接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface ICNewMemberService 
{
    /**
     * 查询新会员成长率
     * 
     * @param memberId 新会员成长率ID
     * @return 新会员成长率
     */
    public CNewMember selectCNewMemberById(Long memberId);

    /**
     * 查询新会员成长率列表
     * 
     * @param cNewMember 新会员成长率
     * @return 新会员成长率集合
     */
    public List<CNewMember> selectCNewMemberList(CNewMember cNewMember);

    /**
     * 新增新会员成长率
     * 
     * @param cNewMember 新会员成长率
     * @return 结果
     */
    public int insertCNewMember(CNewMember cNewMember);

    /**
     * 修改新会员成长率
     * 
     * @param cNewMember 新会员成长率
     * @return 结果
     */
    public int updateCNewMember(CNewMember cNewMember);

    /**
     * 批量删除新会员成长率
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCNewMemberByIds(String ids);

    /**
     * 删除新会员成长率信息
     * 
     * @param memberId 新会员成长率ID
     * @return 结果
     */
    public int deleteCNewMemberById(Long memberId);
}
