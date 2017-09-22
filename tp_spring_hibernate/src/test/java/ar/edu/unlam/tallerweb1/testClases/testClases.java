package ar.edu.unlam.tallerweb1.testClases;


import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.*;

import org.hibernate.FetchMode;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.*;
import java.util.List;


public class testClases extends SpringTest{
      
    Comuna comuna;
	Barrio barrio;
	Direccion direccion;
	Farmacia farmacia;
	Punto punto;
    
    @Before
    @Transactional @Rollback(true)
    public void llenarDatos()  
    {      	    	
    	comuna = new Comuna(null,"San Roque");
    	getSession().save(comuna);
    		
    	barrio = new Barrio((long)1,"La Falda");
    	barrio.setComuna(comuna);
    	getSession().save(barrio);
    
    	direccion=new Direccion(null, "San Jose","4331");
    	direccion.setBarrio(barrio);
    	getSession().save(direccion);    
    	
    	punto = new Punto (null,"12315","456454");
    	
    	farmacia = new Farmacia(null, "La Plaza","44455-6666","Martes");
    	farmacia.setPunto(punto);
    	farmacia.setDireccion(direccion);    	
    	getSession().save(farmacia);  
    	    	
    	comuna = new Comuna(null,"Comuna Alberdi");           		
      	barrio = new Barrio(null,"sal Si Puedes");
      	barrio.setComuna(comuna);      	
      
      	direccion=new Direccion(null, "Aberdi","1234");
      	direccion.setBarrio(barrio);
      	getSession().save(direccion); 
      	
      	direccion=new Direccion(null, "Calle 3","456");
      	direccion.setBarrio(barrio);
      	getSession().save(direccion); 
      	
      	punto = new Punto (null,"789545","7874555");
    	
    	farmacia = new Farmacia(null, "La Plaza 2","1111-22222","Jueves");
    	farmacia.setPunto(punto);
    	farmacia.setDireccion(direccion);    	
    	getSession().save(farmacia);    	        	    	    	      	         	
    }
    
   @Test
    @Transactional @Rollback(false)
    public void GetFarmaciasTurno()  
    {   
    	
    	List <Farmacia> farm;
    	farm = getSession().createCriteria(Farmacia.class)
    			.add (Restrictions.eq("diaDeTurno","Martes"))
    			.list();
    	    	
    	for (Farmacia farmacia : farm) {
    		System.out.println(farmacia.getNombre());
    		    System.out.println(farmacia.getDiaDeTurno());
    		}
          	    	    	      	         	
    }
    
    @Test
    @Transactional @Rollback(false)
    public void GetFarmaciasCalle()  
    {   
    	
    	List <Farmacia> farm;
    	farm = getSession().createCriteria(Farmacia.class)    			
    			.createAlias("direccion", "dir")
    			 .setFetchMode("direccion", FetchMode.JOIN) 
    			.add(Restrictions.eq("dir.calle", "Calle 3"))    	   			
    			.list();    	      
    	 
    	for (Farmacia farmacia : farm) {
    		System.out.println(farmacia.getNombre());
    		    System.out.println(farmacia.getDireccion().getCalle());
    		}
          	    	    	      	         	
    }
    
    @Test
    @Transactional @Rollback(false)
    public void GetFarmaciasBarrio()  
    {   
    	
    	List <Farmacia> farm;
    	farm = getSession().createCriteria(Farmacia.class)    			
    			.createAlias("direccion", "dir")
    			 .setFetchMode("direccion", FetchMode.JOIN)     		
    			 .createAlias("direccion.barrio", "bar")
    			 .setFetchMode("direccion.barrio", FetchMode.JOIN) 
    			.add(Restrictions.eq("bar.nombre", "sal Si Puedes")) 
    			.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY)
    			.list();    	      
    	 
    	for (Farmacia farmacia : farm) {
    		System.out.println(farmacia.getNombre());
    		    System.out.println(farmacia.getDireccion().getBarrio().getNombre());
    		}
          	    	    	      	         	
    }
    
}
    

