package ir.itsurena.base.customer.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import ir.itsurena.base.customerdto.dto.IranianCustomerDto;
import ir.itsurena.base.customerservice.service.IranianCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-10T07:17:09.190Z")

@Controller
public class IranianCustomerApiController implements IranianCustomerApi {

    @Autowired
    private IranianCustomerService iranianCustomerService;

    private static final Logger log = LoggerFactory.getLogger(IranianCustomerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IranianCustomerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<IranianCustomerDto> createIranianCustomer(@ApiParam(value = "ورودی یک شئ از نوع شخص حقیقی ایرانی" ,required=true )  @Valid @RequestBody IranianCustomerDto body) {
        iranianCustomerService.save(body);
       return new ResponseEntity<IranianCustomerDto>(body,HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteIranianPerson(@ApiParam(value = "شناسه مشتری حقیقی ایرانی که باید حذف شود",required=true) @PathVariable("iranianCustomerId") Long iranianCustomerId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        iranianCustomerService.delete(iranianCustomerId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<IranianCustomerDto>> getIranianAllPersons() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<IranianCustomerDto>>(iranianCustomerService.findAll(),HttpStatus.OK);
    }

    public ResponseEntity<IranianCustomerDto> getIranianCustomerById(@ApiParam(value = "شناسه مشتری حقیقی که باید برگردانده شود",required=true) @PathVariable("iranianCustomerId") Long iranianCustomerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<IranianCustomerDto>( iranianCustomerService.findById(iranianCustomerId),HttpStatus.OK);
    }

    public ResponseEntity<IranianCustomerDto> getIranianCustomerByNationalId(@ApiParam(value = "شماره ملی مشتری که باید برگردانده شود ",required=true) @PathVariable("nationalId") String nationalId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<IranianCustomerDto>(iranianCustomerService.findByNationalId(nationalId),HttpStatus.OK);
    }

    public ResponseEntity<IranianCustomerDto> updateIranianCustomer(@ApiParam(value = "مشتری حقیقی که باید به روز رسانی شود" ,required=true )  @Valid @RequestBody IranianCustomerDto body) {
        String accept = request.getHeader("Accept");

        return new ResponseEntity<IranianCustomerDto>( iranianCustomerService.update(body),HttpStatus.OK);
    }

}
