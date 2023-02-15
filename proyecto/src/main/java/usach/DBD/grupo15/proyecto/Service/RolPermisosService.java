package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.RolPermisos;
import usach.DBD.grupo15.proyecto.Repository.RolPermisosRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class RolPermisosService  implements  RolPermisosRepository {

    @Autowired
    private RolPermisosRepository rolPermisosRepository;


    @Override
    public List<RolPermisos> findAll() {
        return rolPermisosRepository.findAll();
    }

    @Override
    public List<RolPermisos> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<RolPermisos> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<RolPermisos> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        rolPermisosRepository.deleteById(id);
    }

    @Override
    public void delete(RolPermisos entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends RolPermisos> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends RolPermisos> S save(S entity) {
        return rolPermisosRepository.save(entity);
    }

    @Override
    public <S extends RolPermisos> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<RolPermisos> findById(Long id) {
        return rolPermisosRepository.findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends RolPermisos> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends RolPermisos> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<RolPermisos> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public RolPermisos getOne(Long aLong) {
        return null;
    }

    @Override
    public RolPermisos getById(Long aLong) {
        return null;
    }

    @Override
    public RolPermisos getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends RolPermisos> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends RolPermisos> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends RolPermisos> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends RolPermisos> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends RolPermisos> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends RolPermisos> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends RolPermisos, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
