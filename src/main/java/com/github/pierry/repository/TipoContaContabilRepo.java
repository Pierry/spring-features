package com.github.pierry.repository;

import com.github.pierry.entities.TipoContaContabil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional @Repository public interface TipoContaContabilRepo extends CrudRepository<TipoContaContabil, Long> {
}
