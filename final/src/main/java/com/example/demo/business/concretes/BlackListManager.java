package com.example.demo.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.IBlackListService;
import com.example.demo.dataaccess.concretes.BlackListRepository;
import com.example.demo.entities.concretes.BlackList;

@Service
public class BlackListManager implements IBlackListService {
	
	@Autowired
	private BlackListRepository blackListRepository;

	@Override
	public List<BlackList> getAll() {
		return blackListRepository.findAll();
	}

	@Override
	public Optional<BlackList> getById(BlackList blackList) {
		int customerId=blackList.getCustomerId();
		return blackListRepository.findById(customerId);
	}

	@Override
	public BlackList addToBlackList(BlackList blackList) {
		return blackListRepository.save(blackList);
	}

}
