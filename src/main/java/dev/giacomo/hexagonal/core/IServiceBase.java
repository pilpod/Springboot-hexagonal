package dev.giacomo.hexagonal.core;

public interface IServiceBase<T> {
    
    public T save( T obj );

}
