import dao.BD;
import dao.OdontologoDaoH2;
import model.Odontologo;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;
import java.util.List;

public class OdontologoTestService {
    private static final org.apache.log4j.Logger logger= Logger.getLogger(OdontologoDaoH2.class);

    @Test
    public void listarOdontologos(){

        BD.crearTablas();
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.guardarOdontologo(new Odontologo(123,"Alicia","Torres"));
        odontologoService.guardarOdontologo(new Odontologo(555,"Aldhair","Vera"));

        List<Odontologo> odontologos = odontologoService.buscarTodos();
        for(int i=0;i<odontologos.size();i++){
            logger.info(odontologos.get(i).getId()+ " - " + odontologos.get(i).getNombre() + " " + odontologos.get(i).getApellido());
        }
        Assertions.assertTrue(odontologos.size()==2);

    }

}
