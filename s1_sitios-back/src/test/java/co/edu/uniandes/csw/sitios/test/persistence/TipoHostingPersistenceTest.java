/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.test.persistence;

import co.edu.uniandes.csw.sitios.entities.TipoHostingEntity;
import co.edu.uniandes.csw.sitios.persistence.TipoHostingPersistence;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author estudiante
 */
@RunWith(Arquillian.class)
public class TipoHostingPersistenceTest {
    
    /*
    /atributo pp Tipo Hosting
     */
    @Inject
    private TipoHostingPersistence pp;
    
    /*
    / 
    */
    @PersistenceContext
    private EntityManager em;

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(TipoHostingEntity.class.getPackage())
                .addPackage(TipoHostingEntity.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }

    // ep es entitypersistence
    @Test
    public void createTipoHostingTest() {

        PodamFactory factory = new PodamFactoryImpl();
        TipoHostingEntity newEntity = factory.manufacturePojo(TipoHostingEntity.class);

        TipoHostingEntity ep = pp.create(newEntity);
       
        //Verificamos que no sea nulo
        Assert.assertNotNull(ep);
        
        //Verificamos que el id o el objeto este en la base de datos buscando si el id existe
        TipoHostingEntity entity = em.find(TipoHostingEntity.class, ep.getId());
        
        //El nombre aleatorio pp dado el metodo inject
        Assert.assertEquals(newEntity.getCategoria(), entity.getCategoria());
    }

}