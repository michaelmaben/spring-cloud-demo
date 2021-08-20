package com.jeevanmaben.storeorderserviceapi.controller;

import com.jeevanmaben.storeorderserviceapi.domain.Customer;
import com.jeevanmaben.storeorderserviceapi.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class CustomerControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    CustomerService customerService;

    @Test
    public void getCustomerById() throws Exception{
        //given
        given(customerService.getCustomer(anyLong())).willReturn(
                java.util.Optional.ofNullable(Customer.builder()
                        .id(1l)
                        .type("online")
                        .build())
        );
        //when //then
        mockMvc.perform(get("/orders/api/customers/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id").value("1"))
                .andExpect(jsonPath("type").value("online"));

    }

    @Test
    public void searchForNonExistentCustomer() throws Exception{
        //given
        given(customerService.getCustomer(anyLong())).willReturn(
                java.util.Optional.ofNullable(null)
        );
        //when  //then
        mockMvc.perform(get("/orders/api/customers/123"))
                .andExpect(status().isNotFound());
    }
}
