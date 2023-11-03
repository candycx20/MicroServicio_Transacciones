package com.example.demo.repositories;
import com.example.demo.models.Zapatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZapatosRepository extends JpaRepository<Zapatos, Integer> {


}
