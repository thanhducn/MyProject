package com.ducnt7.repositories;

import com.ducnt7.models.Pie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by DucNT7 on 3/3/2017.
 */
public interface PieRepository extends CrudRepository<Pie, Long> {
    List<Pie> findByName(String name);
}
