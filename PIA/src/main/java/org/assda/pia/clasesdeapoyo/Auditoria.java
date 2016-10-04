package org.assda.pia.clasesdeapoyo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "T_AUDITORIA_JBPM", schema = "SERVIDEP")
@org.kie.api.definition.type.Label("Auditoria")
@org.kie.api.definition.type.Description("Clase que mantiene la gestión de auditoría")
public class Auditoria implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "AUDITORIA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @org.kie.api.definition.type.Description("PK de la tabla de auditoria")
   @org.kie.api.definition.type.Label("idaudito")
   @javax.persistence.SequenceGenerator(name = "AUDITORIA_ID_GENERATOR", initialValue = 1, sequenceName = "AUDITORIA_ID_SEQ")
   @javax.persistence.Column(name = "IDAUDITO")
   private int idaudito;

   @org.kie.api.definition.type.Label("idwebusu")
   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.TABLE)
   @javax.persistence.Column(name = "IDWEBUSU")
   private int idwebusu;

   @org.kie.api.definition.type.Label("idproced")
   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.TABLE)
   @javax.persistence.Column(name = "IDPROCED")
   private int idproced;

   public Auditoria()
   {
   }

   public int getIdaudito()
   {
      return this.idaudito;
   }

   public void setIdaudito(int idaudito)
   {
      this.idaudito = idaudito;
   }

   public int getIdwebusu()
   {
      return this.idwebusu;
   }

   public void setIdwebusu(int idwebusu)
   {
      this.idwebusu = idwebusu;
   }

   public int getIdproced()
   {
      return this.idproced;
   }

   public void setIdproced(int idproced)
   {
      this.idproced = idproced;
   }

   public Auditoria(int idaudito, int idwebusu, int idproced)
   {
      this.idaudito = idaudito;
      this.idwebusu = idwebusu;
      this.idproced = idproced;
   }
   
   public void main (String[ ] arg) {
      System.out.println("Hola Java");
      }

}