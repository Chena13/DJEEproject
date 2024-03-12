package BD;

import Configuration.AppConfig;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

@Path("/Dj-management")
public class DjController {

	private DiskJockeyDAO diskJockeyDAO = new DiskJockeyDAOImpl();
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hello")
	public String hello(@Context HttpServletRequest req) {
		HttpSession session = req.getSession();
		int count = session.getAttribute("count") == null ? 0 : (int) session.getAttribute("count");

		count++;
		session.setAttribute("count", count);
		return "Hello World! -> " + count;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/diskjockey")
	public String getBooks(@QueryParam("title") String title) {

		List<DiskJockey> djs = null;
		djs = diskJockeyDAO.findByAll();
		/*if (title != null) {
			djs = bookDAO.findbyTitle(title);
		} else {
			djs = bookDAO.findByAll();
		}
		 */
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		String json = gson.toJson(djs);
		return json;
	}

}