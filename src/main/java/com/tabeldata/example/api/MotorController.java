package com.tabeldata.example.api;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.tabeldata.example.entity.Motor;

@Path("/motor")
public class MotorController {
	
	@GET
	@Path("/pusat")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMotors() {
		return "PT. Suzuki Indomobil Motor";
	}
	
	
	@GET
	@Path("/cabang")
	@Produces(MediaType.TEXT_PLAIN)
	public String putMotors(
			@QueryParam("data") String data, 
			@QueryParam("data1") String data1) {
		return "PT. Suzuki Indomobil Motor cabang "+ data + " : " + data1;
	}
	
	@GET
	@Path("/anak")
	@Produces(MediaType.APPLICATION_JSON)
	public Motor patchMotors() {
		Motor suzuki = new Motor("Suzuki GSX 150 R", "Aplikasi Showroom");		
		return suzuki;
	}
	
	@POST
	@Path("/post")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Motor postMotor(Motor motor) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(motor);
		em.getTransaction().commit();
		em.close();
		emf.close();
		return motor;
	}
}
