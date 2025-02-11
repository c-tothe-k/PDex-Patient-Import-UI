package org.hl7.davinci.refimpl.patientui.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * A DTO that represents payer.
 *
 * @author Kseniia Lutsko
 */
@Getter
@Setter
public class PayerDto {

  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private Long id;
  @NotEmpty
  private String name;
  @NotEmpty
  private String fhirServerUri;
  @NotEmpty
  private String clientId;

  //CK add clientSecret
  @NotEmpty
  private String clientSecret;

  @NotEmpty
  private String scope;
  private String authorizeUri;
  private String tokenUri;
  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private String sourcePatientId;
  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private String lastImported;
}
