package com.A1.Task3;

import com.A1.Task3.domain.LoginsA1;
import com.A1.Task3.repos.LoginsRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private LoginsRepo loginsRepo;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        for (long i = 1; i <= 16; i++) {
            if (loginsRepo.findById(i).isPresent()) {
                assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/logins",
                        String.class)).contains(loginsRepo.findById(i).get().getAppAccountName());
            }
        }
    }
}
