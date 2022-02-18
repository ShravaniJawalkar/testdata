package com.example.shravani.appprop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PersonUrl {
@Value("${external.service.url}")
private String url;

public String getUrl() {
	return url;
}


}
