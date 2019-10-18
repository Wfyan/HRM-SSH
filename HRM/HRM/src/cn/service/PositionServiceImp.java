package cn.service;

import java.util.List;

import cn.dao.PositionDaoImp;
import cn.organization.O.Position;

public class PositionServiceImp{
	private Position pay;
	private PositionDaoImp dao;
	//保存一个人员信息
	public boolean save(Position p){
		dao = new PositionDaoImp();
		boolean flag =true;
		try{
			if((dao.addPosition(p))==null){
				flag=false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	//查找所有
	public List<Position> findAll(){
		dao = new PositionDaoImp();
		List<Position> rs = dao.findAll();
		return rs;
	}
	//查找一分类下的所有职位
	public List<Position> findById(String id){
		dao = new PositionDaoImp();
		List<Position> rs = dao.findById(id);
		return rs;
	}
	//根据id查找某一职位
	public Position findByPosId(String id){
		dao = new PositionDaoImp();
		Position rs = dao.findByPosId(id);
		return rs;
	}
}
