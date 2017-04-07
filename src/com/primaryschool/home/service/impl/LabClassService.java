package com.primaryschool.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primaryschool.home.dao.ILabClassDao;
import com.primaryschool.home.service.ILabClassService;

@Service
public class LabClassService<T> implements ILabClassService<T> {

	@Autowired
	private ILabClassDao<T>  labClassDao;
	
	@Override
	public List<T> findLabClassListInfo() {
		// TODO Auto-generated method stub
		return labClassDao.findLabClassListInfo();
	}

	@Override
	public T findLabClassIntroduce(int id) {
		// TODO Auto-generated method stub
		return (T)labClassDao.findLabClassIntroduce(id);
	}

	@Override
	public List<T> findLabClassContent(int id,String flag, int position, int item_per_page) {
		// TODO Auto-generated method stub
		return labClassDao.findLabClassContent(id,flag, position, item_per_page);
	}

	@Override
	public T findLabClassNameById(int id) {
		// TODO Auto-generated method stub
		return labClassDao.findLabClassNameById(id);
	}

	@Override
	public List<T> findHotLabClassContent(int id, String flag, int position, int item_per_page) {
		// TODO Auto-generated method stub
		return labClassDao.findHotLabClassContent(id, flag, position, item_per_page);
	}

	@Override
	public boolean addViewCount(int id) {
		// TODO Auto-generated method stub
		return labClassDao.addViewCount(id);
	}

	@Override
	public int findLabClassContentCount(String flag) {
		// TODO Auto-generated method stub
		return labClassDao.findLabClassContentCount(flag);
	}

}