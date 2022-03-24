package com.ming.abstractservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class V2Test extends TestBase {

    @DisplayName("v2 - create car")
    @Test
    public void createCar() throws Exception {

        mockMvc.perform(post("/abstract/v2")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeV2Request(makeCarRequest()))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", "test name").exists());

    }

    @DisplayName("v2 - create company")
    @Test
    public void createCompany() throws Exception {

        mockMvc.perform(post("/abstract/v2")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeV2Request(makeCompanyRequest()))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", "test name").exists());

    }

    @DisplayName("v2 - create person")
    @Test
    public void createPerson() throws Exception {

        mockMvc.perform(post("/abstract/v2")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeV2Request(makePersonRequest()))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", "test name").exists());

    }
}
