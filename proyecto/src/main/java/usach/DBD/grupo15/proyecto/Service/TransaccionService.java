package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.Transaccion;
import usach.DBD.grupo15.proyecto.Repository.TransaccionRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TransaccionService implements TransaccionRepository{
    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public List<Transaccion> findAll() {return transaccionRepository.findAll();}

    @Override
    public List<Transaccion> findAll(Sort sort) {return null;}

    @Override
    public Page<Transaccion> findAll(Pageable pageable) {return null;}

    @Override
    public List<Transaccion> findAllById(Iterable<Long> longs) {return null;}

    @Override
    public long count() {return 0;}

    @Override
    public void deleteById(Long id) { transaccionRepository.deleteById(id);}

    @Override
    public void delete(Transaccion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Transaccion> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Transaccion> S save(S entity) {
        return transaccionRepository.save(entity);
    }

    @Override
    public <S extends Transaccion> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Transaccion> findById(Long id) {return transaccionRepository.findById(id);}

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Transaccion> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Transaccion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Transaccion> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Transaccion getOne(Long aLong) {
        return null;
    }

    @Override
    public Transaccion getById(Long aLong) {
        return null;
    }

    @Override
    public Transaccion getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Transaccion> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Transaccion> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Transaccion> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Transaccion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Transaccion> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Transaccion> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Transaccion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
