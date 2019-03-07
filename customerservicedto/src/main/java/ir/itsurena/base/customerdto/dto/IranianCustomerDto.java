package ir.itsurena.base.customerdto.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * IranianCustomerDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-12T05:42:32.081Z")

public class IranianCustomerDto  {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("nationalId")
  private String nationalId;

  @JsonProperty("idNumber")
  private String idNumber;

  @JsonProperty("birthDate")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate birthDate;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("fatherName")
  private String fatherName;

  @JsonProperty("birthPlace")
  private String birthPlace;

  /**
   * جنسیت
   */
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("stockTradingCode")
  private String stockTradingCode;

  @JsonProperty("isoName")
  private String isoName;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("code")
  private String code;

  @JsonProperty("zipCode")
  private String zipCode;

  @JsonProperty("address")
  private AddressDto address;

  @JsonProperty("plainAddress")
  private String plainAddress;

  public IranianCustomerDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * کلید اصلی 
   * @return id
  **/
  @ApiModelProperty(value = "کلید اصلی ")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IranianCustomerDto nationalId(String nationalId) {
    this.nationalId = nationalId;
    return this;
  }

  /**
   * شماره ملی  
   * @return nationalId
  **/
  @ApiModelProperty(value = "شماره ملی  ")


  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public IranianCustomerDto idNumber(String idNumber) {
    this.idNumber = idNumber;
    return this;
  }

  /**
   * شماره شناسنامه
   * @return idNumber
  **/
  @ApiModelProperty(value = "شماره شناسنامه")


  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public IranianCustomerDto birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * تاریخ تولد
   * @return birthDate
  **/
  @ApiModelProperty(value = "تاریخ تولد")


  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public IranianCustomerDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   *  نام 
   * @return firstName
  **/
  @ApiModelProperty(value = " نام ")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public IranianCustomerDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * نام خانوادگی 
   * @return lastName
  **/
  @ApiModelProperty(value = "نام خانوادگی ")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public IranianCustomerDto fatherName(String fatherName) {
    this.fatherName = fatherName;
    return this;
  }

  /**
   * نام پدر
   * @return fatherName
  **/
  @ApiModelProperty(value = "نام پدر")


  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public IranianCustomerDto birthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }

  /**
   * محل تولد  
   * @return birthPlace
  **/
  @ApiModelProperty(value = "محل تولد  ")


  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  public IranianCustomerDto gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * جنسیت
   * @return gender
  **/
  @ApiModelProperty(value = "جنسیت")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public IranianCustomerDto stockTradingCode(String stockTradingCode) {
    this.stockTradingCode = stockTradingCode;
    return this;
  }

  /**
   * کد معاملاتی بورس  
   * @return stockTradingCode
  **/
  @ApiModelProperty(value = "کد معاملاتی بورس  ")


  public String getStockTradingCode() {
    return stockTradingCode;
  }

  public void setStockTradingCode(String stockTradingCode) {
    this.stockTradingCode = stockTradingCode;
  }

  public IranianCustomerDto isoName(String isoName) {
    this.isoName = isoName;
    return this;
  }

  /**
   * ISO Name 
   * @return isoName
  **/
  @ApiModelProperty(value = "ISO Name ")


  public String getIsoName() {
    return isoName;
  }

  public void setIsoName(String isoName) {
    this.isoName = isoName;
  }

  public IranianCustomerDto phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * شماره تلفن همراه
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "شماره تلفن همراه")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public IranianCustomerDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * شماره تلفن 
   * @return phone
  **/
  @ApiModelProperty(value = "شماره تلفن ")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public IranianCustomerDto code(String code) {
    this.code = code;
    return this;
  }

  /**
   * پیش شماره تلفن
   * @return code
  **/
  @ApiModelProperty(value = "پیش شماره تلفن")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public IranianCustomerDto zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * کد پستی 
   * @return zipCode
  **/
  @ApiModelProperty(value = "کد پستی ")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public IranianCustomerDto address(AddressDto address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AddressDto getAddress() {
    return address;
  }

  public void setAddress(AddressDto address) {
    this.address = address;
  }

  public IranianCustomerDto plainAddress(String plainAddress) {
    this.plainAddress = plainAddress;
    return this;
  }

  /**
   * آدرس
   * @return plainAddress
  **/
  @ApiModelProperty(value = "آدرس")


  public String getPlainAddress() {
    return plainAddress;
  }

  public void setPlainAddress(String plainAddress) {
    this.plainAddress = plainAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IranianCustomerDto iranianCustomerDto = (IranianCustomerDto) o;
    return Objects.equals(this.id, iranianCustomerDto.id) &&
        Objects.equals(this.nationalId, iranianCustomerDto.nationalId) &&
        Objects.equals(this.idNumber, iranianCustomerDto.idNumber) &&
        Objects.equals(this.birthDate, iranianCustomerDto.birthDate) &&
        Objects.equals(this.firstName, iranianCustomerDto.firstName) &&
        Objects.equals(this.lastName, iranianCustomerDto.lastName) &&
        Objects.equals(this.fatherName, iranianCustomerDto.fatherName) &&
        Objects.equals(this.birthPlace, iranianCustomerDto.birthPlace) &&
        Objects.equals(this.gender, iranianCustomerDto.gender) &&
        Objects.equals(this.stockTradingCode, iranianCustomerDto.stockTradingCode) &&
        Objects.equals(this.isoName, iranianCustomerDto.isoName) &&
        Objects.equals(this.phoneNumber, iranianCustomerDto.phoneNumber) &&
        Objects.equals(this.phone, iranianCustomerDto.phone) &&
        Objects.equals(this.code, iranianCustomerDto.code) &&
        Objects.equals(this.zipCode, iranianCustomerDto.zipCode) &&
        Objects.equals(this.address, iranianCustomerDto.address) &&
        Objects.equals(this.plainAddress, iranianCustomerDto.plainAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nationalId, idNumber, birthDate, firstName, lastName, fatherName, birthPlace, gender, stockTradingCode, isoName, phoneNumber, phone, code, zipCode, address, plainAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IranianCustomerDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nationalId: ").append(toIndentedString(nationalId)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fatherName: ").append(toIndentedString(fatherName)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    stockTradingCode: ").append(toIndentedString(stockTradingCode)).append("\n");
    sb.append("    isoName: ").append(toIndentedString(isoName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    plainAddress: ").append(toIndentedString(plainAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

