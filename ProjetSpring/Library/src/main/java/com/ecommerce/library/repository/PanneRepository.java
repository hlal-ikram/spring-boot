package com.ecommerce.library.repository;

import com.ecommerce.library.model.Panne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PanneRepository extends JpaRepository<Panne, Long> {

    List<Panne> findPanneByIdMembreDepartement(String id);
    List<Panne> findByConstatIsNotNullAndDemandeIsNull();
    List<Panne> findPanneByIsTreatedFalse();
    List<Panne> findByDemandeIsNotNull();
    List<Panne> findAllByIsTreatedFalse();


}
