package com.javaservlet.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/", "/login", "/home"})
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String path = req.getServletPath();

        if (path.equals("/home")) {
            // Hiển thị trang Home
            req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
        } else {
            // Mặc định cho / và /login -> Hiển thị trang Login
            req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String path = req.getServletPath();

        if (path.equals("/login")) {
            // 1. Lấy dữ liệu từ form submit (Username/Password)
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            // 2. Yêu cầu của anh: System.out.println
            System.out.println("---[ Login API Request ]---");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("---------------------------");

            // 3. Tạm thời giả lập đăng nhập thành công (Sau này sẽ gọi DB)
            if (username != null && !username.isEmpty()) {
                // Tạo session để đánh dấu đã đăng nhập
                HttpSession session = req.getSession();
                session.setAttribute("userLogged", username);

                // 4. Yêu cầu của anh: Hiển thị trang home
                resp.sendRedirect("home");
            } else {
                // Đăng nhập thất bại, quay về login
                resp.sendRedirect("login?error=true");
            }
        }
    }
}