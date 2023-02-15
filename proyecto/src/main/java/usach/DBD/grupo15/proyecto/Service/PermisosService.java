package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.Permisos;
import usach.DBD.grupo15.proyecto.Repository.PermisosRepository;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class PermisosService implements PermisosRepository {
    @Autowired
    PermisosRepository permisosRepository;

    @Override
    public List<Permisos> findAll() {
        return permisosRepository.findAll();
    }

    @Override
    public List<Permisos> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Permisos> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Permisos> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        permisosRepository.deleteById(id);
    }

    @Override
    public void delete(Permisos entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Permisos> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Permisos> S save(S entity) {
        return permisosRepository.save(entity);
    }

    @Override
    public <S extends Permisos> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Permisos> findById(Long id) {
        return permisosRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Permisos> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Permisos> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Permisos> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Permisos getOne(Long aLong) {
        return null;
    }

    @Override
    public Permisos getById(Long aLong) {
        return null;
    }

    @Override
    public Permisos getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Permisos> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Permisos> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Permisos> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Permisos> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Permisos> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Permisos> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Permisos, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
