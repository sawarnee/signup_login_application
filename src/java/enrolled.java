import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

public class enrolled extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        RequestDispatcher disp;
        
            String fname=request.getParameter("First_Name");
            
            String lname=request.getParameter("Last_Name");

            String date=request.getParameter("date1");
            Date dob=new SimpleDateFormat("yyyy-MM-dd").parse(date);
            
            String email=request.getParameter("Email_Id");
            
            long phone=Long.parseLong(request.getParameter("Mobile_Number"));
            
            char gender=request.getParameter("Gender").charAt(0);
            
            String address=request.getParameter("Address");
            
            String city=request.getParameter("City");
            
            long pincode=Long.parseLong(request.getParameter("Pin_Code"));
            
            String state=request.getParameter("State");

            String country=request.getParameter("Country");
            
            String password = request.getParameter("password");
            
            
//            if(password == "a")
//            {
////                response.sendRedirect("error.html");
////                disp.forward(request, response);
//                out.println("nono");
//            }
//            else
//            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?kaka","kaka","kaka");
                    PreparedStatement pst=con.prepareStatement("insert into registration values (?,?,?,?,?,?,?,?,?,?,?,?)");

                    pst.setString(1, fname);
                    pst.setString(2, lname);

                    java.sql.Date d=new java.sql.Date(dob.getTime());
                    pst.setDate(3, d);

                    pst.setString(4, email);
                    pst.setLong(5, phone);
                    pst.setString(6, gender+"");
                    pst.setString(7, address);
                    pst.setString(8, city);
                    pst.setLong(9, pincode);
                    pst.setString(10, state);
                    pst.setString(11, country);

                    pst.setString(12, password);

                    pst.executeUpdate();
                    con.close();
                    pst.close();

                    out.println("<center><br><br><h3>USER REGISTERED SUCCESSFULLY</h1></center>");
                    disp = request.getRequestDispatcher("index.html");
                    disp.include(request, response);
    //                HttpSession session = request.getSession();
    //                session.setAttribute("id", email);
    //                session.setAttribute("name", fname+" "+lname);
    //                disp.include(request, response);

                }
                catch(Exception e)
                {
                    out.println("error : "+e);
                }
//            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(enrolled.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(enrolled.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
