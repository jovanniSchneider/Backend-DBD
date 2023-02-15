package usach.DBD.grupo15.proyecto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import usach.DBD.grupo15.proyecto.Model.CarritoStock;
import usach.DBD.grupo15.proyecto.Repository.CarritoStockRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CarritoStockService implements CarritoStockRepository {
    @Autowired
    CarritoStockRepository carritoStockRepository;
    @Override
    public List<CarritoStock> findAll() {
        return carritoStockRepository.findAll();
    }

    @Override
    public List<CarritoStock> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CarritoStock> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CarritoStock> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        carritoStockRepository.deleteById(id);
    }

    @Override
    public void delete(CarritoStock entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CarritoStock> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CarritoStock> S save(S entity) {
        return carritoStockRepository.save(entity);
    }

    @Override
    public <S extends CarritoStock> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CarritoStock> findById(Long aLong) {
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
    public <S extends CarritoStock> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CarritoStock> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CarritoStock> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CarritoStock getOne(Long aLong) {
        return null;
    }

    @Override
    public CarritoStock getById(Long id) {
        return carritoStockRepository.getReferenceById(id);
    }

    @Override
    public CarritoStock getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CarritoStock> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CarritoStock> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CarritoStock> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CarritoStock> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CarritoStock> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CarritoStock> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CarritoStock, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

}
