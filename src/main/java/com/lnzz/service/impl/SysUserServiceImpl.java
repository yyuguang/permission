package com.lnzz.service.impl;

import com.google.common.base.Preconditions;
import com.lnzz.beans.PageQuery;
import com.lnzz.beans.PageResult;
import com.lnzz.dao.SysUserMapper;
import com.lnzz.exception.ParamException;
import com.lnzz.param.UserParam;
import com.lnzz.pojo.SysUser;
import com.lnzz.service.SysUserService;
import com.lnzz.utils.BeanValidator;
import com.lnzz.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * ClassName：SysUserServiceImpl
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/6 14:25
 * @Description:
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void save(UserParam param) {
        BeanValidator.check(param);
        if (checkTelPhoneExist(param.getTelephone(), param.getId())) {
            throw new ParamException("该手机号码已被占用");
        }
        if (checkEmailExist(param.getMail(), param.getId())) {
            throw new ParamException("该邮箱已被占用");
        }

        String password = "12345678";
        String encryptedPassword = Md5Util.encrypt(password);
        SysUser user = SysUser.builder().username(param.getUsername()).mail(param.getMail()).password(encryptedPassword).telephone(param.getTelephone())
                .status(param.getStatus()).deptId(param.getDeptId()).remark(param.getRemark()).build();

        user.setOperator("system-update");
        user.setOperateIp("127.0.0.1");
        user.setOperateTime(new Date());

        //todo send Email
        sysUserMapper.insertSelective(user);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void update(UserParam param) {
        BeanValidator.check(param);
        if (checkTelPhoneExist(param.getTelephone(), param.getId())) {
            throw new ParamException("该手机号码已被占用");
        }
        if (checkEmailExist(param.getMail(), param.getId())) {
            throw new ParamException("该邮箱已被占用");
        }

        SysUser before = sysUserMapper.selectByPrimaryKey(param.getId());
        Preconditions.checkNotNull(before, "待更新的用户不存在");

        SysUser after = SysUser.builder().id(param.getId()).username(param.getUsername()).mail(param.getMail()).telephone(param.getTelephone())
                .status(param.getStatus()).deptId(param.getDeptId()).remark(param.getRemark()).build();

        sysUserMapper.updateByPrimaryKeySelective(after);
    }

    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
    @Override
    public SysUser findByKeyWord(String keyword) {
        return sysUserMapper.findByKeyWord(keyword);
    }

    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
    @Override
    public PageResult<SysUser> getPageByDeptId(int deptId, PageQuery pageQuery) {
        BeanValidator.check(pageQuery);
        int count = sysUserMapper.countByDeptId(deptId);
        if (count > 0) {
            List<SysUser> list = sysUserMapper.getPageByDeptId(deptId, pageQuery);
            return PageResult.<SysUser>builder().total(count).data(list).build();
        }
        return PageResult.<SysUser>builder().build();
    }

    private boolean checkEmailExist(String mail, Integer userId) {
        return sysUserMapper.countByMail(mail, userId) > 0;
    }

    private boolean checkTelPhoneExist(String phone, Integer userId) {
        return sysUserMapper.countByTelephone(phone, userId) > 0;
    }
}
