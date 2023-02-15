package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.Pyme;
import usach.DBD.grupo15.proyecto.Repository.PymeRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PymeService implements PymeRepository {
    @Autowired
    PymeRepository pymeRepository;

    @Override
    public List<Pyme> findAll() {
        return pymeRepository.findAll();
    }

    @Override
    public List<Pyme> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Pyme> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Pyme> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Pyme entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pyme> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Pyme> S save(S entity) {
        return pymeRepository.save(entity);
    }

    @Override
    public <S extends Pyme> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Pyme> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Pyme> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Pyme> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Pyme> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Pyme getOne(Long aLong) {
        return null;
    }

    @Override
    public Pyme getById(Long id) {
        return pymeRepository.getById(id);
    }

    @Override
    public Pyme getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Pyme> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Pyme> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pyme> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Pyme> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Pyme> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Pyme> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Pyme, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
