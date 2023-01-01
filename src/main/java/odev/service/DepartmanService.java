package odev.service;

import odev.repository.AbstractDepartman;
import odev.repository.DepartmanRepository;
import odev.repository.entity.Departman;

import java.util.List;

public class DepartmanService extends AbstractDepartman <Departman> {
DepartmanRepository departmanRepository = new DepartmanRepository();

    @Override
    public void save(Departman t) {
    departmanRepository.save(t);
    }

    @Override
    public List findAll() {

        return departmanRepository.findAll();
    }
}
