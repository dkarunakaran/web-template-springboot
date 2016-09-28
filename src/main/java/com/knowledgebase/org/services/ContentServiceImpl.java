package com.knowledgebase.org.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.knowledgebase.org.domain.Content;
import com.knowledgebase.org.repositories.ContentRepository;

@Service
public class ContentServiceImpl implements ContentService {
	
	
	@Autowired
	private ContentRepository contentRepository;
	
	private Content content = null;
	
	@Override
	public boolean save(Map<String, String> details) {
		
		if(details.containsKey("text")){
			content = contentRepository.save(new Content(details.get("text"))); 
		}
		
		return (content != null)?true:false;
	}

}
