/*
package ir.itsurena.base.customer.repository;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
import ir.itsurena.base.core.util.mapper.ModelMapperUtil;
import ir.itsurena.base.customer.domain.Address;
import ir.itsurena.base.customer.domain.IranianCustomer;
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

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@ComponentScan("ir.itsurena")
public class IranianCustomerRepositoryTest {

    Logger logger=LoggerFactory.getLogger(IranianCustomerRepositoryTest.class);



    @Autowired
    AddressRepository addressRepository;

    @Autowired
    IranianCustomerRepository iranianCustomerRepository;

    @Test
    @DatabaseSetup("iranianCustomerBeforeInsert.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterInsert.xml")
    public void save() {
        IranianCustomer customer=new IranianCustomer();
        Address address= addressRepository.findById(3);

        customer.setAddress(address);
        customer.setBirthDate(LocalDate.of(1980,4,7));
        customer.setBirthPlace("Iran");
        customer.setFirstName("Alireza");
        customer.setLastName("ahmadi");
        customer.setLastModifiedBy("saeid");
        customer.setCreatedBy("saeid");

        logger.info(iranianCustomerRepository.save(customer).toString());
    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeFindAll.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterFindAll.xml")
    public void findAll() {
        iranianCustomerRepository.findAll().forEach(iranianCustomerDto -> {
            logger.info(iranianCustomerDto.toString());
        });
    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeFindByNationalId.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterFindByNationalId.xml")
    public void findByNationalId() {
        IranianCustomer iranianCustomer= iranianCustomerRepository.findByNationalId("1111111111");
        logger.info(iranianCustomer.toString());
    }

    @Test
    @DatabaseSetup("iranianCustomerBeforeFindById.xml")
    @ExpectedDatabase(assertionMode = DatabaseAssertionMode.NON_STRICT, value = "iranianCustomerAfterFindById.xml")
    public void findById() {
        IranianCustomer iranianCustomer=iranianCustomerRepository.findById(2);
        logger.info(iranianCustomer.toString());
    }
}*/
