package com.shared.models.requests;

import com.shared.basecrud.dtos.requests.BaseRequest;
import java.util.UUID;

public class CompanyProfileRequest extends BaseRequest {
  private UUID id;
  private String companyName;
  private String province;
  private String country;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
