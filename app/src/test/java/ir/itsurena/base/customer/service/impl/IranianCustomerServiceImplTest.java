/*
package ir.itsurena.base.customer.service.impl;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
import ir.itsurena.base.core.util.dbuint.datasetcreator.DataSetCreator;
import ir.itsurena.base.core.util.dbuint.datasetcreator.DataSetCreatorException;
import ir.itsurena.base.core.util.mapper.ModelMapperUtil;
import ir.itsurena.base.customer.domain.IranianCustomer;
import ir.itsurena.base.customerservice.service.IranianCustomerService;
import ir.itsurena.base.customerdto.dto.AddressDto;
import ir.itsurena.base.customerdto.dto.IranianCustomerDto;
import org.dbunit.dataset.DataSetException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@ComponentScan("ir.itsurena.base")
public class IranianCustomerServiceImplTest {

    Logger logger=LoggerFactory.getLogger(IranianCustomerServiceImplTest.class);

    @Autowired
    IranianCustomerService iranianCustomerService;

    @Autowired
    DataSetCreator dataSetCreator;


  //  @Before
    public void setUp() {
        try {

            FileOutputStream outputStream=new FileOutputStream("iranianCustomer.xml");
            dataSetCreator.getAllDataSetByTableName("IRANIAN_CUSTOMER").writeTo(outputStream);
            outputStream.flush();
            outputStream.close();

        } catch (DataSetCreatorException|DataSetException|IOException e) {
           logger.error(e.getMessage());
        }

    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeInsert.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterInsert.xml")
    public void save() {
        IranianCustomerDto customer=new IranianCustomerDto();
        AddressDto addressDto=new AddressDto();
        addressDto.setCity("Tehran");
        addressDto.setProvince("Tehran");
        customer.setAddress(addressDto);
        customer.setBirthDate(LocalDate.of(1980,4,7));
        customer.setBirthPlace("Iran");
        customer.setFirstName("Alireza");
        customer.setLastName("ahmadi");
        logger.info(iranianCustomerService.save(customer).toString());
    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeUpdate.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterUpdate.xml")
    public void update() {
        IranianCustomerDto customer=new IranianCustomerDto();
        AddressDto addressDto=new AddressDto();
        addressDto.setCity("shiraz");
        addressDto.setProvince("shiraz");
        customer.setAddress(addressDto);
        customer.setBirthDate(LocalDate.of(1980,4,7));
        customer.setBirthPlace("Iran");
        customer.setFirstName("Alireza");
        customer.setLastName("ahmadi");
        customer.setId(iranianCustomerService.findAll().get(0).getId());
        logger.info(iranianCustomerService.update(customer).toString());
    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeFindAll.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterFindAll.xml")
    public void findAll() {


        iranianCustomerService.findAll().forEach(iranianCustomerDto -> {
            logger.info(iranianCustomerDto.toString());
        });
    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeFindByNationalId.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterFindByNationalId.xml")
    public void findByNationalId() {
        IranianCustomer iranianCustomer=new IranianCustomer();
        ModelMapperUtil.modelMapper().map(iranianCustomerService.findByNationalId("1111111111"),iranianCustomer);
        logger.info(iranianCustomer.toString());
    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeFindById.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterFindById.xml")
    public void findById() {
        IranianCustomer iranianCustomer=new IranianCustomer();
        ModelMapperUtil.modelMapper().map(iranianCustomerService.findById(2),iranianCustomer);
        logger.info(iranianCustomer.toString());
    }
}*/
