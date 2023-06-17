package dev.giacomo.hexagonal.customers.infrastructure.outputPorts;

import java.util.List;

public interface EntityRepository {
    
    public <T> T save( T reg );
    public <T> T getById( Long id, Class<T> obj );
    public <T> List<T> getAll( Class<T> obj );
}
