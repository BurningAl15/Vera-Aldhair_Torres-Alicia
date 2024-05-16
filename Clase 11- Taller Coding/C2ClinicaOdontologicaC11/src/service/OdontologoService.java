package service;

import dao.OdontologoCollection;
import dao.OdontologoDaoH2;
import dao.iDao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoIDao;

    public OdontologoService() {
        odontologoIDao= new OdontologoDaoH2();
    }

    public OdontologoService(Integer tipo) {
        if(tipo == 0)
            odontologoIDao= new OdontologoDaoH2();
        else
            odontologoIDao = new OdontologoCollection();
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
