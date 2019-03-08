package nl.tue.base.customer.service.impl;


import nl.tue.base.core.exception.CanNotDeleteEntityException;
import nl.tue.base.core.util.mapper.ModelMapperUtil;
import nl.tue.base.customer.domain.Address;
import nl.tue.base.customer.domain.IranianCustomer;
import nl.tue.base.customer.repository.AddressRepository;
import nl.tue.base.customer.repository.IranianCustomerRepository;
import nl.tue.base.customerservice.service.IranianCustomerService;
import nl.tue.base.customerdto.dto.IranianCustomerDto;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.lang.reflect.Type;
import java.util.List;

@Transactional
@Service
public class IranianCustomerServiceImpl implements IranianCustomerService {

     @Autowired
     IranianCustomerRepository iranianCustomerRepository;

     @Autowired
     AddressRepository addressRepository;


    @Override
    public IranianCustomerDto save(IranianCustomerDto iranianCustomer) {
        IranianCustomer iranianCustomerDomain=new IranianCustomer();

       Address address =addressRepository.findByProvinceAndAndCity(iranianCustomer.getAddress().getProvince(),iranianCustomer.getAddress().getCity());
        if(address == null){
           address=new Address(iranianCustomer.getAddress().getProvince(),iranianCustomer.getAddress().getCity());
           addressRepository.save(address);
        }
        ModelMapperUtil.modelMapper().map(iranianCustomer,iranianCustomerDomain);
        iranianCustomerDomain.setAddress(address);
        iranianCustomerDomain.setCreatedBy("saeid");
        iranianCustomerDomain.setLastModifiedBy("saeid");
       /* if(iranianCustomerDomain.getIdNumber() == null ){
            throw new MethodArgumentNotValidException();
        }*/

        IranianCustomerDto dtoRetrievedFromSave=new IranianCustomerDto();

        ModelMapperUtil.modelMapper().map(iranianCustomerRepository.save(iranianCustomerDomain),dtoRetrievedFromSave);

        return dtoRetrievedFromSave;
    }

    @Override
    public IranianCustomerDto update(IranianCustomerDto iranianCustomer) {

        IranianCustomer domain=iranianCustomerRepository.findById(iranianCustomer.getId()).get();

        if(domain == null){
            throw new EntityNotFoundException();
        }



        Address address = addressRepository.findByProvinceAndAndCity(iranianCustomer.getAddress().getProvince(),iranianCustomer.getAddress().getCity());
        if(address==null) {
            address=new Address();
            address.setProvince(iranianCustomer.getAddress().getProvince());
            address.setCity(iranianCustomer.getAddress().getCity());
            addressRepository.save(address);
        }
        domain.setAddress(address);
        domain.setCode(iranianCustomer.getCode());
        domain.setIsoName(iranianCustomer.getIsoName());
        domain.setPhone(iranianCustomer.getPhone());
        domain.setPhoneNumber(iranianCustomer.getPhoneNumber());
        domain.setPlainAddress(iranianCustomer.getPlainAddress());
        domain.setStockTradingCode(iranianCustomer.getStockTradingCode());
        domain.setZipCode(iranianCustomer.getZipCode());


        IranianCustomerDto dtoRetrievedFromSave=new IranianCustomerDto();
        ModelMapperUtil.modelMapper().map(iranianCustomerRepository.save(domain),dtoRetrievedFromSave);
        return dtoRetrievedFromSave;
    }

    @Override
    public List<IranianCustomerDto> findAll() {


        Type targetListType = new TypeToken<List<IranianCustomerDto>>() {}.getType();

        List<IranianCustomerDto> allIranianCustomers =  ModelMapperUtil.modelMapper().map(iranianCustomerRepository.findAll(),targetListType);

        return allIranianCustomers;
    }

    @Override
    public IranianCustomerDto findByNationalId(String nationalId) {
        IranianCustomerDto iranianCustomerDto=new IranianCustomerDto();
        ModelMapperUtil.modelMapper().map(iranianCustomerRepository.findByNationalId(nationalId),iranianCustomerDto);
        return iranianCustomerDto;
    }

    @Override
    public IranianCustomerDto findById(long id) {
        IranianCustomerDto iranianCustomerDto=new IranianCustomerDto();
        IranianCustomer iranianCustomer = iranianCustomerRepository.findById(id);
        if(iranianCustomer !=null) {
            ModelMapperUtil.modelMapper().map(iranianCustomer, iranianCustomerDto);
        }else {
            throw new EntityNotFoundException();
        }
        return iranianCustomerDto;
    }

    @Override
    public void delete(long id) {
        try{
            iranianCustomerRepository.deleteById(id);
        }catch (Exception e){
            throw new CanNotDeleteEntityException(e.getMessage());
        }

    }


}
