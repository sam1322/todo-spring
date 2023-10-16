package com.dummyClone.redditClone.Learning_Purpose_Only;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
@RequiredArgsConstructor
@Log
public class HelloService {
    private final DataSource dataSource;

    public void run() {
        log.info("datasource: " + dataSource.toString());

        final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
        restTemplate.execute("select 1");
    }

}
