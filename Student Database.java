<a href="add.jsp">Add Student</a> | <a href="view.jsp">View Students</a>
<form action="Add" method="post">
  Name: <input name="name">
  Email: <input name="email">
  <button>Add</button>
</form>
<%@ page import="java.sql.*" %>
<table>
<%
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
  ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
  while(rs.next()) {
%>
<tr>
  <td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td>
  <td><a href="Delete?id=<%=rs.getInt(1)%>">Delete</a></td>
</tr>
<% } %>
</table>
@WebServlet(\"/Add\")
public class Add extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    String name = req.getParameter(\"name\"), email = req.getParameter(\"email\");
    try {
      Connection con = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/test\", \"root\", \"\");
      PreparedStatement ps = con.prepareStatement(\"INSERT INTO students(name, email) VALUES(?,?)\");
      ps.setString(1, name); ps.setString(2, email); ps.executeUpdate();
      res.sendRedirect(\"view.jsp\");
    } catch(Exception e) { res.getWriter().println(e); }
  }
}
@WebServlet(\"/Delete\")
public class Delete extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    int id = Integer.parseInt(req.getParameter(\"id\"));
    try {
      Connection con = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/test\", \"root\", \"\");
      PreparedStatement ps = con.prepareStatement(\"DELETE FROM students WHERE id=?\");
      ps.setInt(1, id); ps.executeUpdate();
      res.sendRedirect(\"view.jsp\");
    } catch(Exception e) { res.getWriter().println(e); }
  }
}
CREATE TABLE students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), email VARCHAR(100));
