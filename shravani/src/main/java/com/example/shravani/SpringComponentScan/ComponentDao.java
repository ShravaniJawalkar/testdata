package com.example.shravani.SpringComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDao {
@Autowired
SqlComponentConnection sqlComponentConnection;

public SqlComponentConnection getSqlComponentConnection() {
	return sqlComponentConnection;
}

public void setSqlComponentConnection(SqlComponentConnection sqlComponentConnection) {
	this.sqlComponentConnection = sqlComponentConnection;
}

}
