package com.ecommerce.library.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder @AllArgsConstructor @NoArgsConstructor @Data
public class Technicien extends Users {
    private String specialite;

}
