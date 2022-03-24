package com.ming.abstractservice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class V3Test extends TestBase {

    @DisplayName("v3 - car create")
    @Test
    public void carCreate() throws Exception {

        mockMvc.perform(post("/abstract/v3")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeV3CarRequest())))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", "test name").exists());
    }

    @DisplayName("v3 - company create")
    @Test
    public void companyCreate() throws Exception {

        mockMvc.perform(post("/abstract/v3")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeV3CompanyRequest())))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", "test name").exists());
    }

    @DisplayName("v3 - person create")
    @Test
    public void personCreate() throws Exception {

        mockMvc.perform(post("/abstract/v3")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(makeV3PersonRequest())))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", "test name").exists());
    }
}
