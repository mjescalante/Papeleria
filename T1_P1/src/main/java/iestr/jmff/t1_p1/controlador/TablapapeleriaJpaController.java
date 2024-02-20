/*
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package iestr.jmff.t1_p1.controlador;

import iestr.jmff.t1_p1.controlador.exceptions.NonexistentEntityException;
import iestr.jmff.t1_p1.modelo.Tablapapeleria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * <p><strong>Clase TablapapeleriaJpaController</strong></p>
 * <p>Controlador para la entidad Tablapapeleria.</p>
 * <p>Realiza operaciones en la tabla de la base de datos.</p>
 * @author Daniel Gutierrez Ramirez
 */
public class TablapapeleriaJpaController implements Serializable {
    /**
     * Constructor de la clase TablapapeleriaJpaController.
     * @param emf El EntityManagerFactory utilizado para crear el EntityManager.
     */
    public TablapapeleriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    private EntityManagerFactory emf = null;
    
    /**
     * Metodo para obtener el EntityManager.
     * @return El EntityManager creado a partir del EntityManagerFactory.
     */
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    /**
     * Metodo para crear una nueva entidad Tablapapeleria en la base de datos.
     * @param tablapapeleria La Tablapapeleria a ser creada.
     */
    public void create(Tablapapeleria tablapapeleria) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tablapapeleria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
     * Metodo para editar una entidad Tablapapeleria en la base de datos.
     * @param tablapapeleria La Tablapapeleria para editarla.
     * @throws NonexistentEntityException Si la Tablapapeleria no existe.
     * @throws Exception Si ocurre un error durante la edicion.
     */
    public void edit(Tablapapeleria tablapapeleria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tablapapeleria = em.merge(tablapapeleria);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tablapapeleria.getId();
                if (findTablapapeleria(id) == null) {
                    throw new NonexistentEntityException("La Tablapapeleria con el ID " + id + " ya no existe.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
     * Metodo para eliminar una entidad Tablapapeleria de la base de datos.
     * @param id El ID de la Tablapapeleria que es eliminado.
     * @throws NonexistentEntityException Si la Tablapapeleria no existe.
     */
    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tablapapeleria tablapapeleria;
            try {
                tablapapeleria = em.getReference(Tablapapeleria.class, id);
                tablapapeleria.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("La Tablapapeleria con el ID " + id + " ya no existe.", enfe);
            }
            em.remove(tablapapeleria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
     * Metodo para obtener una lista de todas las entidades Tablapapeleria en la base de datos.
     * @return Una lista de entidades Tablapapeleria.
     */
    public List<Tablapapeleria> findTablapapeleriaEntities() {
        return findTablapapeleriaEntities(true, -1, -1);
    }
    
    /**
     * Metodo para obtener una lista de entidades Tablapapeleria en la base de datos.
     * @param maxResults El numero maximo de resultados.
     * @param firstResult El primer resultado.
     * @return Una lista de entidades Tablapapeleria.
     */
    public List<Tablapapeleria> findTablapapeleriaEntities(int maxResults, int firstResult) {
        return findTablapapeleriaEntities(false, maxResults, firstResult);
    }
    /**
     * Encuentra entidades Tablapapeleria en la base de datos.
     * 
     * @param all Si es verdadero, se recuperan todas las entidades Tablapapeleria; si es falso, se utilizan los parametros de ordenacion.
     * @param maxResults El numero maximo de resultados a recuperar.
     * @param firstResult El indice del primer resultado a recuperar.
     * @return Una lista de entidades Tablapapeleria que cumplen con los criterios de la consulta.
     */
    private List<Tablapapeleria> findTablapapeleriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tablapapeleria.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
    /**
     * Metodo para encontrar una entidad Tablapapeleria por su ID.
     * @param id El ID de la Tablapapeleria que hay que buscar.
     * @return La Tablapapeleria que ha encontrado, o null si no se encuentra.
     */
    public Tablapapeleria findTablapapeleria(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tablapapeleria.class, id);
        } finally {
            em.close();
        }
    }
    
    /**
     * Metodo para obtener el numero total de entidades Tablapapeleria en la base de datos.
     * @return El numero total de entidades Tablapapeleria.
     */
    public int getTablapapeleriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tablapapeleria> rt = cq.from(Tablapapeleria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
