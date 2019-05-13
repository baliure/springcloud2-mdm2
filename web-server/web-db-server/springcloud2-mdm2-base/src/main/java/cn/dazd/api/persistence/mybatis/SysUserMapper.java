package cn.dazd.api.persistence.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.dazd.entity.base.SysUser;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserMapper extends Mapper<SysUser>{

	@Select("SELECT user_Id userId,loginname,ownername from sys_user where loginname LIKE CONCAT('%',#{name},'%')")
	List<SysUser> selectByLoginname(@Param("name")String name);
}
