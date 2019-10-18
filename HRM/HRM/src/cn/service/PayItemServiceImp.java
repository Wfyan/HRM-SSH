package cn.service;

import java.util.List;

import cn.dao.PayItemDaoImp;
import cn.payPosition.O.PayItem;
import cn.payPosition.O.PayRatio;
import cn.payPosition.O.StandardV;

public class PayItemServiceImp{
	private PayItemDaoImp payDao;
	//保存一个项目
	public boolean save(PayItem p){
		payDao = new PayItemDaoImp();
		boolean flag =true;
		try{
			if((payDao.addPayItem(p))==0){
				flag=false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	//查找所有
	public List<PayItem> findAll(){
		payDao = new PayItemDaoImp();
		List<PayItem> rs = payDao.findAll();
		return rs;
	}
	//根据id查找项目
	public PayItem findById(int id){
		payDao = new PayItemDaoImp();
		PayItem pay = payDao.findById(id);
		return pay;
	}
	//查询所有薪酬标准
	public List<StandardV> findAllStandard(){
		payDao = new PayItemDaoImp();
		List<StandardV> rs = payDao.findAllStandard();
		return rs;
	}
	//查询与一职业id有关的薪酬标准
	public List<PayRatio> findByPosId(String id){
		payDao = new PayItemDaoImp();
		List<PayRatio> rs = payDao.findByPosId(id);
		return rs;
	}
	//删除某一职业id关联的项目
	public int deleteByPosId(String id){
		payDao = new PayItemDaoImp();
		int rs = payDao.deleteByPosId(id);
		return rs;
	}
	//登记薪酬标准
	public boolean addPayRaio(PayRatio p){
		payDao = new PayItemDaoImp();
		boolean flag = true;
		if((payDao.addPayRaio(p))==0){
			flag=false;
		}
		return flag;
	}
	
}
