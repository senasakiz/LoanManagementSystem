package com.example.demo.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.concretes.BlackList;

public interface IBlackListService {
	List<BlackList> getAll();
	Optional<BlackList> getById(BlackList blackList);
	public BlackList addToBlackList(BlackList blackList);
	

}
