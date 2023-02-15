package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.Direccion;
import usach.DBD.grupo15.proyecto.Repository.DireccionRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class DireccionService implements DireccionRepository {
    @Autowired
    private DireccionRepository direccionRepository;
    @Override
    public List<Direccion> findAll() {
        return direccionRepository.findAll();
    }

    @Override
    public List<Direccion> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Direccion> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Direccion> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        direccionRepository.deleteById(id);
    }

    @Override
    public void delete(Direccion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Direccion> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Direccion> S save(S entity) {
        return direccionRepository.save(entity);
    }

    @Override
    public <S extends Direccion> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Direccion> findById(Long id) {
        return direccionRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Direccion> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Direccion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Direccion> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Direccion getOne(Long aLong) {
        return null;
    }

    @Override
    public Direccion getById(Long id) {
        return direccionRepository.getById(id);
    }

    @Override
    public Direccion getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Direccion> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Direccion> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Direccion> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Direccion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Direccion> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Direccion> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Direccion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
