package com.preciado.market.persistence.crud;

import com.preciado.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Query methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    //Manera nativa de llamar a un query sql | El nombre no necesariamente lleva una nomenclatura
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    //List<Producto> obtenerProductosConCategoria(int idCategoria);



}
