package com.ecommerce.library.repository;

import com.ecommerce.library.model.Offre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface OffreRepository extends JpaRepository <Offre,Long> {
    List<Offre> findOffreByIdAppelOffre(Long id);
    List<Offre> findOffreByIdFournisseur(String id);

    List<Offre> findOffreByIdAppelOffreAndIsAffectedIsFalse(Long id);

    Optional<Offre> findOffreById(Long id);

}
