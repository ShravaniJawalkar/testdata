package com.example.shravani.springtutorial;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Named
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ManDao {
@Inject
private SqlConnection sqlConnection;

public SqlConnection getSqlConnection() {
	return sqlConnection;
}

public void setSqlConnection(SqlConnection sqlConnection) {
	this.sqlConnection = sqlConnection;
}

}
