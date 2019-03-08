/*
package nl.tue.base.customer.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import nl.tue.base.customerdto.dto.AddressDto;
import nl.tue.base.customerdto.dto.IranianCustomerDto;
import nl.tue.base.customerservice.service.IranianCustomerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IranianCustomerApiTest {

    @Autowired
    IranianCustomerService customerService;
    IranianCustomerDto iranianCustomerDto;
    private Logger logger = LoggerFactory.getLogger(IranianCustomerApiTest.class);
    @Autowired
    private MockMvc mockMvc;

    @Before
    public void beforeTest() {
        iranianCustomerDto = new IranianCustomerDto();
        AddressDto addressDto = new AddressDto();
        addressDto.setCity("Tehran");
        addressDto.setProvince("Tehran");
        iranianCustomerDto.setAddress(addressDto);
        iranianCustomerDto.setBirthPlace("Iran");
        iranianCustomerDto.setBirthDate(LocalDate.of(2018, 11, 21));
        iranianCustomerDto.setFirstName("Alireza");
        iranianCustomerDto.setLastName("ahmadi");
        iranianCustomerDto.setNationalId("1111111111");
      iranianCustomerDto= customerService.save(iranianCustomerDto);

    }


    private String asJsonString(final Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-mm-dd"));
        String json = null;
        try {
            json = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }
        return json;
    }

    @Test
    public void createIranianCustomer() {
        IranianCustomerDto customer = new IranianCustomerDto();
        AddressDto addressDto = new AddressDto();
        addressDto.setCity("Tehran");
        addressDto.setProvince("Tehran");
        customer.setAddress(addressDto);
        customer.setBirthPlace("Iran");
        customer.setBirthDate(LocalDate.of(2018, 11, 21));
        customer.setFirstName("Alireza");
        customer.setLastName("ahmadi");

        logger.info("CUSTOMER { \n" + asJsonString(customer) + " \n}");
        try {
            mockMvc.perform(
                    post("/iranianCustomer")
                            .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                            .content(asJsonString(customer)))
                    .andExpect(status().isOk())
                    .andExpect(content().string(asJsonString(customer)));

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        customerService.delete(iranianCustomerDto.getId());
    }

    @Test
    public void deleteIranianPerson() {

        try {
            mockMvc.perform(
                    delete("/iranianCustomer/{iranianCustomerId}", iranianCustomerDto.getId()))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    @Test
    public void getIranianAllPersons() {
      long oid=  customerService.findAll().size()-1;
        try {
            mockMvc.perform(get("/iranianCustomer"))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                    .andExpect(jsonPath("$", hasSize(customerService.findAll().size())))
                    .andExpect(jsonPath("$[" +oid+"].nationalId", is(iranianCustomerDto.getNationalId())))
                    .andExpect(status().isOk());

             */
/*       .andExpect(jsonPath("$[1].id", is(2)))
                    .andExpect(jsonPath("$[1].username", is("John Snow")));*//*

        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        customerService.delete(iranianCustomerDto.getId());
    }



    @Test
    public void getIranianCustomerById() {
        try {
            mockMvc.perform(get("/iranianCustomer/{iranianCustomerId}", iranianCustomerDto.getId()))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                    .andExpect(jsonPath("$.nationalId", is(iranianCustomerDto.getNationalId())))
                    .andExpect(status().isOk());

        } catch (Exception e) {
            e.printStackTrace();
        }

        customerService.delete(iranianCustomerDto.getId());
    }

    @Test
    public void getIranianCustomerByNationalId() {
        try {
            mockMvc.perform(get("/iranianCustomer/findByPersonalInfo/{nationalId}", iranianCustomerDto.getNationalId()))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                    .andExpect(jsonPath("$.nationalId", is(iranianCustomerDto.getNationalId())))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }

        customerService.delete(iranianCustomerDto.getId());
    }

    @Test
    public void updateIranianCustomer() {
        IranianCustomerDto iranianCustomer = new IranianCustomerDto();

        AddressDto addressDto = new AddressDto();
        addressDto.setCity("updated");
        addressDto.setProvince("updated");
        iranianCustomer.setAddress(addressDto);
        iranianCustomer.setBirthPlace("Iran");
        iranianCustomer.setBirthDate(LocalDate.of(2018, 11, 21));
        iranianCustomer.setFirstName("Alireza");
        iranianCustomer.setLastName("ahmadi");
        iranianCustomer.setNationalId("2222222222");
        iranianCustomer.setId(customerService.findAll().get(0).getId());

        try {
            mockMvc.perform(
                    put("/iranianCustomer")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(asJsonString(iranianCustomer)))
                            .andExpect(jsonPath("$.address.city", is("updated")))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        customerService.delete(iranianCustomerDto.getId());
    }

}*/
