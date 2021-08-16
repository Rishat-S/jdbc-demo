package com.example.jdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class CommandLineApp implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet("select * from customers");
        while (sqlRowSet.next()) {
            System.out.println(sqlRowSet.getInt("id"));
        }
    }
}
