package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.Mediodepago;
import usach.DBD.grupo15.proyecto.Repository.MediodePagoRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class MediodePagoService implements MediodePagoRepository {
    @Autowired
    MediodePagoRepository medioDePagoRepository;

    @Override
    public List<Mediodepago> findAll() {
        return medioDePagoRepository.findAll();
    }

    @Override
    public List<Mediodepago> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Mediodepago> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Mediodepago> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        medioDePagoRepository.deleteById(id);
    }

    @Override
    public void delete(Mediodepago entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Mediodepago> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Mediodepago> S save(S entity) {
        return medioDePagoRepository.save(entity);
    }

    @Override
    public <S extends Mediodepago> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Mediodepago> findById(Long id) {
        return medioDePagoRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Mediodepago> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Mediodepago> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Mediodepago> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Mediodepago getOne(Long aLong) {
        return null;
    }

    @Override
    public Mediodepago getById(Long aLong) {
        return null;
    }

    @Override
    public Mediodepago getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Mediodepago> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Mediodepago> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Mediodepago> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Mediodepago> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Mediodepago> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Mediodepago> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Mediodepago, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
