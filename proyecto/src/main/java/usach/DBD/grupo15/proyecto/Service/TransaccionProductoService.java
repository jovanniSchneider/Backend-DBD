package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.TransaccionProducto;
import usach.DBD.grupo15.proyecto.Repository.TransaccionProductoRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TransaccionProductoService implements TransaccionProductoRepository {
    @Autowired
    TransaccionProductoRepository transProdRepo;
    @Override
    public List<TransaccionProducto> findAll() {
        return transProdRepo.findAll();
    }

    @Override
    public List<TransaccionProducto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TransaccionProducto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TransaccionProducto> findAllById(Iterable<Long> longs) {
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
    public void delete(TransaccionProducto entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends TransaccionProducto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TransaccionProducto> S save(S entity) {
        return transProdRepo.save(entity);
    }

    @Override
    public <S extends TransaccionProducto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TransaccionProducto> findById(Long aLong) {
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
    public <S extends TransaccionProducto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TransaccionProducto> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TransaccionProducto> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TransaccionProducto getOne(Long aLong) {
        return null;
    }

    @Override
    public TransaccionProducto getById(Long id) {
        return transProdRepo.getById(id);
    }

    @Override
    public TransaccionProducto getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends TransaccionProducto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TransaccionProducto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TransaccionProducto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TransaccionProducto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TransaccionProducto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TransaccionProducto> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TransaccionProducto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
