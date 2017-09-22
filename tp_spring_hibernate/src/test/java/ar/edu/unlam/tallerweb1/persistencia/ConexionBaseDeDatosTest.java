package ar.edu.unlam.tallerweb1.persistencia;


import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.*;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

// Clase que prueba la conexion a la base de datos. Hereda de SpringTest por lo que corre dentro del contexto
// de spring
public class ConexionBaseDeDatosTest extends SpringTest{

    @Test
    @Transactional @Rollback(true)
    public void pruebaConexion(){
        assertThat(getSession().isConnected()).isTrue();
    }
    
   
}
    



