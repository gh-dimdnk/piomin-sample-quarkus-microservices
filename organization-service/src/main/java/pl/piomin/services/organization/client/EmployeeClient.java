package pl.piomin.services.organization.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import pl.piomin.services.organization.model.Employee;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Path("/employees")
@RegisterRestClient(configKey = "employee")
public interface EmployeeClient {

    @GET
    @Path("/organization/{organizationId}")
    @Produces(MediaType.APPLICATION_JSON)
    List<Employee> findByOrganization(@PathParam("organizationId") Long organizationId);

}
