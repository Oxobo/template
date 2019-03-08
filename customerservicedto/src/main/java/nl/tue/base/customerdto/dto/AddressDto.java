package nl.tue.base.customerdto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * AddressDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-12T05:42:32.081Z")

public class AddressDto   {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("province")
  private String province = null;

  public AddressDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * نام شهر  
   * @return city
  **/
  @ApiModelProperty(value = "نام شهر  ")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressDto province(String province) {
    this.province = province;
    return this;
  }

  /**
   * نام استان 
   * @return province
  **/
  @ApiModelProperty(value = "نام استان ")


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDto addressDto = (AddressDto) o;
    return Objects.equals(this.city, addressDto.city) &&
        Objects.equals(this.province, addressDto.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, province);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDto {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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

