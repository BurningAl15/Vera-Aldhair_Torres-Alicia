package service;

import dao.OdontologoDaoH2;
import dao.iDao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoIDao;

    public OdontologoService() {
        odontologoIDao= new OdontologoDaoH2();
    }
    public Odontologo guardarOdontologo(Odontologo paciente){
        return odontologoIDao.guardar(paciente);
    }
    public Odontologo buscarOdontologo(Integer id){
        return odontologoIDao.buscarPorID(id);
    }
    public List<Odontologo> buscarTodos(){
        return odontologoIDao.buscarTodos();
    }
}
