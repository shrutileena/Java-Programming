package register;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class Register extends HttpServlet {

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		try (PrintWriter out = resp.getWriter()) {
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<title>Register Page</title>");
//			out.println("</head>");
//			out.println("<body>");

			String name = req.getParameter("user_name");
			String password = req.getParameter("password");
			String email = req.getParameter("email");
			Part part = req.getPart("image");
			String filename = part.getSubmittedFileName();
//			out.println(filename);

			try {
				Thread.sleep(3000);
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletjsp", "root", "Q!w2e3r4");
			
				String query = "insert into user (name, password, email, imageName) values (?, ?, ?, ?)";
				
				PreparedStatement statement = con.prepareStatement(query);
				statement.setString(1, name);
				statement.setString(2, password);
				statement.setString(3, email);
				statement.setString(4, filename);
				
				statement.executeUpdate();
				
				InputStream inputStream = part.getInputStream();
				byte[] data = new byte[inputStream.available()];
				inputStream.read(data);
				
				String path = "D:\\Eclipse\\workspace\\register\\src\\main\\webapp\\img\\"+filename;
				File file = new File(path);
				file.createNewFile();
				
				OutputStream os = new FileOutputStream(file);
				os.write(data);
				os.close();
				
				out.println("done");
			
			} catch (Exception e) {
				e.printStackTrace();
				out.println("error");
			}

//			out.println("<h1></h1>");
//			out.println("</body>");
//			out.println("</html>");

		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}

}
