package odev.repository;

import odev.repository.entity.Departman;
import static odev.repository.entity.utility.StaticValues.*;
import java.util.List;

public class DepartmanRepository extends AbstractDepartman <Departman>  {

    @Override
    public void save(Departman t) {
    departmanListesi.add(t);
    }

    @Override
    public List findAll() {
        return departmanListesi;
    }
}
