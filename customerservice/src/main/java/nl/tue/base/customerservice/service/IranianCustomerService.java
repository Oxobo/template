package nl.tue.base.customerservice.service;

import nl.tue.base.customerdto.dto.IranianCustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IranianCustomerService {

    IranianCustomerDto save(IranianCustomerDto iranianCustomer);

    IranianCustomerDto update(IranianCustomerDto iranianCustomer);

    List<IranianCustomerDto> findAll();

    IranianCustomerDto findByNationalId(String nationalId);

    IranianCustomerDto findById(long id);

    void delete(long id);
}
