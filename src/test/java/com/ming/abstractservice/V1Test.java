package com.ming.abstractservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class V1Test extends TestBase {

    @DisplayName("v1 - car create")
    @Test
    public void v1CarCreate() throws Exception {

        mockMvc.perform(post("/car")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeCarRequest())))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.carName", "test name").exists());
    }

    @DisplayName("v1 - create company")
    @Test
    public void v1CompanyCreate() throws Exception {

        mockMvc.perform(post("/company")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeCompanyRequest())))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.companyName", "test name").exists());
    }

    @DisplayName("v1 - create person")
    @Test
    public void v1PersonCreate() throws Exception {

        mockMvc.perform(post("/person")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makePersonRequest())))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.personName", "test name").exists());
    }
}
