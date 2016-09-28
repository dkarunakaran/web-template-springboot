package com.knowledgebase.org.api.v1;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.knowledgebase.org.services.ContentService;

@RestController
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping(value="/api/v1/save-content", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean saveContent(){
		Map<String, String> details = new HashMap<String, String>();
		details.put("text", "This is the first text");
		return contentService.save(details);
	}
}
