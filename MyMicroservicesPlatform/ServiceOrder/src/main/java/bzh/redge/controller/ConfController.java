package bzh.redge.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfController {

	@Value("${myVarInGit}")
    String myVarInGit;
	
	@RequestMapping("/myVar")
	public String myVarInGit() {
		return myVarInGit;
	}
	
}
