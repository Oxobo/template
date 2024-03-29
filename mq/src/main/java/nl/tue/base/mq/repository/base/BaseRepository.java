package nl.tue.base.mq.repository.base;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, I extends Serializable> extends CrudRepository<T, I> {


}
